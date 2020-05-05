
public class Ex5_Method {
	public static void main(String[] args) {
	
	// Create Deparment
			Department department1 = new Department ();
			department1.id = 1;
			department1.name = "Sale";

			Department department2 = new Department ();
			department2.id = 2;
			department2.name = "Marketting";

			Department department3 = new Department ();
			department3.id = 3;
			department3.name = "HR";
			
			//Q1
			System.out.println(department1);
			
			//Q2.
			Department[] departments = {department1, department2, department3};
			for (Department department : departments) {
			System.out.println(department);}
			
			//Q3. Dia chi department 1
			System.out.println(department1.hashCode());
			
			//Q4.
			System.out.println(department1.name.equals("Phong A"));
			
			//Q5.
			System.out.println(department1.equals(department2));
	}
	
	//Q6. SX phong ban thu tu tang dan
	
}
