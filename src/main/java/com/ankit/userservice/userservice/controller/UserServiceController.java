package com.ankit.userservice.userservice.controller;

import com.ankit.userservice.userservice.model.User;
import com.ankit.userservice.userservice.service.IUserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserServiceController {

    @Autowired
    private IUserDataService userDataService;

    @GetMapping("/getUserById/{userId}")
    public ResponseEntity<User> getUserById(@PathVariable("userId") String userId) {
        return new ResponseEntity<>(userDataService.getUserById(userId), HttpStatus.OK);
    }

    @GetMapping("/getAllUsers")
    public ResponseEntity<List<User>> getAllUsers() {
        return new ResponseEntity<>(userDataService.getAllUsers(), HttpStatus.OK);
    }

}
