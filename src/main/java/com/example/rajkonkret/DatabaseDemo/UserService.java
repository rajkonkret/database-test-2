package com.example.rajkonkret.DatabaseDemo;

import com.example.rajkonkret.DatabaseDemo.mapper.UserMapper;
import com.example.rajkonkret.DatabaseDemo.model.User1;
import com.example.rajkonkret.DatabaseDemo.model.UserDto;
import com.example.rajkonkret.DatabaseDemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserDto> findAllUser() {
        List<UserDto> userDtos = new ArrayList<>();
        Iterable<User1> users = userRepository.findAll();
        users.forEach(u -> {
            userDtos.add(UserMapper.mapToDto(u));

        });

        return userDtos;

    }
}
