package com.arimka.usersmicroservice.service;

import com.arimka.usersmicroservice.entities.Role;
import com.arimka.usersmicroservice.entities.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    User findUserByUsername (String username);
    Role addRole(Role role);
    User addRoleToUser(String username, String rolename);

    List<User> findAllUsers();
}
