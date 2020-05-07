package com.sn9tk.web.admin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sn9tk.web.util.Data;
import com.sn9tk.web.util.Messenger;

@Repository
public class AdminDaoImpl implements AdminDao{
	@Autowired AdminDao adminDao;

	@Override
	public void insert(Admin admin) {
		System.out.println("2. AdminDaoImpl insert "+admin);
		admin.setEmployNumber(createEmployNumber());
		admin.setPasswd("1");
		admin.setRegisterDate(createCurrentDate());
	   adminDao.insert(admin);
	}
		

	private String createCurrentDate() {
		String startNum = "";
		for(int i=0;i < 4;i++) {
			startNum += String.valueOf((int)(Math.random()*10));
		}
		return startNum;
	}

	private String createEmployNumber() {
		return null;
	}


	@Override
	public List<Admin> selectAll() {
		List<Admin> list = new ArrayList<>();
		List<String> temp = new ArrayList<>();
		try {
			File file = new File(Data.ADMIN_LIST.toString());
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String message = "";
			while((message = reader.readLine())!=null) {
				temp.add(message);
			}
			reader.close();
		}catch(Exception e) {
			System.out.println(Messenger.FILE_READ_ERROR);
		}
		Admin a=null;
		for(int i=0; i<temp.size(); i++) {
			a = new Admin();
			String[] arr = temp.get(i).split(",");
			a.setEmployNumber(arr[0]);
			a.setPasswd(arr[1]);
			a.setName(arr[2]);
			a.setPosition(arr[3]);
			a.setProfile(arr [4]);
			a.setEmail(arr [5]);
			a.setPhoneNumber(arr[6]);
			a.setRegisterDate(arr [7]);	
			list.add(a);
		}
		return list;
	}

	@Override
	public Admin selectOne(String employNumber) {
		Admin admin = null;
		try {
			
		}catch(Exception e) {
			
		}
		return null;
	}

	@Override
	public void update(Admin admin) {
		try {
			
		}catch(Exception e) {
			
		}
		
	}

	@Override
	public void delete(Admin admin) {
		try {
			
		}catch(Exception e) {
			
		}
		
	}

}
