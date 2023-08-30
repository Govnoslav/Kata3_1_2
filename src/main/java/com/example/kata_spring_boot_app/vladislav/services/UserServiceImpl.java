package com.example.kata_spring_boot_app.vladislav.services;

import com.example.kata_spring_boot_app.vladislav.dao.UserDAO;
import com.example.kata_spring_boot_app.vladislav.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDAO userDAOImpl;
    @Autowired
    public UserServiceImpl(UserDAO userDAOImpl) {
        this.userDAOImpl = userDAOImpl;
    }

    @Override
    public void createUser(User user) {
        userDAOImpl.createUser(user);
    }
    @Override
    public List<User> findAllUsers() {
        return userDAOImpl.findAllUsers();
    }
    @Override
    public User findUserById(Long id) {
        return userDAOImpl.findUserById(id);
    }

    @Override
    public void deleteUserById(Long id) {
        userDAOImpl.deleteUserById(id);
    }

    @Override
    public void updateUser(User user) {
        userDAOImpl.updateUser(user);
    }
}
