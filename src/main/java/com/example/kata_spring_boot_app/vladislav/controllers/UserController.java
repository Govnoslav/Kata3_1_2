package com.example.kata_spring_boot_app.vladislav.controllers;

import com.example.kata_spring_boot_app.vladislav.entity.User;
import com.example.kata_spring_boot_app.vladislav.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    private final UserServiceImpl userServiceImpl;
    @Autowired
    public UserController(UserServiceImpl userServiceImpl) {
        this.userServiceImpl = userServiceImpl;
    }

    @GetMapping
    public String getUsers(Model model) {
        List<User> users = userServiceImpl.findAllUsers();
        model.addAttribute("users",users);
        return "users";
    }

    @PostMapping("/new")
    public String createUser(User user) {
        userServiceImpl.createUser(user);
        return "redirect:/users";
    }

    @GetMapping("{id}/delete")
    public String deleteUser(@PathVariable Long id) {
        userServiceImpl.deleteUserById(id);
        return "redirect:/users";
    }

    @GetMapping("/{id}")
    public String updateUserForm(@PathVariable Long id,
                           Model model) {
        User user = userServiceImpl.findUserById(id);
        model.addAttribute("user",user);
        return "usersEdit";
    }

    @PostMapping("/{id}")
    public String updateUser(User user) {
        userServiceImpl.updateUser(user);
        return "redirect:/users";
    }
}
