import java.util.Date;

public class Ex2_DefaultValue {

	public static void main(String[] args) {
		Date date=java.util.Calendar.getInstance().getTime(); 
		
		Account[] accounts = new Account[10];
		for (int i=0; i<accounts.length; i++) {
			accounts[i] = new Account();
			accounts[i].email = i+"@email";
			accounts[i].userName = "username" + i;
			accounts[i].fullName = "fullname" +i;
			accounts[i].createDate = date;
		}
		
		for (int i=0; i<accounts.length; i++) {
			System.out.printf("%15s%15s%15s%15s%n",accounts[i].email, accounts[i].userName ,accounts[i].fullName ,accounts[i].createDate);
			
		}
			
		
		
			
			
			
		}

	}

