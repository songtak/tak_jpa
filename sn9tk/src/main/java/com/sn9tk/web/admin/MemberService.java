package com.sn9tk.web.admin;

public interface MemberService {
	public void add(Admin member);
	public Admin[] list();
	public Admin detail(String userid);
	public int count();
	public boolean login(Admin member);
	public void update(Admin member);
	public void delete(Admin member);
}
