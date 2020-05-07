package com.sn9tk.web.util;

import java.io.File;

public enum Data {
	 ADMIN_LIST, USER_LIST, LOSS_LIST;
	//C:\Users\bit-6\git\repository\sn9tk\src\main\resources\static\resources\file

	@Override
	public String toString() {
		String path ="C:"+File.separator+"Users"+File.separator+"bit-6"+File.separator
				+"git"+File.separator+"repository"+File.separator+"sn9tk"+File.separator
				+"src"+File.separator+"main"+File.separator+"resources"+File.separator+"static"
				+File.separator+"resources"+File.separator+"file"+File.separator; 
		
		switch(this) {
		case ADMIN_LIST: path= path.concat("admin_list.csv");break;
		case USER_LIST: path= path.concat("user_list.csv");break;
		case LOSS_LIST: path= path.concat("loss_list.csv");break;
		default:
			break;
		}
		return path;
	}
}