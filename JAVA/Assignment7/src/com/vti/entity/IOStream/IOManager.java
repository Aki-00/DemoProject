package com.vti.entity.IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.vti.entity.file.FileManagement;

public class IOManager {

//read file
	public static String readFile(String pathFile) throws Exception {
		
		if (!FileManagement.isFileExists(pathFile)) {
			throw new Exception ("Error! File Not Exist.");
		}
		FileInputStream fileInputStream = new FileInputStream(pathFile);
		byte[] b = new byte[1024];
		
		int length = fileInputStream.read(b);
		System.out.println(length);
		String content = "";
		
		while (length>-1) {
			content = new String(b,0,length);
			//read content from 0->length
			System.out.println(content);
			System.out.println(".....................");
			//continue read from position read b
			length = fileInputStream.read(b);
		}
		
		return content;
		fileInputStream.close();
	}

	// write content to File
public static void writeFile(String pathFile, isContinuing, String content) {
	if (!FileManagement.isFileExists(pathFile)) {
		throw new Exception ("Error! File Not Exist.");
	}
	FileOutputStream fileOutputStream = new FileOutputStream(pathFile,isContinuing);
	fileOutputStream.write(content.getBytes());
	fileOutputStream.close();
}
}
