package Interface;

import java.util.Scanner;

public class QuickSort extends SequenceNumber implements ISort{

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

	public QuickSort(int[] array) {
		super(array);
	}
	

	@Override
	public int sort(int arr[],int pivot,int i,int j) {

		if(i>j) {   
		      swap(arr,pivot,j); 
		      return i; 
		     } 

		     while(i<arr.length&&arr[i]<=arr[pivot]) { 
		      i++; 
		     } 

		     while(j>=1&&arr[j]>=arr[pivot]) {   
		      j--; 
		     } 
		     if(i<j) 
		      swap(arr,i,j); 

		     return sort(arr,pivot,i,j); 

		    } 
	
		    public static void swap(int[] arr,int i,int j) { 
		     int temp; 
		     temp=arr[i]; 
		     arr[i]=arr[j]; 
		     arr[j]=temp; 
		    }

			@Override
			public void Sort() {
				// TODO Auto-generated method stub
				
			}

			

}
