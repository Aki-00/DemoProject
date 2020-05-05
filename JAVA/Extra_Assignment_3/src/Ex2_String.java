import java.util.Scanner;

public class Ex2_String {
	
public static void main(String[] args) {
	String lastName = "Linh";
	String firstName = "Nguyen";
	System.out.println((firstName + " "+lastName).toUpperCase());
		
	}

//Q1. Chu viet hoa
public static void upperLetter() {
	String lastName = "Linh";
	String firstName = "Nguyen";
	System.out.println((firstName + " "+lastName).toUpperCase());
	
}

//Q2. Tim vi tri chu
public static void findChar() {
	String s1 = "abcakia";
	char kitu = 'a';
	int count = 0;
	String vitri = "";
	
	for (int i=0;i<s1.length();i++) {
		if (s1.charAt(i)==kitu) {
			vitri = vitri + i + ", ";
			count++;
			
			
		}
			
		}
	
	System.out.println("So lan xuat hien: " +count);
	System.out.println("Vi tri xuat hien: "+vitri);
	}

//Q3. Thay the ki tu
public static void replaceChar() {
	
	Scanner scanner = new Scanner(System.in);
	System.out.print("Moi nhap chuoi: ");
	String s1 = scanner.nextLine();
	System.out.print("Moi nhap ki tu muon thay the: ");
	String s2 = scanner.nextLine();
	System.out.print("Moi nhap ki tu thay the: ");
	String s3 = scanner.nextLine();
	scanner.close();
	String replaceString = s1.replace(s2, s3);
	System.out.println(replaceString);
				
}

//Q4. In dao nguoc
public static void reverseString() {
	String s1 = "mailan";
	char[] ch =s1.toCharArray();
	
	for (int i=0; i<ch.length; i++) {
		System.out.print(ch[ch.length-i-1]);
		
	}
	
}

//Q5


//Q6. In phan tru trong chuoi
public static void printArray() {
	String s1 = "Java – Nơi trí tưởng tượng bay xa ";
	s1 = (s1.trim()).replaceAll("[–,:]", "");		
	String[] s2 = s1.split(" ");
	for(int i=0; i<s2.length;i++) {
		System.out.println("a[" +i+"] = " +s2[i]);
	}
	
}	



//Q7. Check user
public static void checkUser() {
	User user1 = new User();
	user1.userName = "Aki";
	user1.passWord = "12345";
	int check =0;		
	
	while(check==0) {
		User user =input();
		if (user.equals(user1)) {
			System.out.println("Dang nhap thanh cong");
			check =1;
		}else System.out.println("Moi dang nhap lai");
	}
	
}	

	// Method nhap user
	public static User input() {
		Scanner scanner = new Scanner (System.in);
		System.out.print("Moi nhap username: ");
		String userName = scanner.next();
		System.out.print("Moi nhap password: ");
		String passWord = scanner.next();
		User user = new User();		
		user.userName = userName;
		user.passWord = passWord;
		return user;
	}

}
