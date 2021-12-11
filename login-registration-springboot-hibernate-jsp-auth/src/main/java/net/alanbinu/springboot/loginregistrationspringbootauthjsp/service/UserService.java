package net.alanbinu.springboot.loginregistrationspringbootauthjsp.service;

import net.alanbinu.springboot.loginregistrationspringbootauthjsp.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
