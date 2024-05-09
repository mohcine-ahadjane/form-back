package com.intelcia.formback.web;

import com.intelcia.formback.entities.User;
import com.intelcia.formback.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(path = "/api")
public interface UserController {
    @GetMapping(path = "/users")
    public List<User> allUsers();
    @PostMapping(path = "/users")
    public User save(@RequestBody User user);
    @GetMapping(path = "/users/{id}")
    public User getUser(@PathVariable Long id);
    @PutMapping(path = "/users/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user);
    @DeleteMapping(path = "/users/{id}")
    public Long DeleteUser(@PathVariable Long id);
}
