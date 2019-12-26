package com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.services.dao.UserDAO;
import com.services.domain.User;

@Service("userService")
public class UserService {

    @Autowired
    private UserDAO userDAO;

    public String getUsername(User user) {
        return userDAO.getUsername(user);
    }
}
