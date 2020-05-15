package com.vti.entity.Static;

public class HinhChuNhat extends HinhHoc {

	private int chieuDai;
	private int chieuRong;
	protected HinhChuNhat(int chieuDai, int chieuRong) {
		super();
	}
	
	public int tinhDientich(int banKinh) {
		return chieuDai * chieuRong;
	}

	public float tinhChuvi(int banKinh) {
		return  (chieuDai + chieuRong)*2;

	}

	public static HinhChuNhat hinhChuNhat;
	public static HinhChuNhat controlNumber (int chieuDai, int chieuRong) throws Exception {
		if (count<Configs.SO_LUONG_HINH_TOI_DA) {
			hinhChuNhat = new HinhChuNhat(chieuDai, chieuRong);
		}else {
			throw new Exception("số lượng hình tối đa là: " + Configs. SO_LUONG_HINH_TOI_DA);
		}
		return hinhChuNhat;
	}

	@Override
	public String toString() {
		return "HinhChuNhat [chieuDai=" + chieuDai + ", chieuRong=" + chieuRong + "]";
	}
	
	
}

