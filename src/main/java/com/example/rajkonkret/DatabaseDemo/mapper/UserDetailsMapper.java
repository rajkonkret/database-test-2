package com.example.rajkonkret.DatabaseDemo.mapper;

import com.example.rajkonkret.DatabaseDemo.model.UserDetails;
import com.example.rajkonkret.DatabaseDemo.model.UserDetailsDto;
import org.springframework.stereotype.Component;

@Component
public class UserDetailsMapper {
    public static UserDetailsDto mapToUserDetailsDto(UserDetails userDetails) {
        UserDetailsDto userDetailsDto = new UserDetailsDto();
//        userDetailsDto.setUserId(userDetails.getUser().getId());
//        userDetailsDto.setAddress(userDetails.getUser().getUserDetails().getAddress());

        return userDetailsDto;
    }
}
