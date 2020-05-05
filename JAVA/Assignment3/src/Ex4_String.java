import java.util.Date;
import java.util.Scanner;

public class Ex4_String {

	public static void main(String[] args) {

		//Q1
		String s = "abc hkl";
		System.out.println(s.length());

		//Q2.
		String s1 = "Hey, sirri!";
		String s2 = "Open calender.";
		String s3 = s1 +" "+ s2;
		System.out.println(s3);



	}

	//Q3 Kiem tra chu in hoa
	public static void checkCapitalLetter() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Moi ban nhap vao ten: ");
		String name = scanner.next();
		String firstChar = name.substring(0, 1);

		System.out.println(firstChar.toUpperCase() + name.substring(1,name.length()));
		scanner.close();
	}

	//Q4 In tung ki tu
	public static void printChar() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Moi ban nhap vao ten: ");
		String name = scanner.next();
		for (int i=0; i<name.length();i++) {
			String chars = name.substring(i,i+1);
			System.out.printf("Ki tu thu " +(i+1) +" la: " + chars.toUpperCase()+"%n" );
		}
		scanner.close();
	}

	//Q5. Nhap ho va ten
	public static void inputName() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Moi ban nhap vao ho: ");
		String lastName = scanner.next();
		System.out.print("Moi ban nhap vao ten: ");
		String firstName = scanner.next();
		System.out.println("Ho ten da nhap la: "+ lastName + " " +firstName);
		scanner.close();

	}

	//Q6. Tach ho ten
	public static void splitName() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Moi ban nhap vao ho ten day du: ");
		String fullName = scanner.nextLine();
		scanner.close();
		String[] names = fullName.split("\\s");


		System.out.println("Ho la: "+ names[0]);	
		System.out.println("Ten la: "+names[names.length-1]);
		System.out.print("Dem la: ");
		for (int i=1; i<names.length-1;i++) {
			System.out.print(names[i]+" ");
		}

	}


	//Q7. Chuan hoa ho ten
	public static void formatName() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Moi ban nhap vao ho ten day du: ");
		String fullName = scanner.nextLine();
		scanner.close();
		String[] names = (fullName.trim()).split(" ");
		System.out.print("Ten da nhap la: ");
		for(int i=0;i<names.length;i++) {
			String firstChar = names[i].substring(0, 1);
			System.out.print(firstChar.toUpperCase() + names[i].substring(1,names[i].length()) + " ");
		}

	}

	//Q8. In ra group co chua chu Java
	public static void findGroup() {
		// Create group
		Group group1 = new Group();
		group1.groupId = 1;
		group1.groupName = "Java Fresher";
		group1.createDate = new Date (2020-04-21);


		Group group2 = new Group();
		group2.groupId = 2;
		group2.groupName = "DB Fresher";
		group2.createDate = new Date (2020-04-21);

		Group group3 = new Group();
		group3.groupId = 3;
		group3.groupName = "C++ Fresher";
		group3.createDate = new Date (2020-04-16);

		Group[] groups = {group1, group2, group3};
		for(int i=0;i<groups.length;i++) {
			if(groups[i].groupName.contains("java")) {
				System.out.println(groups[i].groupName);
			}else if(groups[i].groupName.contains("Java")) {
				System.out.println(groups[i].groupName);
			}
		}

	}

	//Q9. In ra group Java
	public static void findJavaGroup() {
		// Create group
		Group group1 = new Group();
		group1.groupId = 1;
		group1.groupName = "Java Fresher";
		group1.createDate = new Date (2020-04-21);


		Group group2 = new Group();
		group2.groupId = 2;
		group2.groupName = "DB Fresher";
		group2.createDate = new Date (2020-04-21);

		Group group3 = new Group();
		group3.groupId = 3;
		group3.groupName = "C++ Fresher";
		group3.createDate = new Date (2020-04-16);

		Group[] groups = {group1, group2, group3};
		for(int i=0;i<groups.length;i++) {
			if (groups[i].groupName.equalsIgnoreCase("java")) {
				System.out.println(groups[i].groupName);
			}
		}
	}
	//Q10. Kiem tra chuoi dao nguoc

	public static void checkReverse() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap string 1: ");
		String s1 = scanner.next();
		System.out.println("Nhap string 2: ");
		String s2 = scanner.next();
		scanner.close();

		int result = check(s1,s2);			
		if (result == 0) {
			System.out.println("KO");

		}else System.out.println("OK");


	}
	// Method kiem tra dao nguoc
	public static int check (String s1, String s2) {
		int a =1;

		for (int i=0;i<s1.length()/2;i++) {
			if (s1.charAt(i)!= s2.charAt(s2.length()-i-1)){
				a = 0;
				break;
			}
		}			 
		return a;		
	}
	
	//Q11 Kiem tra unique
	public static void checkUnique() {
		String s1 = "abcdeabc";
		String temp="";
		
		for (int i=0;i<s1.length();i++) {
				char current = s1.charAt(i);
				if (temp.indexOf(current)<0) {
					temp = temp + current;
					}else temp = temp.replace(String.valueOf(current), "");
			}
		
				if (temp == "") {
					System.out.println("KO");
				}else System.out.println("Ki tu unique la: "+temp);
	}
	
	//Q12. Reverse String
	public static void reverseString() {
		String s1 = "mailan";
		char[] ch =s1.toCharArray();
		
		for (int i=0; i<ch.length; i++) {
			System.out.print(ch[ch.length-i-1]);
			
		}
		
	}
	
	//Q13. String not contains digit
	public static void checkDigit() {
		String s1 = "mailan";
		char[] ch =s1.toCharArray();
		int result =1;
		
		for (int i=0; i<ch.length; i++) {
			if (Character.isDigit(ch[i])) {
				result =0;
				break;				
			}						
		}
		
		if (result ==0) {
			System.out.println("False");
		}else System.out.println("True");
		
	}
	
	//Q14.Replace char
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


//Q15. Revert string
public static void revertString() {
	
	String s1 = "I am developer ";
	String[] s2 =(s1.trim()).split(" ");
	for (int i=0; i<s2.length; i++) {
		String s3 = s2[s2.length-i-1];
		System.out.print(s3 + " ");
	}
		
}

//Q16. Chia string
public static void spilitString() {
	String s1 = "abcdef";
	int n =3;


	if (s1.length()%n!=0) {
		System.out.println("K0");
	}else {
		int size = s1.length()/n;
		for (int i=0; i<s1.length(); i++) {
			if (i%size ==0) 
				System.out.println();
				System.out.print(s1.charAt(i));
			}
		}
	
	}

//Q17.Character Duplicate
public static void findDuplicate() {
	String s1 = "abcdeabc";
	char[] chars = s1.toCharArray();
	int result =1;
	
	System.out.println("Ki tu trung la: ");
	
	for (int i=0;i<chars.length;i++) {
		for (int j=i+1; j<chars.length;j++) {
			if (chars[i]==chars[j]) {
				result = 0;
				System.out.println(chars[i]);															
			}
		}
		
	}
						
}

//Q18. Remove duplicate
public static void removeDuplicate() {
	String s1 = "abcdeabcfhf";
	String temp = "";
	
	System.out.println("Day khong lap la: ");
	
	for (int i=0;i<s1.length();i++) {
		char current = s1.charAt(i);
		if (temp.indexOf(current)<0){
			temp = temp + current;
		}
																			
			}
		
	System.out.println(temp);
						
}

}




