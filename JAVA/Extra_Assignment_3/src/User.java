
public class User {
	String userName;
	String passWord;

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		
		User user = (User) obj;
		if (user.userName.equals(userName) && user.passWord.equals(passWord)) {
			return true;
		}
			return false;
		
	}

	
	

}
