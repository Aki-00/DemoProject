package TestingSystem;

import java.util.Date;

public class Program {
	public static void main (String[] args) {
	// Logic
		
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
	
	// Create Position
	Position position1 = new Position();
	position1.id = 1;
	position1.name = "Manager";
	
	Position position2 = new Position();
	position2.id = 2;
	position2.name = "Team Leader";
	
	Position position3 = new Position();
	position3.id = 3;
	position3.name = "Trainee";
	
	
	// Create account
	Account account1 = new Account();
	account1.accountId = 1;
	account1.createDate = new Date (2020-03-17);
	account1.department = department1;
	account1.email = "An@gmail.com";
	account1.fullName = "Nguyen Van An";
	Group[] groupOfAccount1 = {group1};
	account1.groups = groupOfAccount1;
	account1.joinDate = new Date (2020-03-13);
	account1.position = position1;
	account1.userName = "an.nguyenvan";
	
	Account account2 = new Account();
	account2.accountId = 2;
	account2.createDate = new Date (2020-01-9);
	account2.department = department1;
	account2.email = "Linh@gmail.com";
	account2.fullName = "Nguyen Hoai Linh";
	Group[] groupOfAccount2 = {group3};
	account2.groups = groupOfAccount2;
	account2.joinDate = new Date (2020-03-13);
	account2.position = position3;
	account2.userName = "Linh.nguyenhoai";
	
	Account account3 = new Account();
	account3.accountId = 3;
	account3.createDate = new Date (2020-03-19);
	account3.department = department2;
	account3.email = "ha@gmail.com";
	account3.fullName = "Pham Hai Ha";
	Group[] groupOfAccount3 = {group1};
	account3.groups = groupOfAccount3;
	account3.joinDate = new Date (2020-03-13);
	account3.position = position1;
	account3.userName = "Ha.phamhai";
	
	// Update group
	
	group1.creator = account1;
	Account[] accountOfGroup1 = {account1, account3};
	group1.accounts = accountOfGroup1;
	
	group2.creator = account1;
	
	group3.creator = account1;
	Account[] accountOfGroup3 = {account2};
	group1.accounts = accountOfGroup3;
	
	// Create CategoryQuestion
	CategoryQuestion category1 = new CategoryQuestion();
	category1.categoryId = 1;
	category1.categoryName = "JAVA";
	
	CategoryQuestion category2 = new CategoryQuestion();
	category2.categoryId = 2;
	category2.categoryName = "DB";
	
	CategoryQuestion category3 = new CategoryQuestion();
	category3.categoryId = 3;
	category3.categoryName = "C++";
	
	// Create TypeQuestion
	TypeQuestion type1 = new TypeQuestion();
	type1.typeID = 1;
	type1.typeName = "Essay";
	
	TypeQuestion type2 = new TypeQuestion();
	type2.typeID = 2;
	type2.typeName = "Multi-choice";
	
	// Create Question
	Question question1 = new Question();
	question1.category = category1;
	question1.content = "Dac diem chinh cua Java";
	question1.createDate = new Date (2020-01-07);
	question1.creator = account1;
	question1.questionId = 1;
	question1.type = type1;
	
	Question question2 = new Question();
	question2.category = category1;
	question2.content = "Cac chuong trinh Java chu yeu";
	question2.createDate = new Date (2020-01-07);
	question2.creator = account1;
	question2.questionId = 2;
	question2.type = type2;
	
	Question question3 = new Question();
	question3.category = category1;
	question3.content = "Quy tac thiet ke Database";
	question3.createDate = new Date (2019-01-07);
	question3.creator = account2;
	question3.questionId = 3;
	question3.type = type1;
	
	// Create exam
	Exam exam1 = new Exam ();
	exam1.categoryId = category1;
	exam1.code = "JV01";
	exam1.createDate = new Date (2019-9-04);
	exam1.creatorId = account1;
	exam1.duration = Duration.MINUTE_60;
	exam1.examID = 1;
	Question[] questionOfExam1 = {question1, question2};
	exam1.questions = questionOfExam1;
	exam1.title = "Kien thuc co ban ve Java";
	
	
	Exam exam2 = new Exam ();
	exam2.categoryId = category2;
	exam2.code = "DB01";
	exam2.createDate = new Date (2019-12-04);
	exam2.creatorId = account2;
	exam2.duration = Duration.MINUTE_45;
	exam2.examID = 2;
	Question[] questionOfExam2 = {question3};
	exam1.questions = questionOfExam2;
	exam1.title = "Kien thuc co ban ve Database";
	
	//Create Answer
	Answer answer1 = new Answer();
	answer1.answerId = 1;
	answer1.content = "JAVA la ngon ngu lap trinh pho bien nhat";
	answer1.isCorrect = true;
	answer1.question = question1;
	
	Answer answer2 = new Answer();
	answer2.answerId = 2;
	answer2.content = "JAVA la ngon ngu lap trinh mat phi";
	answer2.isCorrect = false;
	answer2.question = question1;
	
	// In ra department
	
	System.out.println("Thong tin phong ban 1 ");
	System.out.println("ID: " + department1.id);
	System.out.println("Name: " + department1.name);
    System.out.println("\n");
	
	// Inra account
	System.out.println("Thong tin account1 ");
	System.out.println("ID: " + account1.accountId);
	System.out.println("createDate: " + account1.createDate);
	System.out.println("Department: " + account1.department.name);
	System.out.println("Email: " + account1.email);
	System.out.println("Fullname: " + account1.fullName);
	System.out.println("joinDate: " + account1.joinDate);
	System.out.println("Position: " + account1.position.name);
	System.out.println("Username: " + account1.userName);
	System.out.println("\n");
	
	// In ra Answer
	System.out.println("Thong tin answer1");
	System.out.println("AnswerID: " + answer1.answerId);
	System.out.println("Content: " + answer1.content);
	System.out.println("Cau tra loi dung: "+ answer1.isCorrect);
	System.out.println("Question: "+answer1.question.content);
	System.out.println("\n");
	
	// In ra CategoryQuestion
	System.out.println("Thong tin category1");
	System.out.println("CategoryID: "+category1.categoryId);
	System.out.println("CategoryName: "+category1.categoryName);
	System.out.println("\n");
	
	// In ra Exam
	System.out.println("Thong tin exam 1");
	System.out.println("Code: "+exam1.code);
	System.out.println("ID: "+ exam1.examID);
	System.out.println("Titlle: "+exam1.title);
	System.out.println("CategoryID: "+exam1.categoryId.categoryName);
	System.out.println("Create Date: "+exam1.createDate);
	System.out.println("Creator ID: "+exam1.creatorId.userName);
	System.out.println("Duration: "+exam1.duration);
	System.out.println("Question: "+exam1.questions);
	System.out.println("\n");
	
	// In ra Group
	System.out.println("GroupID: "+group1.groupId);
	System.out.println("Group Name: "+group1.groupName);
	System.out.println("Creator: "+group1.creator.userName);
	System.out.println("Create Date: "+group1.createDate);
	System.out.println("Account: "+group1.accounts);
	System.out.println("\n");
	
	// In ra Position
	System.out.println("Position ID: "+position1.id);
	System.out.println("Position Name: "+position1.name);
	System.out.println("\n");

	
	// In ra Type Question
	System.out.println("Type ID: "+type1.typeID);
	System.out.println("Type Name: "+type1.typeName);
	System.out.println("\n");
	
	// In ra question
	System.out.println("Category Name: "+question1.category.categoryName);
	System.out.println("Creator ID: "+question1.creator.userName);
	System.out.println("Content: "+question1.content);
	System.out.println("Create Date: "+question1.createDate);
	System.out.println("Question ID: "+question1.questionId);
	System.out.println("Type: "+question1.type.typeName);
	}
}
