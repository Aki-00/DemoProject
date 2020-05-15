package com.vti.entity.Static;

public class HinhTron extends HinhHoc {
	
private int banKinh;
public static final float PI =3.14f;
protected HinhTron(int banKinh) {
	super();
	this.banKinh = banKinh;
}

public float tinhDientich(int banKinh) {
	return banKinh*PI*PI;
}

public float tinhChuvi(int banKinh) {
	return 2*PI*banKinh;
}

@Override
public String toString() {
	return "HinhTron [banKinh=" + banKinh + "]";
}

public static HinhTron hinhTron;
public static HinhTron controlNumber (int banKinh) throws Exception {
	if (count<Configs.SO_LUONG_HINH_TOI_DA) {
		hinhTron = new HinhTron(banKinh);
	}else {
		throw new Exception("số lượng hình tối đa là: " + Configs. SO_LUONG_HINH_TOI_DA);
	}
	return hinhTron;
}

}
