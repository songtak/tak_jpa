package com.sn9tk.web.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
	@Autowired UserDao userDao;

	@Override
	public List<User> findAll() {
		return userDao.selectAll();
	}

}
