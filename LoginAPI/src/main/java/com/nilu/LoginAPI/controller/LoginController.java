package com.nilu.LoginAPI.controller;

import com.nilu.LoginAPI.DTO.UserDto;
import com.nilu.LoginAPI.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public String login( @RequestBody  UserDto dto){
        return loginService.login(dto);
    }
}
