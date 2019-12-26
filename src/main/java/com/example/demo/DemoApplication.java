package com.example.demo;

import com.example.demo.services.UserService;
import com.example.demo.services.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class DemoApplication {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    @ResponseBody
    String home(){
        User user = null;
        return "Hello " + userService.getUsername(user) + ". How are you my dear friend?";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
