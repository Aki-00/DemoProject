import java.util.Date;

public class Ex1 {

	public static void main(String[] args) {
		
		Department department1 =new Department();
		
		Department department2 =new Department("Sale");
		
		Position position1 = new Position(1,"Fresher");
				
		Account account1 = new Account();
		
		Account account2 = new Account(2, "an@gmail.com", "an nguyen", "Nguyen An");
		
		Account account3 = new Account(3, "linh@gamil.com","linhnguyen","Nguyen Linh",position1);
		
		Account account4 = new Account(4,"loan@gmail","loando","Do Loan",position1, new Date());
		
		

	}

}
