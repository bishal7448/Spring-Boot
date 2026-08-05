package org.example.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Getter
    @Setter
    @AllArgsConstructor
    public static class User {
        private String name;
        private int age;
        private String address;
    }

    private User user;

    public UserService() {
        this.user = new User("Bishal Saha", 21, "Jaipur, Rajasthan");
    }

    public void logIn() {
        System.out.println("Logging In...");
    }



    public void logOut() throws Exception{
        System.out.println("Logging Out...");
        throw new Exception("Unable to Logout...");
    }

}
