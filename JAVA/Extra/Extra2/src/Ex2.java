import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Q1();
	}
	//Q1. In array
	public static void Q1() {
		int[] n = {0,1,2,3,6,7,9,10,2,3,5};
		String s ="";
		int a =0;
		for (int i=0; i<n.length;i++) {
			
			for(int j=i+1;j<n.length;j++) {
				if (n[i]==n[j]) {
					a++;
				}
			} System.out.println(n[i]+"-"+a);
			
		}
		System.out.println(s);
		
	}
	

}
