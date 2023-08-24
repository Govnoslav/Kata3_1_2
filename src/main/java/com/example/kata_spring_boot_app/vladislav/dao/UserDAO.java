package com.example.kata_spring_boot_app.vladislav.dao;

import com.example.kata_spring_boot_app.vladislav.entity.User;

import java.util.List;

public interface UserDAO {

    void createUser(User user);
    List<User> findAllUsers();


    User findUserById(Long id);

    void deleteUserById(Long id);

    void updateUser(User user);
}
