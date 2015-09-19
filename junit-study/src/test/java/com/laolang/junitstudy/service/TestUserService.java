package com.laolang.junitstudy.service;

import org.junit.Before;
import org.junit.Test;

import com.laolang.junitstudy.model.User;
import com.laolang.junitstudy.model.UserException;

import static org.junit.Assert.*;

public class TestUserService {

	private IUserService userservice;
	private User baseUser;

	private void assertUserEquals(User user, User testuser) {
		assertEquals(user.getUsername(), testuser.getUsername());
		assertEquals(user.getNickname(), testuser.getNickname());
		assertEquals(user.getPassword(), testuser.getPassword());
	}

	@Before
	public void setUp() {
		// 初始化
		userservice = new UserServiceByMap();
		baseUser = new User("老狼", "laolang", "123");
	}

	@Test
	public void testAdd() {
		userservice.add(baseUser);

		User testuser = userservice.load("laolang");
		assertNotNull(testuser);

		assertUserEquals(testuser, baseUser);
		// fail("加入-- testAdd -- 代码");
	}

	@Test(expected = UserException.class)
	public void testAddExistUserName() {
		userservice.add(baseUser);
		User testuser = new User("老狼", "laolang", "123");
		userservice.add(testuser);

		// fail("加入-- testAddExistUserName -- 代码");
	}

	@Test
	public void testDelete() {
		userservice.add(baseUser);
		User testuser = userservice.load(baseUser.getUsername());
		assertNotNull(testuser);
		userservice.delete(baseUser.getUsername());
		testuser = userservice.load(baseUser.getUsername());
		assertNull("删除的用户还存在", testuser);

		// fail("加入-- testDelete -- 代码");
	}

	@Test
	public void testLogin() {

		userservice.add(baseUser);
		String username = "laolang";
		String password = "123";

		User testuser = userservice.login(username, password);
		assertUserEquals(baseUser, testuser);

		// fail("加入-- testLogin -- 代码");
	}

	@Test(expected = UserException.class)
	public void testNotExistUserLogin() {
		userservice.add(baseUser);
		String username = "laolang0";
		String password = "123";
		userservice.login(username, password);
		// fail("加入-- testNotExistUserLogin -- 代码");
	}

	@Test(expected = UserException.class)
	public void testPasswordErrorUserLogin() {
		userservice.add(baseUser);
		String username = "laolang";
		String password = "1230";
		userservice.login(username, password);
		// fail("加入-- testPasswordErrorUserLogin -- 代码");
	}
}
