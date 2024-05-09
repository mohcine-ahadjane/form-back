package com.intelcia.formback.web;

import com.intelcia.formback.entities.User;
import com.intelcia.formback.services.UserService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController()

public class UserControllerImpl implements UserController{

    private UserService userService;

    public UserControllerImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public List<User> allUsers() {
        return userService.listUsers();
    }

    @Override
    public User save(User user) {
        return userService.save(user);
    }

    @Override
    public User getUser(Long id) {
        return userService.getUser(id);
    }

    @Override
    public User updateUser(Long id, User user) {
        return userService.update(user);
    }

    @Override
    public Long DeleteUser(Long id) {
        return userService.deleteUser(id);
    }
}
