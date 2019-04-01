package com.my.eurekaclient.user;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient("http://account-server")
public interface AccountClient {

    @RequestMapping("/users/")
    List<User> users();
}
