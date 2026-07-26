package com.nilu.LoginAPI.service;

import com.nilu.LoginAPI.DTO.UserDto;
import com.nilu.LoginAPI.models.User;
import com.nilu.LoginAPI.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    private LoginRepository loginRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public String login(UserDto dto){

        User user = loginRepository.findByEmail(dto.getEmail())
                .orElseThrow(()->new RuntimeException(" user not found"));

        if(passwordEncoder.matches(dto.getPassword() , user.getPassword())){
            throw  new RuntimeException("Invalid password");
        }
        return "JWT_TOKENS";
    }
}
