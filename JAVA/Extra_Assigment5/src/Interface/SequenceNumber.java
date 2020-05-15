package Interface;

import java.util.Scanner;

public abstract class SequenceNumber implements ISort{

	private int[] numbers;

	public SequenceNumber(int[] array) {
		this.numbers = array;
	}

	public SequenceNumber(int n) {
		Scanner scanner = new Scanner(System.in);
		numbers = new int[n];
		System.out.println("Moi nhap cac phan tu trong array");
		for (int i = 0; i < n; i++) {
			numbers[i] = scanner.nextInt();
		}
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
		for (Integer x : numbers) {
			System.out.println(x);
		}
	}

}
