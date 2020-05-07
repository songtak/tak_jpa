package com.sn9tk.web.user;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sn9tk.web.util.Data;
import com.sn9tk.web.util.Messenger;

@Repository
public class UserDaoImpl implements UserDao{

	@Override
	public List<User> selectAll() {
		List<User> list = new ArrayList<>();
		List<String> temp = new ArrayList<>();
		try {
			File file = new File(Data.USER_LIST.toString());
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String message = "";
			while ((message = reader.readLine())!=null) {
				temp.add(message);
			}
			reader.close();
		}catch(Exception e) {
			System.out.println("파일읽기 에러");
		}
		User u =null;
		for(int i=0; i<temp.size();i++) {
			u = new User();
			String[] arr = temp.get(i).split(",");
			u.setUserid(arr[0]);
			u.setName(arr[2]);
			u.setSsn(arr[3]);
			u.setEmail(arr[6]);
			u.setPhoneNumber(arr[7]);
			u.setRegisterDate(arr[8]);
			list.add(u);
		}
		return list;
	}

}

