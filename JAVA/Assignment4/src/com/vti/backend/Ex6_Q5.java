package com.vti.backend;

import java.util.Scanner;

import com.vti.entity.Abstraction.Tuyensinh;

public class Ex6_Q5 {
	
	Tuyensinh tuyenSinh = new Tuyensinh();
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
					tuyenSinh.insert();
					break;
				case 2:
					tuyenSinh.output();
					break;
				case 3:
					tuyenSinh.search();
					break;
				case 4:
					break;
				default:
					System.out.println("Moi ban nhap lai chuc nang muon thuc hien");
					break;			
				}						
			}while (x != 4);
		}
		
		



		public static void menu() {
			System.out.println();
			System.out.println("1: Them moi thi sinh");
			System.out.println("2: Hien thi thong tin thi sinh");
			System.out.println("3: Tim kiem theo SBD");
			System.out.println("4: Thoat khoi chuong trinh");
		}
}
