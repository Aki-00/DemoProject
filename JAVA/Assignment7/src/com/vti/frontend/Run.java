package com.vti.frontend;

import com.vti.entity.file.FileManagement;

public class Run {

	public static void main(String[] args) {
//		FileManagement.isFileExists("/Users/Aki/Desktop/english lesson");
		
//		try {
//			FileManagement.createFile("/Users/Aki/Desktop/UBM.text");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
//		try {
//			FileManagement.deleteFile("/Users/Aki/Desktop/UBM.text");
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
			FileManagement.copyFile("/Users/Aki/Desktop/UBM.text", "/Users/Aki/Desktop/VTI/UBM.text","/Users/Aki/Desktop/VTI/UBM4.text");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		try {
//			FileManagement.moveFile("/Users/Aki/Desktop/UBM.text", "/Users/Aki/Desktop/VTI/UBM.text")
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		try {
//			FileManagement.renameFile("/Users/Aki/Desktop/VTI/UBM1.text", "/Users/Aki/Desktop/VTI/UBM3.text");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		try {
//			FileManagement.createNewFolder("/Users/Aki/Desktop/test/test1");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	
	}
}

