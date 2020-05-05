import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Q6();
		
	}
	
	//Q1. Quy doi cm -> inch, foot
	public static void Q1() {
		System.out.println("Nhap vao so cm: ");
		Scanner scanner = new Scanner(System.in);		
		int cm = scanner.nextInt();
		scanner.close();
		double foot = cm/12;
		double inch = (float)cm/2.54;
		
		System.out.println("So cm da nhap: "+cm);
		System.out.printf("%n%s%.2f", "So foot quy doi: ", foot);
		System.out.printf("%n%s%.2f", "So inch quy doi: ", inch);
		
	}
	
	//Q2.Quy doi giay -> gio
	public static void Q2() {
		System.out.println("Nhap vao so giay: ");
		Scanner scanner = new Scanner(System.in);		
		int inputSecond = scanner.nextInt();
		scanner.close();
		
		int hour = inputSecond/60/60;
		int minute = (inputSecond - (hour*60))/60;
		int second = inputSecond-(hour*60*60) - (minute*60);
		String result = String.format("%02d", hour)+":"+String.format("%02d", minute)+":"+String.format("%02d", second);
		
		System.out.println(result);
		
	}
	
	//Q3.Chon so lon nhat va nho nhat
	public static void Q3() {
		System.out.println("Nhap vao 4 so: ");
		Scanner scanner = new Scanner(System.in);	
		int i=0;
		String n = "";
		while (i<4) {
		int x = scanner.nextInt();
		i++;		
		if (i<4) {
		n = n+x+",";
		}else n=n+x;
		}		
		scanner.close();
		System.out.println("Mang da nhap: "+n);
		
		String[] n1 = n.split(",");
	
		System.out.println("A1");
		
		//Tim max
		int max =Integer.parseInt(n1[0]);
		int min =Integer.parseInt(n1[0]);
		for (;i<n1.length;i++) {
	if (max<Integer.parseInt(n1[i])) {
			max =Integer.parseInt(n1[i]);

		}
		//Tim min
		
	
		if (Integer.parseInt(n1[i])<min) {
			min =Integer.parseInt(n1[i]);
		}
		 
		}
		
		System.out.println("Gia tri max: " +max);
		System.out.println("Gia tri min: " +min);
	
	}
	
	//Q4. So sanh lon nho
	public static void Q4() {
		System.out.println("Nhap vao 2 so: ");
		Scanner scanner = new Scanner(System.in);	
		float a = scanner.nextFloat();
		float b = scanner.nextFloat();
		scanner.close();
		
		float hieuso = a-b;
		if (hieuso > 0) {
			System.out.println(a +">"+ b);
			
		} else System.out.println(a +"<"+ b);
		
	}
//Q5. Kiem tra chia het
	public static void Q5() {
		System.out.println("Nhap vao 2 so: ");
		Scanner scanner = new Scanner(System.in);	
		float a = scanner.nextFloat();
		float b = scanner.nextFloat();
		scanner.close();
		
		if (a%b == 0) {
			System.out.println(a +" chia het cho "+ b);
			
		} else System.out.println(a +" khong chia het cho "+ b);
		
	}
	
	//Q6. Xep loai hoc sinh
	public static void Q6() {
		Scanner scanner = new Scanner(System.in);	
		System.out.println("Nhap diem toan: ");		
		float toan = scanner.nextFloat();
		System.out.println("Nhap diem ly: ");	
		float ly = scanner.nextFloat();
		System.out.println("Nhap diem hoa: ");	
		float hoa = scanner.nextFloat();
		scanner.close();
		
		float avg = (toan*2+ly+hoa)/4;
		String s ="";
		
		if (avg>=9.0) {
			s = "XS";
		} else if (avg>=8.0 && avg<9.0){
			s ="G";
		}else if (avg>=7.0 && avg<8.0){
			s="K";
		} else if (avg>=6.0 && avg<7.0) {
			s="TBK";
		} else if (avg>=5.0 && avg<6.0) {
			s ="TB";
	}else s ="Kem";
		
		System.out.println(s);
			
		
		}
		
	

}
