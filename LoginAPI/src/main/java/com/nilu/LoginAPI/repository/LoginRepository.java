package com.nilu.LoginAPI.repository;

import com.nilu.LoginAPI.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface  LoginRepository  extends JpaRepository<User, Long> {
}
