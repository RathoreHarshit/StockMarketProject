package com.harshit.userservice.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.harshit.userservice.model.User;

@Repository
public interface UserDao extends JpaRepository<User,Integer> {

    public Optional<User> findByUserName(String userName);

}
