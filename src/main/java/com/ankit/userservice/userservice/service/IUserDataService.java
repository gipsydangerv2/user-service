package com.ankit.userservice.userservice.service;

import com.ankit.userservice.userservice.model.User;

import java.util.List;

public interface IUserDataService {
    User getUserById(String userId);

    List<User> getAllUsers();
}
