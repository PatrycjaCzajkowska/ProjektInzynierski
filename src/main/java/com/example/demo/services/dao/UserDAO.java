package com.example.demo.services.dao;

import com.example.demo.services.domain.User;
import org.springframework.stereotype.Repository;

@Repository("userDAO")
public class UserDAO {

    public String getUsername(User user){
        return "Albert Einstein";
    }

}
