package com.vti.frontend;

import com.vti.entity.IOStream.IOManager;

public class Ex4Demo {

	public static void main(String[] args) {
//		try {
//			IOManager.readFile("/Users/Aki/Desktop/UBM.docx");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
//		try {
//			IOManager.writeFile("/Users/Aki/Desktop/UBM.text", "ABCXYZ", true);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		try {
			IOManager.writeFile("/Users/Aki/Desktop/UBM.text", "1234", false);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
