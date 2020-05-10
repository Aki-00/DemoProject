package Interface;

import java.util.ArrayList;
import java.util.Scanner;

public class SequenceNumber {

	private int[] numbers;
	
	public SequenceNumber(int[] array) {
		this.numbers = array;
	}
	
		public void input() {		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Moi nhap so luong so muon nhap");
		int n = scanner.nextInt();
		int[] array = new int[n];
		System.out.println("Moi nhap cac phan tu trong array");
		for (int i=0;i<n;i++) {
			array[i] =scanner.nextInt();			
		}
		SequenceNumber list = new SequenceNumber(array);
		}
	


//	ArrayList<Integer> list = new ArrayList<Integer>();
//	public void input() {		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Moi nhap so luong so muon nhap");
//		int n = scanner.nextInt();
//		for (int i=0;i<n;i++) {
//			Integer number = scanner.nextInt();
//			list.add(number);
//		}
//	}
	
	public void print() {
		for (Integer x:numbers) {
			System.out.println(x);
		}
	}

	public int sort(int[] arr, int pivot, int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}


}
