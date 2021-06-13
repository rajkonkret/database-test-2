package com.example.rajkonkret.DatabaseDemo.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "users")
@Entity
@Data
@NoArgsConstructor
public class User1 {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @Column(name = "user_name")
    private String username;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "userDetails_id")
//    private UserDetails userDetails;
}
