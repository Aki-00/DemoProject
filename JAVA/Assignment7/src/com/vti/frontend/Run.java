package com.vti.frontend;

import com.vti.entity.file.FileManagement;

public class Run {

	public static void main(String[] args) {
//		FileManagement.isFileExists("C:\\Users\\pc\\Desktop\\Test.txt");
//		
//		try {
//			FileManagement.createFile("C:\\Users\\pc\\Desktop\\Test7.txt");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		try {
//			FileManagement.deleteFile("C:\\Users\\pc\\Desktop\\Test7.txt");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		try {
//			FileManagement.getAllFileName("/Users/Aki");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		try {
			FileManagement.copyFile("C:\\Users\\pc\\Desktop\\Test.txt", "C:\\Users\\pc\\, \"C:\\Users\\pc\\Desktop\\Test4.txt");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}

