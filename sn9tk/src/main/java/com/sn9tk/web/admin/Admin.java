package com.sn9tk.web.admin;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Admin {
	private String  employNumber, passwd ,name , 
	position, profile, email, phoneNumber, 
	registerDate;
	
}
