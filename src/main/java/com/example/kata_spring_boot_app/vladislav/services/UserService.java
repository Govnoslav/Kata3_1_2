package com.example.kata_spring_boot_app.vladislav.services;

import com.example.kata_spring_boot_app.vladislav.dao.UserDAO;
import com.example.kata_spring_boot_app.vladislav.entity.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional(readOnly = true)
public interface UserService {
    @Transactional
    void createUser(User user);

    List<User> findAllUsers();

    public User findUserById(Long id);
    @Transactional
    public void deleteUserById(Long id);
    @Transactional
    public void updateUser(User user);
}
