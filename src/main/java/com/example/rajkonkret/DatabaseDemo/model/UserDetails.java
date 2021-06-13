package com.example.rajkonkret.DatabaseDemo.model;

import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.apache.catalina.User;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class UserDetails {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private  Integer id;
    private String address;

//    @OneToOne(mappedBy = "userDetails")
//    private User1 user;

}
