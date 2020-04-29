package com.sn9tk.web.user;

import java.util.List;

import javax.swing.Spring;

public interface UserService {

	public void register(User user);
	public List<User> findAll();
	public User findOne(String userid);
	public void modify(User user);
	public void remove(User user);

}
