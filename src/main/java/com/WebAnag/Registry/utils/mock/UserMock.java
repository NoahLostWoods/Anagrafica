package com.WebAnag.Registry.utils.mock;

import com.WebAnag.Registry.model.Users;

import java.util.Collections;
import java.util.List;

public class UserMock {

    public static List<Users> getUsersMock() {
        Users users = new Users()
                .setId(1)
                .setUsername("Username")
                .setPassword("Password");

        return Collections.singletonList(users);
    }
}
