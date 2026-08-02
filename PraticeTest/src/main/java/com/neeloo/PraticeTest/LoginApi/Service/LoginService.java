package com.neeloo.PraticeTest.LoginApi.Service;

import org.springframework.stereotype.Service;

@Service
public class LoginService {

    private String userName = "admin";
    private String password = "1234";

    public boolean login(String name , String pass){
        return userName.equals(name) && password.equals(pass);

    }
}
