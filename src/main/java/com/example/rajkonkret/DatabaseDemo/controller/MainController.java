package com.example.rajkonkret.DatabaseDemo.controller;


import com.example.rajkonkret.DatabaseDemo.UserService;
import com.example.rajkonkret.DatabaseDemo.model.User1;
import com.example.rajkonkret.DatabaseDemo.model.UserDto;
import com.example.rajkonkret.DatabaseDemo.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
public class MainController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    public MainController(UserRepository userRepository, UserService userService) {
        this.userRepository = userRepository;
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<UserDto> findAllUsers() {
        return userService.findAllUser();
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/users/add")
    public User1 addUser(@RequestBody User1 user) {
        return userRepository.save(user);
    }

    @ResponseStatus(HttpStatus.ACCEPTED)
    @DeleteMapping("/users/delete/{id}")
    public void deleteUsers(@PathVariable Integer id) {
        userRepository.deleteById(id);
    }

    @PutMapping("/users/put/{id}")
    public void updateUser(@RequestBody User1 user, @PathVariable Integer id) {
        Optional<User1> userTemp = userRepository.findById(id);
        if (userTemp.isPresent()) {

            userTemp.get().setUsername(user.getUsername());
            System.out.println(userRepository.findById(id).get().getUsername());
            userRepository.save(userTemp.get());

        } else {
            System.out.println("nie ma takiego usera");
        }
    }
}
