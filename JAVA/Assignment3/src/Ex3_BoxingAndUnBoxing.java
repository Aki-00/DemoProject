
public class Ex3_BoxingAndUnBoxing {
	public static void main(String[] args) {
		//Q1
		Integer salary = new Integer(5000);
		float salaryPre = salary.floatValue();
		System.out.printf("%.2f%n", salaryPre);
		
		//Q2
		String string = "1234567";
		int stringInt = Integer.parseInt(string);
		System.out.println(stringInt +1);
		
		//Q3
		Integer a = 1234567;
		int b = a.intValue();
		
				
	}

	private static int parseInt(String string) {
		// TODO Auto-generated method stub
		return 0;
	}

}
