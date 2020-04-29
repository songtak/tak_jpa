package com.sn9tk.web.admin;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sn9tk.web.util.Data;

@Repository
public class AdminDaoImpl implements AdminDao{

	@Override
	public void insert(Admin admin) {
			try { 
				BufferedWriter writer = new BufferedWriter(
													 new FileWriter(
													 new File(Data.ADMIN_PATH.toString()+Data.LIST+Data.CSV), true));
				writer.write(admin.toString());
				writer.newLine();
				writer.flush();
			} catch(Exception e) {
				
			}
	}

	@Override
	public List<Admin> selectAll() {
		List<Admin> list = null;
		try {
			
		} catch(Exception e) {
			
		}
		return list;
	}

	@Override
	public Admin slectOne(String employNumber) {
		Admin admin = null;
		try {
			
		} catch(Exception e) {
			
		}
		return admin;
	}

	@Override
	public void update(Admin admin) {
		try {
			
		} catch(Exception e) {
			
		}
	}

	@Override
	public void delete(Admin admin) {
		try {
			
		} catch(Exception e) {
			
		}
	}

}
