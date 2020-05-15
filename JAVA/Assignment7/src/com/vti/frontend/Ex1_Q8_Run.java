package com.vti.frontend;

import com.vti.entity.Static.HinhChuNhat;
import com.vti.entity.Static.HinhHoc;
import com.vti.entity.Static.HinhTron;

public class Ex1_Q8_Run {

	public static void main(String[] args) {
		
		HinhHoc hinhHoc1;
		try {
			hinhHoc1 = HinhTron.controlNumber(1);
		} catch (Exception e) {
			hinhHoc1 = null;
			e.printStackTrace();
		}
		HinhHoc hinhHoc2;
		try {
			hinhHoc2 = HinhTron.controlNumber(2);
		} catch (Exception e1) {
			hinhHoc2 = null;
			e1.printStackTrace();
		}
		HinhHoc hinhHoc3;
		try {
			hinhHoc3 = HinhChuNhat.controlNumber(2, 5);
		} catch (Exception e) {
			hinhHoc3 = null;
			e.printStackTrace();
		}
		HinhHoc hinhHoc4;
		try {
			hinhHoc4 = HinhChuNhat.controlNumber(3, 5);
		} catch (Exception e) {
			hinhHoc4 = null;
			e.printStackTrace();
		}
		HinhHoc hinhHoc5;
		try {
			hinhHoc5 = HinhChuNhat.controlNumber(4, 5);
		} catch (Exception e) {
			hinhHoc5 = null;
			e.printStackTrace();
		}
		HinhHoc hinhHoc6;
		try {
			hinhHoc6 = HinhChuNhat.controlNumber(3, 7);
		} catch (Exception e) {
			hinhHoc6 = null;
			e.printStackTrace();
		}
		HinhHoc hinhHoc7;
		try {
			hinhHoc7 = HinhTron.controlNumber(4);
		} catch (Exception e) {
			hinhHoc7 = null;
			e.printStackTrace();
		}
		
//		HinhHoc hinhHoc2 = HinhHoc.controlNumber();
//		HinhHoc hinhHoc3 = HinhHoc.controlNumber();
//		HinhHoc hinhHoc4 = HinhHoc.controlNumber();
//		HinhHoc hinhHoc5 = HinhHoc.controlNumber();
//		HinhHoc hinhHoc6 = HinhHoc.controlNumber();
//		HinhHoc hinhHoc7 = HinhHoc.controlNumber();
	
		
		System.out.println(hinhHoc1);
		System.out.println(hinhHoc2);
		System.out.println(hinhHoc3);
		System.out.println(hinhHoc4);
		System.out.println(hinhHoc5);
		System.out.println(hinhHoc6);
		System.out.println(hinhHoc7);
		
		
	}
}
