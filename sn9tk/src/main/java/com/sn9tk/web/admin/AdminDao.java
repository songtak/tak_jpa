package com.sn9tk.web.admin;

import java.util.List;

public interface AdminDao {

	public void insert(Admin admin);
	public List<Admin> selectAll();
	public Admin slectOne(String employNumber);
	public void update(Admin admin);
	public void delete(Admin admin);

}
