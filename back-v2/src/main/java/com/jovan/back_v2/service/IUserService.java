package com.jovan.back_v2.service;

import java.util.List;

import com.jovan.back_v2.model.User;

public interface IUserService {

	
	User registerUser(User user);
	List<User> getUsers();
	void deleteUser(String email);
	User getUser(String email);
}