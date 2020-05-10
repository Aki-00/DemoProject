package com.vti.entity.Polymorphism;

public class Hinhchunhat implements ITinhtoan{

	@Override
	public int tinhDientich(int chieuDai, int chieuRong) {
		System.out.println("Tính diện tích Hình Chữ Nhật");
		return chieuDai * chieuRong;

		
	}

	@Override
	public int tinhChuvi(int chieuDai, int chieuRong) {
		System.out.println("Tính chu vi Hình Chữ Nhật");
		return  (chieuDai + chieuRong)*2;

		
	}



}
