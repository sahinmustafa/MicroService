package com.my.accountserver.controller.user;

import com.my.accountserver.domain.user.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/")
    public List<User> users(){
        return Arrays.asList(new User("mustafa"), new User("sahin"), new User("hasan"));
    }

}
