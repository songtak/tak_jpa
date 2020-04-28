package com.sn9tk.web.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class FileTest {
	public final static String File_PAHT = "C:\\Users\\bit-6\\spring-workspace\\bit_Spring\\src\\main\\java\\com\\sn9tk\\web\\member\\";
	public static void main(String[] args) {
		try {
			File file = new File(File_PAHT+"lisr.txt");
			BufferedWriter write = new BufferedWriter(new FileWriter(file,true));
			BufferedReader reader = new BufferedReader(new FileReader(file));
			List<String> list = new ArrayList<>();
			while(true) {
				switch(JOptionPane.showInputDialog("")) {
				case"0": return;
				case"1": 
					String message = JOptionPane.showInputDialog("메세지입력");
					write.write(message);
					write.newLine();
					write.flush();
					return;
				case"2": 
					while((message =  reader.readLine()) != null) {
						list.add(message+"/");
					}
					JOptionPane.showMessageDialog(null, list);
					reader.close();
					return;
				}
			}
		} catch(Exception e) {
			
		}
	}
}
