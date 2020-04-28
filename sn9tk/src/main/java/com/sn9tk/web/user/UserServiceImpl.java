package com.sn9tk.web.user;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.JOptionPane;

import java.util.Set;

import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService{
	private static final String File_PAHT = null;
	public Map<String, Object> map; //생긴건 이렇지만 배열임 여기 안에 엔트리배열이 있는거임
	public UserServiceImpl() {
		map = new HashMap<>(); //map이지만 HashMap으로 선언할 것
	}
	@Override
	public void add(User user) {
		map.put(user.getUserid(), user);
	}
	@Override
	public int count() {
		return map.size();
	}
	@Override
	public User login(User user) {
		User returnUser = null;
		if(map.containsKey(user.getUserid())) {
			User u = detail(user.getUserid());
			if(user.getPasswd().equals(u.getPasswd())) {
				returnUser = u;
			}
		}
		return returnUser;
	}
	@Override
	public User detail(String userid) {
		System.out.println("서비스 디테일에 들어온 아이디:" + userid);
		User t = (User) map.get(userid);
		System.out.println("ddddddddddddddddddddd");
		return t;
	}
	@Override
	public boolean update(User user) {
		map.replace(user.getUserid(), user);
		return true;
	}
	@Override
	public boolean remove(String userid) {
		map.remove(userid);
		return true;
	}
	@Override
	public List<User> list() {
		List<User> list = new ArrayList<>();
		@SuppressWarnings("rawtypes")
		Set set = map.entrySet();
		@SuppressWarnings("rawtypes")
		Iterator it = set.iterator();
		while (it.hasNext()) {
			@SuppressWarnings("unchecked")
			Map.Entry<String, User> e = (Entry<String, User>) it.next();
			list.add(e.getValue());
		}
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		return list;
	}
	@Override
	public void saveFile(User user) {
		return;
	}
	
	@Override
	public List<User> readFile() {
		List<User> userlist = new ArrayList<>();
		List<String> list = new ArrayList<>();
		try {
			File file = new File(File_PAHT+"lisr.txt");
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String message = "";
					while((message =  reader.readLine()) != null) {
						list.add(message);
					}
					reader.close();
		} catch(Exception e) {
			System.out.println("파일 입력 시 에러 발생");
		}
		User u = null;
		for(int i =0; i<list.size(); i++) {
			u = new User();
			String[]arr = list.get(i).split(",");
			u.setUserid(arr[0]);
			u.setPasswd(arr[1]);
			u.setName(arr[2]);
			u.setSsn(arr[3]);
			u.setAddr(arr[4]);
			userlist.add(u);
		}
		return userlist;
	}
	@Override
	public boolean overlap(String userid) {
		boolean idOverlap = true;
		List<User> list = readFile();
		for(int i=0; i<list.size(); i++) {
			if(userid.equals(list.get(i).getUserid())) {
				idOverlap = false;
				break;
			}
		}
		return false;
	}
	
	
	
	}

