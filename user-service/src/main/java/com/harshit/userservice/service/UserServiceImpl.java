package com.harshit.userservice.service;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.harshit.userservice.dao.UserDao;
import com.harshit.userservice.model.User;
import com.harshit.userservice.shared.UserRequestModel;
import com.harshit.userservice.shared.UserResponseModel;

@Service
@Transactional
public class UserServiceImpl  implements UserService{
    private UserDao userDao;

    private ModelMapper modelMapper;

    public UserServiceImpl(UserDao userDao, ModelMapper modelMapper) {
        this.userDao = userDao;
        this.modelMapper = modelMapper;
    }

    public boolean isValid(String userName, String password) {

    	Optional<User> userData=userDao.findByUserName(userName);
		if (!userData.isPresent())
			return false;
		
		if (password.equals(userData.get().getPassword())) {	
			return true;
			
		}
		else
			return false;
	}
    
    @Override
    public UserResponseModel createNewUser(UserRequestModel userRequestModel) {
       

        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        User user=userDao.save(modelMapper.map(userRequestModel,User.class));
        return modelMapper.map(user,UserResponseModel.class);

    }

    @Override
    public List<UserResponseModel> getAllUsers() {

        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        Type listType = new TypeToken<List<UserResponseModel>>(){}.getType();
        List<UserResponseModel> postDtoList = modelMapper.map(userDao.findAll(),listType);
        return postDtoList;
    }

    @Override
    public UserResponseModel findByUserName(String userName) {
       User user=userDao.findByUserName(userName).get();
       modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
       return modelMapper.map(user, UserResponseModel.class);
    }

	@Override
	public String getType(String userName) {
		User userData=userDao.findByUserName(userName).get();
		return userData.getUserType();
	}
}
