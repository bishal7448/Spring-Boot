package org.example.restAPIs;

import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class API {
    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login() {
        userService.logIn();
        return "Logged in successfully";
    }

    @GetMapping("/logout")
    public String logout() {
        try {
            userService.logOut();
        } catch (Exception e){
            e.printStackTrace();
        }
        return "Logout successfully";
    }
    
}
