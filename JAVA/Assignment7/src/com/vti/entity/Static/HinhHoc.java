package com.vti.entity.Static;

public class HinhHoc implements ITinhtoan {

public static int count;

protected HinhHoc() {
	count++;
}

@Override
public int tinhDientich() {
	return 0;
}

@Override
public int tinhChuvi() {
	return 0;
}

public static HinhHoc hinhHoc;

public static HinhHoc controlNumber () throws Exception {
	if (count<Configs.SO_LUONG_HINH_TOI_DA) {
		hinhHoc = new HinhHoc();
	}else {
		throw new Exception("số lượng hình tối đa là: " + Configs. SO_LUONG_HINH_TOI_DA);
	}
	return hinhHoc;
}

}
