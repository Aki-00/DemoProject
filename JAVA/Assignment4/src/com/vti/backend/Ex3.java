package com.vti.backend;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

import com.vti.entity.Inheritance.Employee;
import com.vti.entity.Inheritance.Engineer;
import com.vti.entity.Inheritance.Gender;
import com.vti.entity.Inheritance.Level;
import com.vti.entity.Inheritance.Staff;
import com.vti.entity.Inheritance.Worker;

public class Ex3 {

	
//	//Q2. 
//	//Them moi engineer
////	public static ArrayList<Engineer> inputEngineer() {		
//		public static ArrayList<Engineer> inputEngineer() {	
//		Scanner scanner = new Scanner(System.in);
//		ArrayList listEngineer = new ArrayList();
//		System.out.println("De nhap thong tin -> input 1, de thoat -> input 0");
//		int x = scanner.nextInt();
//		while(x==1) {
//				//Nhap thong tin
//				System.out.println("Moi ban nhap thong tin cua ky su");			
//				System.out.print("Moi ban nhap ten");
//				scanner.nextLine(); 
//				String fullName = scanner.nextLine();
//				System.out.print("Moi ban nhap so gender, chon tu 1:FEMALE, 2:MALE, 0:NA");
//				int inputGender = scanner.nextInt();
//				Gender gender = Gender.getGender(inputGender);
//				System.out.print("Moi ban nhap linh vuc: ");
//				String field = scanner.next();			
//				//Goi ham khoi tao	
//			    Engineer engineer = new Engineer(fullName,gender,field);
//			    listEngineer.add(engineer);
//			    System.out.println("De nhap tiep -> Input1, de thoat ->input 0");
//				x =scanner.nextInt();	
//			} 			
//			scanner.close();
//			return listEngineer;
//		}
//	
//		
//		
//
//	//Them moi worker
//	public static ArrayList<Worker> inputWorker() {	
//		Scanner scanner = new Scanner(System.in);
//		ArrayList listWorker = new ArrayList();
//		System.out.println("De nhap thong tin -> input 1, de thoat -> input 0");
//			int x = scanner.nextInt();
//			while(x==1) {
//				//Nhap thong tin
//			System.out.println("Moi ban nhap thong tin cua cong nhan");
//			System.out.print("Moi ban nhap ten");
//			scanner.nextLine(); 
//			String fullName = scanner.nextLine();
//			System.out.print("Moi ban nhap so gender, chon tu 1:FEMALE, 2:MALE, 0:NA");
//			int inputGender = scanner.nextInt();
//			Gender gender = Gender.getGender(inputGender);
//			System.out.print("Moi ban nhap bac, chon so tu 1=>10 ");
//			int inputLevel = scanner.nextInt();
//			Level level = Level.getLevel(inputLevel);
//			
//			//Goi ham khoi tao
//			Worker worker = new Worker(fullName, gender, level);
//			listWorker.add(worker);
//			System.out.println("De nhap tiep -> Input1, de thoat ->input 0");
//			x =scanner.nextInt();
//		}
//		scanner.close();
//		return listWorker;
//	}
//	
//	//Them moi Staff
//	public static ArrayList<Staff> inputStaff() {	
//		Scanner scanner = new Scanner(System.in);
//		ArrayList<Staff> listStaff = new ArrayList();
//		System.out.println("De nhap thong tin -> input 1, de thoat -> input 0");
//		int x = scanner.nextInt();
//		while(x==1) {
//				//Nhap thong tin
//			System.out.println("Moi ban nhap thong tin cua nhan vien");
//			System.out.print("Moi ban nhap ten");
//			scanner.nextLine(); 
//			String fullName = scanner.nextLine();
//			System.out.print("Moi ban nhap so gender, chon tu 1:FEMALE, 2:MALE, 0:NA");
//			int inputGender = scanner.nextInt();
//			Gender gender = Gender.getGender(inputGender);
//			System.out.print("Moi ban nhap cong viec ");
//			String job =scanner.next();
//			
//			//Goi ham khoi tao
//			Staff staff = new Staff(fullName, gender,job);
//			listStaff.add(staff);	
//		    System.out.println("De nhap tiep -> Input1, de thoat ->input 0");
//			x =scanner.nextInt();
//			}
//		scanner.close();
//		return listStaff;
//	}
//	
	
 ArrayList<Employee> employees = new ArrayList<>();

	//Method chon can bo nhap
	public void chooseInput() {
		Scanner scanner = new Scanner(System.in);		
		Employee employee = new Employee();
		System.out.println("Moi ban chon so can bo muon nhap: ");
		int n =scanner.nextInt();
		for (int i=0;i<n;i++) {
		System.out.println();
		System.out.println("1: Them moi ki su");
		System.out.println("2: Them moi cong nhan");
		System.out.println("3: Them moi nhan vien");
		System.out.print("Moi nhap vao chuong trinh muon dung");
		int x = scanner.nextInt();
			switch(x) {
			case 0:
				System.out.println("Thoat chuong trinh");
				break;
			case 1:
				employee = new Engineer();
				break;
			case 2:
				employee = new Worker();
				break;
			case 3:
				employee = new Staff();
				break;
			default:
				System.out.println("Moi ban nhap lai chuong trinh muon dung");
				break;			
			}		
		employee.input();
		employees.add(employee);
		}
	}
	
	//Method in ra can bo da nhap
	public void output() {
		for (Employee employee : employees) {
			employee.ouput();
		}
		
		
	}
	
	//Method tim can bo
	public void findName() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Moi nhap ten muon tim: ");
		String fullName = scanner.nextLine();
		for (int i=0;i<employees.size();i++) {
			if (employees.get(i).getFullName().equals(fullName)) {
				employees.get(i).ouput();
			}
		}
		
		
	}	
	
	//Method menu
	public void chooseMenu() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println();
		int x;
		do {
			menu();
			System.out.println("Moi ban chon chuc nang muon thuc hien");
			x = scanner.nextInt();
			switch(x) {
			case 1:
				chooseInput();
				break;
			case 2:
				findName();
				break;
			case 3:
				output();
				break;
			case 0:
				break;
			default:
				System.out.println("Moi ban nhap lai chuc nang muon thuc hien");
				break;			
			}						
		}while (x != 0);
	}
	
	
	
	public static void menu() {
		System.out.println();
		System.out.println("1: Them moi can bo");
		System.out.println("2: Tim kiem theo ten can bo");
		System.out.println("3: Hien thi thong tin can bo");
		System.out.println("0: Thoat khoi chuong trinh");
	}
}

