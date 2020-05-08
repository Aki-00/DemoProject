import java.util.Random;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		String n = soCuoc();
		int tienCuoc = tienCuoc();
		

		System.out.println("So da chon: "+n);
		System.out.println("So tien da cuoc: " +tienCuoc);
		
		String vitri = soDe(n);
		int count = soLo(n);
		
		if (vitri =="0") {
			System.out.println("Trung de");
			System.out.println("Thang cuoc: "+ tienCuoc*70);
		}else if (count>0){
			System.out.println("Trung lo: ");
			System.out.println("Thang cuoc: " + (tienCuoc/23)*80*count);
		}else System.out.println("Sorry!");
		
		
		
		
	}
	// Method lay ket qua lo de
	public static String taoGiai() {
	// Tao giai
	Random random = new Random();
	int DB = 100000+ random.nextInt(899999);
	int G1 = 100000+ random.nextInt(899999);
	int[] G2s = {100000+ random.nextInt(899999), 100000+ random.nextInt(899999)};
	int[] G3s = {100000+ random.nextInt(899999), 100000+ random.nextInt(899999),100000+ random.nextInt(899999)};
	int[] G4s = {1000+ random.nextInt(8999), 1000+ random.nextInt(8999), 1000+ random.nextInt(8999), 1000+ random.nextInt(8999)};
	int[] G5s = {100+ random.nextInt(899), 100+ random.nextInt(899), 100+ random.nextInt(899), 100+ random.nextInt(899), 100+ random.nextInt(899)};
	int[] G6s = {10+ random.nextInt(89),10+ random.nextInt(89),10+ random.nextInt(89),10+ random.nextInt(89),10+ random.nextInt(89),10+ random.nextInt(89)};
	
	//Lay KQ de
	String s_DB = Integer.toString(DB);
	String De = s_DB.substring(s_DB.length()-2);
	
	//Lay KQ Lo
	String Lo ="";
	String s_G1 = Integer.toString(G1);
	String Lo1 = s_G1.substring(s_G1.length()-2);
	Lo = De + " "+ Lo1+" ";
	
	for(int i=0; i<G2s.length;i++) {
		String x =Integer.toString(G2s[i]);
		Lo = Lo + x.substring(x.length()-2) + " ";
	}
	
	for(int i=0; i<G3s.length;i++) {
		String x =Integer.toString(G3s[i]);
		Lo = Lo + x.substring(x.length()-2) + " ";
	}
	
	for(int i=0; i<G4s.length;i++) {
		String x =Integer.toString(G4s[i]);
		Lo = Lo + x.substring(x.length()-2) + " ";
	}
	
	for(int i=0; i<G5s.length;i++) {
		String x =Integer.toString(G5s[i]);
		Lo = Lo + x.substring(x.length()-2) + " ";
	}
	
	for(int i=0; i<G6s.length;i++) {
		String x =Integer.toString(G6s[i]);
		Lo = Lo + x.substring(x.length()-2) + " ";
	}
			
	return Lo;
			
	

}
	
	//Method so de
	public static String soDe(String n) {
		String s = taoGiai();
		String[] s1= s.trim().split(" ");
		
		String vitri ="";
		
		for (int i=0;i<s1.length;i++) {
			if (s1[i].equals(n)){
				vitri = vitri + i;
				break;	
			}
		}
		
		return vitri;
			
		
				
		}
	
	//Method so lo
	public static int soLo(String n) {
		String s = taoGiai();
		String[] s1= s.trim().split(" ");
		
		int count =0;
		
		for (int i=0;i<s1.length;i++) {
			if (s1[i].equals(n)){
				count++;	
			}
		}
		
		return count;
			
		
				
		}
	
	//Method nhap so cuoc
	public static String soCuoc() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Moi ban nhap so cuoc (2 chu so): ");
		String soCuoc = scanner.next();
		return soCuoc;
	}
	
	//Method nhap tien cuoc
	public static int tienCuoc() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Moi ban nhap tien cuoc: ");
		int tienCuoc = scanner.nextInt();
		return tienCuoc;
		
		
	}
	
}
