package com.vti.entity.Polymorphism;

public class HinhVuong extends Hinhchunhat {


	@Override
	public int tinhDientich(int chieuDai, int chieuRong) {
		System.out.println("Tính diện tích Hình Vuong");
		return super.tinhDientich(chieuDai, chieuRong);
	}
	
	@Override
	public int tinhChuvi(int chieuDai, int chieuRong) {
		System.out.println("Tính chu vi Hình Vuong");
		return super.tinhChuvi(chieuDai, chieuRong);
	}
}
