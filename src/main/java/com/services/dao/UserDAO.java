package com.services.dao;

import org.springframework.stereotype.Repository;

import com.services.domain.User;

@Repository("userDAO")
public class UserDAO {

    public String getUsername(User user){
        return "Albert Einstein";
    }

}
