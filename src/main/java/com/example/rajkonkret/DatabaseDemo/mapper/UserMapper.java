package com.example.rajkonkret.DatabaseDemo.mapper;

import com.example.rajkonkret.DatabaseDemo.model.User1;
import com.example.rajkonkret.DatabaseDemo.model.UserDto;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public static UserDto mapToDto(User1 user) {
        UserDto userDto = new UserDto();

        userDto.setId(user.getId());
        userDto.setUsername(user.getUsername());
//        userDto.setUserDetailsId(UserDetailsMapper.mapToUserDetailsDto(user.getUserDetails()).getUserId());
//        userDto.setAddress(UserDetailsMapper.mapToUserDetailsDto(user.getUserDetails()).getAddress());
        //userDto.setUserDetails(user.getUserDetails());

        return userDto;
    }
}
