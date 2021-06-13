package com.example.rajkonkret.DatabaseDemo;

import com.example.rajkonkret.DatabaseDemo.model.User1;
import com.example.rajkonkret.DatabaseDemo.model.UserDetails;
import com.example.rajkonkret.DatabaseDemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


//@Component
public class UserData implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    public UserData(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        User1 user = new User1();
        user.setUsername("Radek");

        UserDetails userDetails = new UserDetails();
        userDetails.setAddress("lodz ul. jakas 1");

//        user.setUserDetails(userDetails);
        userRepository.save(user);

        User1 user2 = new User1();
        user2.setUsername("Tomek");

        UserDetails userDetails2 = new UserDetails();
        userDetails2.setAddress("lodz ul. jakas 10");

//        user2.setUserDetails(userDetails2);
        userRepository.save(user2);


    }
}
