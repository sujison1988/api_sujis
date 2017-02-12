package com.businessnote.service;

import com.businessnote.model.User;

import java.util.List;

public interface UserService {
    List<User> findAllUsers();

    void addUser(User user);
}
