package Interface;

import java.util.Scanner;

public class QuickSort extends SequenceNumber {

	public QuickSort(int n) {
		super(n);
	}

	@Override
	public void Sort() {
		if (i > j) {
			swap(arr, pivot, j);
			return i;
		}

		while (i < arr.length && arr[i] <= arr[pivot]) {
			i++;
		}

		while (j >= 1 && arr[j] >= arr[pivot]) {
			j--;
		}
		if (i < j)
			swap(arr, i, j);

		return sort(arr, pivot, i, j);

	}

	private void swap(int[] arr, int i, int j) {
		int temp;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	private int sort(int arr[], int pivot, int i, int j) {

	}

}
