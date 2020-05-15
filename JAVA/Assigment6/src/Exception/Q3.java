package Exception;

public class Q3 {
public static void main(String[] args) {
	try {
		int[] numbers = {1,2,3};
		System.out.println(numbers[10]);
	}catch (IndexOutOfBoundsException e1) {
		System.out.println(e1.getMessage());
	} catch (Exception e2) {
		System.out.println(e2.getMessage());
	}
}
}
