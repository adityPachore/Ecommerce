package com.wu.ecommerce.service;

import java.sql.SQLException;
import java.util.Optional;

import com.wu.ecommerce.dto.User;
import com.wu.ecommerce.repo.UserRepository;
import com.wu.ecommerce.repo.UserRepositoryImpl;

public class UserServiceImpl implements UserService {
	
	private UserRepository userRepository = UserRepositoryImpl.getInstance();

	private UserServiceImpl() {
		
	}
	
	private static UserService userService;
	public static UserService getInstance() {
		if(userService == null)
		{
			userService = new UserServiceImpl();
		}
		return userService;
	}
	
	
	public User addUser(User user) throws SQLException {
		// TODO Auto-generated method stub
		return userRepository.addUser(user);
	}

	public User getEmployeeByUserId(String id) throws Exception {
		// TODO Auto-generated method stub
		return userRepository.getUserByUserId(id);
	}

	public Optional<User[]> getUsers() {
		// TODO Auto-generated method stub
		return userRepository.getUsers();
	}

	public Optional<User[]> getAllUsersByAddress(String cat) {
		// TODO Auto-generated method stub
		return null;
	}

	public String removeUserByUserId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public User updateUserByUserId(String id, User user) {
		// TODO Auto-generated method stub
		return null;
	}

}