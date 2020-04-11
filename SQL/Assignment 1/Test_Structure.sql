DROP DATABASE if exists TestingSystem;

CREATE DATABASE if not exists TestingSystem;

USE TestingSystem;

CREATE TABLE Department 
(
    DepartmentID TINYINT UNSIGNED AUTO_INCREMENT,
    DepartmentName VARCHAR(50) NOT NULL UNIQUE,
PRIMARY KEY (DepartmentID)
);
    
CREATE TABLE `Position` 
(
    PositionID TINYINT UNSIGNED AUTO_INCREMENT,
    PositionName VARCHAR(50) NOT NULL UNIQUE,
PRIMARY KEY (PositionID)
);

CREATE TABLE `Account` 
(
    AccountID INT UNSIGNED AUTO_INCREMENT,
    Email VARCHAR(50) NOT NULL UNIQUE,
    Username VARCHAR(50) NOT NULL UNIQUE,
    Fullname VARCHAR(50),
    DepartmentID TINYINT UNSIGNED,
    PositionID TINYINT UNSIGNED,
    CreateDate DATE,
PRIMARY KEY (AccountID),
FOREIGN KEY (DepartmentID) REFERENCES Department(DepartmentID),
FOREIGN KEY (PositionID) REFERENCES `Position`(PositionID)
);

CREATE TABLE `Group`
(
	GroupID TINYINT UNSIGNED AUTO_INCREMENT,
	GroupName VARCHAR(50) NOT NULL UNIQUE,
    CreatorID TINYINT,
	CreateDate DATE,
PRIMARY KEY (GroupID)
);

CREATE TABLE GroupAccount 
(
    GroupID TINYINT UNSIGNED NOT NULL,
    AccountID INT UNSIGNED NOT NULL,
    JointDate DATE,
FOREIGN KEY (GroupID) REFERENCES `Group`(GroupID),
FOREIGN KEY (AccountID) REFERENCES `Account`(AccountID) 
);

CREATE TABLE TypeQuestion 
(
    TypeID TINYINT UNSIGNED AUTO_INCREMENT,
    TypeName ENUM('Essay', 'Multiple-Choice') NOT NULL,
PRIMARY KEY (TypeID)
);

CREATE TABLE CategoryQuestion 
(
    CategoryID TINYINT UNSIGNED AUTO_INCREMENT,
    CategoryName VARCHAR(50) NOT NULL UNIQUE,
PRIMARY KEY (CategoryID)
);

CREATE TABLE question 
(
    QuestionID TINYINT UNSIGNED AUTO_INCREMENT,
    Content VARCHAR(1000) NOT NULL,
    CategoryID TINYINT UNSIGNED NOT NULL,
    TypeID TINYINT UNSIGNED NOT NULL,
    CreatorID TINYINT UNSIGNED,
    CreateDate DATE,
PRIMARY KEY (QuestionID),
FOREIGN KEY (CategoryID) REFERENCES CategoryQuestion(CategoryID),
FOREIGN KEY (TypeID) REFERENCES TypeQuestion(TypeID)
);

CREATE TABLE Answer 
(
    AnswerID INT UNSIGNED AUTO_INCREMENT,
    Content VARCHAR(1000),
    QuestionID TINYINT UNSIGNED NOT NULL,
    isCorrect ENUM('Yes', 'No') NOT NULL,
PRIMARY KEY ( AnswerID),
FOREIGN KEY (QuestionID) REFERENCES Question(QuestionID)
);

CREATE TABLE Exam 
(
    ExamID TINYINT UNSIGNED AUTO_INCREMENT,
    `Code` VARCHAR(10) NOT NULL UNIQUE,
    Title VARCHAR(100) NOT NULL,
    CategoryID TINYINT UNSIGNED NOT NULL,
    Duration SMALLINT UNSIGNED NOT NULL,
    CreatorID TINYINT UNSIGNED,
    CreateDate DATE,
PRIMARY KEY (ExamID),
FOREIGN KEY (CategoryID) REFERENCES CategoryQuestion(CategoryID)
);

CREATE TABLE ExamQuestion 
(
    ExamID TINYINT UNSIGNED AUTO_INCREMENT,
    QuestionID TINYINT UNSIGNED NOT NULL,
PRIMARY KEY (ExamID)
);




