package com.vti.entity.IOStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

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
		fileInputStream.close();
		return content;
		
	}


	// write content to File
public static void writeFile(String pathFile, String content, boolean isContinuing) throws Exception {
	if (!FileManagement.isFileExists(pathFile)) {
		throw new Exception ("Error! File Not Exist.");
	}
	FileOutputStream fileOutputStream = new FileOutputStream(pathFile,isContinuing);
	fileOutputStream.write(content.getBytes());
	fileOutputStream.close();
}



//write object
public static void writeObject(Object object, String path) throws Exception {
	File file = new File(path);
	String folderPath = file.getAbsoluteFile().getParent();
	File folder = new File(folderPath);
	if (object==null) {
		throw new Exception("Error! Object is Null.");
	}if (!folder.exists()) {
		folder.mkdirs();
	}if  (file.exists()) {
		file.delete();
	}
	file.createNewFile();
	FileOutputStream fileOutputStream = new FileOutputStream(path);
	ObjectOutputStream objectOutputStream = new ObjectOutputStream (fileOutputStream);
	objectOutputStream.writeObject(object);
	objectOutputStream.close();
}

//read object
public static void readObject(String path) throws Exception {
	FileInputStream fileInputStream = new FileInputStream (path);
	ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
	
	Object object = objectInputStream.readObject();
	objectInputStream.close();
}

}
	



