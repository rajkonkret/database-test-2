package com.example.rajkonkret.DatabaseDemo.model;

import lombok.Data;

@Data
public class UserDto {
    private Integer id;
    private String username;
    private Integer userDetailsId;
    private String address;

}
