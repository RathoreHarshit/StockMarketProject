package com.harshit.userservice.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.harshit.userservice.exception.UserNotFoundException;
import com.harshit.userservice.service.UserService;
import com.harshit.userservice.shared.UserRequestModel;
import com.harshit.userservice.shared.UserResponseModel;


@RestController
@Transactional
public class UserController {
    private UserService userService;
    
    public UserController(UserService userService) {
        this.userService = userService; 
    }
	
    @PostMapping("/signup")
    public ResponseEntity<UserResponseModel> createUser(@RequestBody UserRequestModel userRequestModel)
    {
        return new ResponseEntity<UserResponseModel>(userService.createNewUser(userRequestModel), HttpStatus.CREATED);
    }
    
    @GetMapping("/users")
    public ResponseEntity<List<UserResponseModel>> getAllUsers()
    {
        return new ResponseEntity<>(userService.getAllUsers(),HttpStatus.OK);
    }
    
    @GetMapping("/users/{userName}")
    public ResponseEntity<UserResponseModel> getUserByUserId(@PathVariable("userName") String userName) throws UserNotFoundException {
        UserResponseModel userResponseModel=userService.findByUserName(userName);
        if (userResponseModel==null)
        {
            throw new UserNotFoundException("user not found with userName "+ userName);
        }
        return new ResponseEntity<UserResponseModel>(userService.findByUserName(userName),HttpStatus.FOUND);
    }
}
