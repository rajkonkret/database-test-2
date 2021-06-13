package com.example.rajkonkret.DatabaseDemo.repository;

import com.example.rajkonkret.DatabaseDemo.model.User1;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User1, Integer> {


}
