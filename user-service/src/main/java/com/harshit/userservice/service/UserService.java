package com.harshit.userservice.service;

import java.util.List;

import com.harshit.userservice.shared.UserRequestModel;
import com.harshit.userservice.shared.UserResponseModel;

public interface UserService {
    public UserResponseModel createNewUser(UserRequestModel userRequestModel);
    public List<UserResponseModel> getAllUsers();
    public UserResponseModel findByUserName(String userName) ;
    public boolean isValid(String userName, String password);
    public String getType(String userName);

}
