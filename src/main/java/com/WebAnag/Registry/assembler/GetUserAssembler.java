package com.WebAnag.Registry.assembler;

import com.WebAnag.Registry.model.Users;

import java.util.List;
import java.util.stream.Collectors;

public class GetUserAssembler {


    public List<Users> getUsers(List<Users> users) {

        return users.stream().map(user1 -> new Users()
                .setId(user1.getId())
                .setUsername(user1.getUsername())
                .setPassword(user1.getPassword()))
                .collect(Collectors.toList());

    }
}
