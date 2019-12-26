package com.example.demo.services;

import com.example.demo.services.dao.UserDAO;
import com.example.demo.services.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {

    @Autowired
    private UserDAO userDAO;

    public String getUsername(User user) {
        return userDAO.getUsername(user);
    }
}
