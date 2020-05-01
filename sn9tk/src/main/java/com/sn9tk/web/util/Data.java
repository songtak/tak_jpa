package com.sn9tk.web.util;

import java.io.File;

public enum Data {
	USER_PATH, ADMIN_PATH, CSV, LIST;
	// C:\Users\bit\git\repository2\occamsrazor-1\src\main\resources\static\admin
	@Override
	public String toString() {
		String returnValue = "";
		switch(this) {
		case USER_PATH: returnValue = "C:"+File.separator+"User"+File.separator+"sbit"+File.separator
							+"spring-workspace"+File.separator+"occamsrazor"+File.separator
							+"src"+File.separator+"main"+File.separator+"resources"+File.separator+"static"
							+File.separator+"user"+File.separator; break;
		case ADMIN_PATH: returnValue =	"C:"+File.separator+"Users"+File.separator+"bit-6"+File.separator+"git"+File.separator
				+"repository"+File.separator+"sn9tk"+File.separator+"src"+File.separator+"main"+File.separator+"resources"
				+File.separator+"static"+File.separator+"admin"+File.separator; break;
		case CSV: returnValue = ".csv";break;
		case LIST: returnValue = "list";break;
		default:
			break;
		}
		return returnValue;
	}
}