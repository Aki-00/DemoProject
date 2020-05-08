package com.vti.backend;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

import com.vti.entity.Engineer;
import com.vti.entity.Gender;
import com.vti.entity.Level;
import com.vti.entity.Staff;
import com.vti.entity.Worker;

public class Ex3 {
public static void main(String[] args) {
	
	ArrayList<Engineer> engineers = inputEngineer();
	
	
}
	
	//Q2. 
	//Them moi engineer
//	public static ArrayList<Engineer> inputEngineer() {		
		public static ArrayList<Engineer> inputEngineer() {	
		Scanner scanner = new Scanner(System.in);
		ArrayList listEngineer = new ArrayList();
		System.out.println("De nhap thong tin -> input 1, de thoat -> input 0");
		int x = scanner.nextInt();
		while(x==1) {
				//Nhap thong tin
				System.out.println("Moi ban nhap thong tin cua ky su");			
				System.out.print("Moi ban nhap ten");
				scanner.nextLine(); 
				String fullName = scanner.nextLine();
				System.out.print("Moi ban nhap so gender, chon tu 1:FEMALE, 2:MALE, 0:NA");
				int inputGender = scanner.nextInt();
				Gender gender = Gender.getGender(inputGender);
				System.out.print("Moi ban nhap linh vuc: ");
				String field = scanner.next();			
				//Goi ham khoi tao	
			    Engineer engineer = new Engineer(fullName,gender,field);
			    listEngineer.add(engineer);
			    System.out.println("De nhap tiep -> Input1, de thoat ->input 0");
				x =scanner.nextInt();	
			} 			
			scanner.close();
			return listEngineer;
		}
	
		
		

	//Them moi worker
	public static ArrayList<Worker> inputWorker() {	
		Scanner scanner = new Scanner(System.in);
		ArrayList listWorker = new ArrayList();
		System.out.println("De nhap thong tin -> input 1, de thoat -> input 0");
			int x = scanner.nextInt();
			while(x==1) {
				//Nhap thong tin
			System.out.println("Moi ban nhap thong tin cua cong nhan");
			System.out.print("Moi ban nhap ten");
			scanner.nextLine(); 
			String fullName = scanner.nextLine();
			System.out.print("Moi ban nhap so gender, chon tu 1:FEMALE, 2:MALE, 0:NA");
			int inputGender = scanner.nextInt();
			Gender gender = Gender.getGender(inputGender);
			System.out.print("Moi ban nhap bac, chon so tu 1=>10 ");
			int inputLevel = scanner.nextInt();
			Level level = Level.getLevel(inputLevel);
			
			//Goi ham khoi tao
			Worker worker = new Worker(fullName, gender, level);
			listWorker.add(worker);
			System.out.println("De nhap tiep -> Input1, de thoat ->input 0");
			x =scanner.nextInt();
		}
		scanner.close();
		return listWorker;
	}
	
	//Them moi Staff
	public static ArrayList<Staff> inputStaff() {	
		Scanner scanner = new Scanner(System.in);
		ArrayList<Staff> listStaff = new ArrayList();
		System.out.println("De nhap thong tin -> input 1, de thoat -> input 0");
		int x = scanner.nextInt();
		while(x==1) {
				//Nhap thong tin
			System.out.println("Moi ban nhap thong tin cua nhan vien");
			System.out.print("Moi ban nhap ten");
			scanner.nextLine(); 
			String fullName = scanner.nextLine();
			System.out.print("Moi ban nhap so gender, chon tu 1:FEMALE, 2:MALE, 0:NA");
			int inputGender = scanner.nextInt();
			Gender gender = Gender.getGender(inputGender);
			System.out.print("Moi ban nhap cong viec ");
			String job =scanner.next();
			
			//Goi ham khoi tao
			Staff staff = new Staff(fullName, gender,job);
			listStaff.add(staff);	
		    System.out.println("De nhap tiep -> Input1, de thoat ->input 0");
			x =scanner.nextInt();
			}
		scanner.close();
		return listStaff;
	}
	
	
	

	//Method chon can bo nhap
	public static void chooseEmployee() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1: Them moi ki su");
		System.out.println("2: Them moi cong nhan");
		System.out.println("3: Them moi nhan vien");
		System.out.println("0: Thoat");
		System.out.print("Moi nhap vao chuong trinh muon dung");
		int x = scanner.nextInt();
			switch(x) {
			case 0:
				System.out.println("Thoat chuong trinh");
				break;
			case 1:
				inputEngineer();
				break;
			case 2:
				inputWorker();
				break;
			case 3:
				inputStaff();
				break;
			default:
				System.out.println("Moi ban nhap lai chuong trinh muon dung");
				x = scanner.nextInt();

			}
		
	}
	
	//Lay ra list engineer
	public static ArrayList<Engineer> getEngineer(){
		ArrayList<Engineer> engineers = inputEngineer();
		return engineers;
	}
	
	
}

