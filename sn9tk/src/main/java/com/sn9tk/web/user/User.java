package com.sn9tk.web.user;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class User {
	private String name, userid, passwd, ssn, addr,
						profile, email, phoneNumber, registerDate;
	
	@Override
	public String toString() {
		return String.format("%s, %s, %s, %s, %s", userid,passwd,name,ssn,addr);
	}
}
