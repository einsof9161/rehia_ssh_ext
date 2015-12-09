package com.nox.rehia.dao;

import com.nox.rehia.domain.User;

public interface UserDao {
	/**
	 * 
	 * @author linbingwen
	 * @since 2015年9月28日
	 * @param userId
	 * @return
	 */
	public User selectUserById(Integer userId);

}