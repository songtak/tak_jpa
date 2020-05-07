package com.sn9tk.web.user;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public interface UserDao {

	public List<User> selectAll();
	}


