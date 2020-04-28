package com.sn9tk.web.user;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
public class User {
	public String name, userid, passwd, ssn, addr;
	@Override
	public String toString() {
		return String.format("%s, %s, %s, %s, %s", userid,passwd,name,ssn, addr);
		
	}

}
