package com.WebAnag.Registry.service;

import com.WebAnag.Registry.model.Users;
import com.WebAnag.Registry.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public void saveUser(Users user) {
        usersRepository.save(user);
    }

    @Override
    public List<Users> getAll() {
        return usersRepository.findAll();
    }
}
