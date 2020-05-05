import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex1_Loop {

	public static void main(String[] args) {
		
	}
//Q1. sum
	public static void daySoThuc() {
		int[] n = {-6,-7,1,2,3,4,5,6,7,8,9,10};
		int sum =0;
		
		//Tinh tong
		for (int i=0; i<n.length;i++) {
			sum = sum +n[i];
		}
		
		System.out.println("Tong day = "+ sum);
		System.out.println("Trung binh day =" +sum/n.length);
		
		//Tinh tong so am
		int sum1 =0;
		for (int i=0; i<n.length;i++) {
			if (n[i]>=0) {
				continue;
			}sum1 = sum1 +n[i];
		}
		
		System.out.println("Tong cac so am = "+ sum1);
		// Tinh tong so duong
		int sum2 =0;
		for (int i=0; i<n.length;i++) {
			if (n[i]<=0) {
				continue;
			}sum2 = sum2 +n[i];
		}
		
		System.out.println("Tong cac so duong = "+ sum2);
		
		// Tong cac so vi tri chan
		int sum3 =0;
		for (int i=0; i<n.length;i++) {
			if(i%2==1) {continue;
			}sum3 = sum3 + n[i];
			
		}
		
		System.out.println("Tong cac so vi tri chan = "+ sum3);
		// Tong cac so vi tri le
		int sum4 =0;
		for (int i=0; i<n.length;i++) {
			if(i%2==0) {continue;
			}sum4 = sum4 + n[i];
			
		}
		
		System.out.println("Tong cac so vi tri le = "+ sum4);
					
		
	}
	
	//Q2. Tim vi tri phan tu x
	
	public static void findX() {
		int[] n = {-6,-7,1,2,3,4,5,6,7,8,9,10,1};
		int a =1;
		
		for (int i=0; i<n.length;i++) {
			if (n[i]==a) {
				System.out.println(i);
				break;
			}
		}
		
	}
	
	//Q3. In 16 so nguyen ra 4 dong 4 cot
	
	//Q5. Nhap day, sap xep tang giam
	public static void  ascDesList(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Moi nhap 10 so: ");
		Integer[] lists = new Integer[10];
		
	
		for (int i=0; i<10;i++) {
			lists[i] =scanner.nextInt();
			
		}
		System.out.print("Phan tu da nhap la: ");
		for (int list : lists) {
			System.out.print(list+ ", ");
		}
		
		Arrays.sort(lists);
		System.out.printf("\nMang theo chieu tang dan: ");
		for (int list : lists) {
			System.out.print(list+ ", ");
		
		}
		
		
		Arrays.sort(lists, Collections.reverseOrder()); 
		System.out.printf("\nMang theo chieu giam dan dan: ");
		for (int list : lists) {
			System.out.print(list+ ", ");
		}
		

	}
	
	
}
