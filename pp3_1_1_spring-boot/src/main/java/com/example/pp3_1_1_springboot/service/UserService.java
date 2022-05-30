package com.example.pp3_1_1_springboot.service;

import com.example.pp3_1_1_springboot.models.User;

import java.util.List;

public interface UserService {
    void addUser(User user);

    List<User> getAllUsers();

    void deleteUser(long id);

    User getUser (long id);
}
