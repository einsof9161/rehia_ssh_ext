package com.nox.rehia.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nox.rehia.dao.UserDao;
import com.nox.rehia.domain.User;

@Service
public class UserServiceImpl implements UserServices{
	@Autowired
	private UserDao userDao;

	public User selectUserById(Integer userId) {
		return userDao.selectUserById(userId);
		
	}

}