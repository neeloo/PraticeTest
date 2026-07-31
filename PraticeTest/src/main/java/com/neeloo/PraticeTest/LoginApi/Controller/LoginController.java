package com.neeloo.PraticeTest.LoginApi.Controller;

import com.neeloo.PraticeTest.LoginApi.Service.LoginService;
import com.neeloo.PraticeTest.LoginApi.model.LoginUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController /// Used to create REST APIs.
@RequestMapping("/api")  /// used to Maps a URL to a controller or method.
public class LoginController {

    @Autowired
    private LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginUser user) {

        boolean result = loginService.login(user.getUserName(), user.getPassword());

        if (result) {
            return ResponseEntity.ok("Login Successful");
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                .body("Invalid Username or Password");
    }

}
