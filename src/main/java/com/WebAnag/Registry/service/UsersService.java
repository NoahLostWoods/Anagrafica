package com.WebAnag.Registry.service;

import com.WebAnag.Registry.model.Users;

import java.util.List;

public interface UsersService {
    void saveUser(Users user);
    List<Users> getAll();
}
