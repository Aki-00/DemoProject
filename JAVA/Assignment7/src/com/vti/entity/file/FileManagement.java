package com.vti.entity.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.util.ArrayList;

public class FileManagement {

//Check ton tai
	public static boolean isFileExists(String pathFile) {
		File file = new File(pathFile);
		if (file.exists()) {
			System.out.println("File is exits!");
			return true;
		} else {
			System.out.println("File is not exits");
			return false;
		}
	}

//Tao moi
	public static void createFile(String pathFile) throws Exception {

		if (isFileExists(pathFile)) {
			throw new Exception("File da ton tai");
		} else {
			System.out.println("Bat dau tao file");

			File file = new File(pathFile);
			if (file.createNewFile()) {
				System.out.println("Tao file thanh cong");
			} else {
				System.out.println("Tao file that bai");
			}

		}
	}
	
//Delete
	public static void deleteFile(String pathFile) throws Exception {
		File file = new File(pathFile);
	
		if (isFileExists(pathFile)) {
			if (file.delete()) {
				System.out.println("Da xoa thanh cong");
			}else {
				System.out.println("Xoa that bai");
			}
		}
			else {
				throw new Exception ("Error! File Not Exist.");
				
			}
	}
	
	
// Check path is File or Folder
	public static boolean isFolder(String pathFile) {
		File file = new File(pathFile);
		if (file.isDirectory()) {
			System.out.println("Path is folder");
			return true;
		}else {
			System.out.println("Path is file");
			return false;
		}
	}
	
//Get all file name of folder
	static ArrayList<String> fileNames = new ArrayList<String>();
	public static ArrayList<String>  getAllFileName (String pathFile) throws Exception {
		File file = new File(pathFile);
		if (isFolder(pathFile)) {
			for (String fileName : file.list()) {
				fileNames.add(fileName);
			}
		}else {
			throw new Exception("Error! Path is not folder.");
		}System.out.println(fileNames);
		return fileNames;
		

	}
//Copy File
	
	public static void copyFile (String pathOldFile, String newPath) throws Exception {
	
		
		if (isFileExists(pathOldFile)) {
			File source = new File (pathOldFile);
			File dest = new File (newPath);
			Files.copy(source.toPath(), dest.toPath());
		}else {
			throw new Exception ("Error! File Not Exist.");
		}
		
	}
	
	public static void copyFile (String pathOldFile, String newPath, String newName) throws Exception {
		if (isFileExists(pathOldFile)) {
			File source = new File (pathOldFile);
			File dest = new File (newPath);
			File newFile = new File (newName);
			Files.copy(source.toPath(), dest.toPath());
			dest.renameTo(newFile);
		}else {
			throw new Exception ("Error! File Not Exist.");
		}		
		
	}
//Moving file
	public static void moveFile (String pathOldFile, String newPath) throws Exception {
		if (isFileExists(pathOldFile)) {
			File source = new File (pathOldFile);
			File dest = new File (newPath);
			Files.move(source.toPath(), dest.toPath());
			deleteFile(pathOldFile);
		}else {
			throw new Exception ("Error! File Not Exist.");
		}
	}
	
//Rename File
	public static void renameFile(String pathOldFile, String newName) throws Exception {
		
		File old = new File (pathOldFile);
		File newFile = new File (newName);
		if (!isFileExists(pathOldFile)) {
			throw new Exception ("Error! File Not Exist.");
		}else if (isFileExists(newName)) {
			throw new Exception ("Error! Name is Exist.");
		}else {
			old.renameTo(newFile);
		}
	}

//Create New Folder
	public static void createNewFolder(String newPathFolder) throws Exception {
		File folder = new File (newPathFolder);
		if (folder.exists()) {
			throw new Exception ("Error! Folder Exist.");
		}else {
			folder.mkdir();
		}
	}
//Download file
	public static void downloadFile(String fileLink, String pathFolder) throws Exception {
		File folder1 = new File (pathFolder);
		if (!folder1.exists() || !folder1.isDirectory()) {
			System.out.println("Error!Folder is not exist or not folder.");
		}
		String s[] = fileLink.split("/");
		String name = s[s.length-1];
		pathFolder = pathFolder+"/"+name;
		//connect to URL
		URL url = new URL(fileLink);
		URLConnection connection = url.openConnection();
		//get size of file
		int size = connection.getContentLength();
		//read file from internet
		InputStream in = connection.getInputStream();
		//save file
		FileOutputStream output = new FileOutputStream(pathFolder);
		int byteDownload = 0;
		byte[] b = new byte[1024];
		//get length
		int length = in.read(b);
		while (length!=-1) {
			byteDownload += length;
			System.out.println(byteDownload * 100f/size + "%");
			//write content downloaded from 0 -> length to ouput
			output.write(b,0,length);
			length = in.read(b);
		}
		
		//close
		output.close();
		in.close();
		System.out.println("Download success");
		
		
		

		
	}
}
