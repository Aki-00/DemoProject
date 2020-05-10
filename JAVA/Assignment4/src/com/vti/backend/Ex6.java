package com.vti.backend;

import java.util.Scanner;

import com.vti.entity.Abstraction.News;

public class Ex6 {

	//Tao menu
	public static void menu() {
		System.out.println();
		System.out.println("1: Insert News");
		System.out.println("2: View list news");
		System.out.println("3: Average rate");
		System.out.println("4: Exit");
	}
	
	//Method menu
		public void chooseMenu() {
			News news = new News();
			Scanner scanner = new Scanner(System.in);
			
			System.out.println();
			int x;
			do {
				menu();
				System.out.println("Moi ban chon chuc nang muon thuc hien");
				x = scanner.nextInt();
				switch(x) {
				case 1:
					news.insert();
					break;
				case 2:
					news.display(); 
					break;
				case 3:
					news.calculate();
					news.display(); 
					break;
				case 4:
					break;
				default:
					System.out.println("Moi ban nhap lai chuc nang muon thuc hien");
					break;			
				}						
			}while (x != 4);
		}

		
}
