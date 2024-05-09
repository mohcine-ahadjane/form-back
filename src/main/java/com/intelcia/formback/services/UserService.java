package com.intelcia.formback.services;

import com.intelcia.formback.entities.User;

import java.util.List;

public interface UserService {
    User save(User user);
    User getUser(Long id);
    User update(User user);
    List<User> listUsers();
    Long deleteUser(Long id);
}
