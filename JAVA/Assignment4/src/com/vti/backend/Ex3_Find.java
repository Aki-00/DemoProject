package com.vti.backend;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.entity.Engineer;
import com.vti.entity.Staff;
import com.vti.entity.Worker;

public class Ex3_Find {
	
	public static void main(String[] args) {
		vsEngineer(inputName());
		
//		String info1 = vsEngineer(inputName());
//		System.out.println(info1);
	}

	
	//Nhap ho ten
	public static String inputName() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Moi nhap ten muon tim: ");
		String fullName = scanner.nextLine();
		return fullName;
	}
	
	//So sanh ho ten voi ky su
	public static String vsEngineer(String fullName) {

			ArrayList<Engineer> engineers = Ex3.inputEngineer();
			String info ="";
			for (int i=0;i<engineers.size();i++) {
				if (engineers.get(i).getFullName().equals(fullName)) {
					info = info + engineers.get(i).toString();
				} info = info +null;
			}
			return info;
			
//		Engineer[] engineers =(Engineer[]) Ex3.inputEngineer().toArray();
//		for (Engineer engineer : engineers) {			
//		System.out.println(engineer);}
		
		
//	    String info = null;
//		for (int i=0;i<engineers.length;i++) {
//			if (engineers[i].getFullName().equals(fullName)) {
//				info = engineers[i].toString();
//			}info=null;
//		}
//		return info;
	}
	
	//So sanh ho ten voi cong nhan
	public static String vsWorker(String fullName){

		
		Worker[] workers =(Worker[]) Ex3.inputWorker().toArray();
	    String info = null;
		for (int i=0;i<workers.length;i++) {
			if (workers[i].getFullName().equals(fullName)) {
				info = workers[i].toString();
			}info=null;
		}
		return info;
	}
	
	//So sanh voi nhan vien
	public static String vsStaff(String fullName) {

		
		Staff[] staffs =(Staff[]) Ex3.inputStaff().toArray();
	    String info = null;
		for (int i=0;i<staffs.length;i++) {
			if (staffs[i].getFullName().equals(fullName)) {
				info = staffs[i].toString();
			}info=null;
		}
		return info;
	}
	
	//Lay ket qua
	public static void getResult() {
		String fullName = inputName();
		String info1 = vsEngineer(fullName);
		String info2 = vsWorker(fullName);
		String info3 = vsStaff(fullName);
		System.out.println("Thong tin account dang tim kiem la: ");
		System.out.println(info1);
		System.out.println(info2);
		System.out.println(info3);
	}
}
