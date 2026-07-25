package com.nilu.LoginAPI.repository;

import com.nilu.LoginAPI.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

interface  LoginRepository  extends JpaRepository<User, Long> {
}
