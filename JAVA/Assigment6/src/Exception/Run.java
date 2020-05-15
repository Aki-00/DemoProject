package Exception;

public class Run {

	public static void main(String[] args) {
//		Department department =new Department();
////		Position position = new Position();
//		Group group = new Group();

//		Account account = new Account();

		ScannerUtils a = new ScannerUtils();
		boolean retry = false;
		while (!retry) {
			try {
				a.inputAgeGreaterThan18();
				retry = true;
			} catch (InvalidAgeInputingException e) {
				System.out.println("Moi nhap lai");
				retry = false;
			}

		}

	}

}
