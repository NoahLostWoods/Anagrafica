package com.WebAnag.Registry.controller;

import com.WebAnag.Registry.assembler.GetUserAssembler;
import com.WebAnag.Registry.model.Users;
import com.WebAnag.Registry.service.UsersService;
import com.WebAnag.Registry.utils.mock.UserMock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "registry", produces = (MediaType.APPLICATION_JSON_VALUE))
public class UserController {

    @Autowired
    private UsersService usersService;

    @GetMapping("/users")
    public ResponseEntity<List<Users>> getUsers(
            @RequestParam(value = "mock", required = false, defaultValue = "false") Boolean mock
    ) {

        if (Boolean.TRUE.equals(mock)) {
            return ResponseEntity.ok(UserMock.getUsersMock());
        }
        List<Users> tempVar = usersService.getAll();

        GetUserAssembler assembler = new GetUserAssembler();

        return ResponseEntity.ok(assembler.getUsers(tempVar));
    }
}
