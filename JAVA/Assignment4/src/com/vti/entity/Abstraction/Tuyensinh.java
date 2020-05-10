package com.vti.entity.Abstraction;

import java.util.ArrayList;
import java.util.Scanner;

public class Tuyensinh implements ITuyensinh{

	Scanner scanner = new Scanner(System.in);
	ArrayList<Examinee> examinees = new ArrayList();
	Examinee examinee = new Examinee();
	@Override
	public void insert() {
		System.out.println("Moi nhao vao thong tin thi sinh: ");
		System.out.println("Moi nhap vao so thi sinh muon nhap");
		int n = scanner.nextInt();
		for (int i=0;i<n;i++) {
			System.out.println("Moi nhap vao ho ten");
			scanner.nextLine();
			examinee.setName(scanner.nextLine());
			System.out.println("Moi nhap vao dia chi");
			examinee.setAddress(scanner.nextLine());
			System.out.print("Moi ban nhap vao muc uu tien (LOW, MEDIUM, HIGH)");
			String priority = scanner.next().toUpperCase();
			Priority prioriti = Priority.getPriority(priority);
			examinee.setPriority(prioriti);
			System.out.print("Moi ban nhap vao khoi thi: ");
			String block = scanner.next().toUpperCase();
			Block blocki = Block.setBlock(block);
			examinee.setBlock(blocki);
			examinees.add(examinee);		
		}
	}



	@Override
	public void output() {
		System.out.println("Thong tin thi sinh:");
		System.out.println("SBD: "+examinee.getSbd());
		System.out.println("Name: "+examinee.getName());
		System.out.println("Address: "+examinee.getAddress());
		System.out.println("Priority: "+examinee.getPriority());
		System.out.println("Block: "+examinee.getBlock());
		
		
	}

	@Override
	public void search() {
		System.out.println("Moi nhap sbd muon tim kiem");
		int sbd = scanner.nextInt();
		for (int i=0;i<examinees.size();i++) {
			if (examinees.get(i).getSbd()==sbd) {
				output();
			}
		}
		
	}

	@Override
	public void exit() {

	}

}
