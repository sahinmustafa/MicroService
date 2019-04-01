package com.my.eurekaclient.controller;

import com.my.eurekaclient.user.AccountClient;
import com.my.eurekaclient.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    /*private final AccountWebService accountWebService;

    @Autowired
    public UserController(AccountWebService accountWebService) {
        this.accountWebService = accountWebService;
    }

    @GetMapping("/")
    public List<User> all(){
        return accountWebService.allUsers();
    }*/


    private final AccountClient client;

    @Autowired
    public UserController(AccountClient client) {
        this.client = client;
    }

    @GetMapping("/")
    public List<User> all(){
        return client.users();
    }


}
