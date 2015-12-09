package com.nox.rehia.services;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.nox.rehia.domain.User;
import com.nox.rehia.test.SpringTestCase;


/**
 * 功能概要：UserService单元测试
 * 
 * @author linbingwen
 * @since  2015年9月28日 
 */
public class UserServiceTest extends SpringTestCase	{
	@Autowired
	private UserServices userService;
	Logger logger = Logger.getLogger(UserServiceTest.class);
	
	@Test
	public void selectUserByIdTest(){
		User user = userService.selectUserById(10);
        logger.debug("查找结果" + user);
	}
	

}