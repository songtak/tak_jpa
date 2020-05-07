package com.sn9tk.web.loss;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sn9tk.web.admin.AdminDao;
import com.sn9tk.web.util.Data;
import com.sn9tk.web.util.Messenger;

@Repository
public class LossDaoImpl implements LossDao{
	@Autowired AdminDao adminDao;
	
	@Override
	public List<Loss> seletAll() {
		List<Loss> list = new ArrayList<>();
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
		Loss l = null;
		for(int i=0; i<temp.size(); i++) {
			l = new Loss();
			String[] arr = temp.get(i).split(",");
			l.setLossid(arr[0]);
			l.setItem(arr[1]);
			l.setDate(arr[2]);
			l.setCategory(arr[3]);
			l.setLocation(arr [4]);
			list.add(l);
		}
		return list;
	}

	@Override
	public Loss selectOne(String lossid) {
		Loss loss = null;
		try {
			
		}catch(Exception e) {
			
		}
		return loss;
	}
	

}
