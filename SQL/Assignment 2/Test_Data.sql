USE TestingSystem;

-- Insert data table Department

INSERT INTO Department(DepartmentName)
VALUES                    ('Sale'),
						  ('Marketing'),	  
                          ('Human Resource'),
                          ('ITG'),
                          ('Purchasing'),
                          ('Oversea Business'),
                          ('Design'),
                          ('Research'), 
                          ('Account'),
                          ('BoD'),
                          ('Planning');
                          
-- Insert data table Position
INSERT INTO `Position` (PositionName)
VALUES               ('President'),
					 ('Director'),	
					 ('Vice Director'),
					 ('General Manager'),			 
                     ('Department Chef'),
                     ('Section Chef'),
                     ('Manager'),
                     ('Team Leader'),
                     ('Intern'),
                     ('Partime'),
                     ('Staff'),
                     ('Contract Staf');
                     
-- Insert data table Account

INSERT INTO `Account` (Email,           		Username,  	Fullname, 			DepartmentID, PositionID, CreateDate)
VALUES              ('an2gmail.com.com',    'an011',  	'Nguyen Van An',		1,  		2,		'2013-03-04'),                     
                    ('peter2gmail.com',		'peter09',	'Peter Jack',			5,			9,		'1998-03-09'),
					('vu2yahoo.com',		'vuji',		'Nguyen Van Vu',		4,			6,		'2000-04-03'),
					('hoaly@gmail.com',		'hoalyu',	'Nguyen Hoa',			3,			5,		'2019-04-06'),
					('hoamai2yahoo.com',	'hoamai',	'Nguyen Mai Hoa',		3,			8,		'2020-02-05'),
					('linh2gmail.com',		'linhnguyen','Nguyen Van Linh',		2,			5,		'2020-09-08'),
					('vanlinh@gmail.com',	'vanlinh',	'Nguyen Van Linh',		2,			7,		'2019-02-09'),
					('hoanin2gmail.com',	'hoain',	'Nguyen Hoa',			4,			3,		'2019-05-08'),
					('linhng2gmail.com',	'linhng02',	'Nguyen Hoai Linh',		1,			4,		'2019-09-05'),
					('an12yahoo.com',		'annguyen',	'Nguyen Thi An',		3,			4,		'2020-04-07');
                    
-- Insert data table Group

INSERT INTO `Group` (GroupName,		CreateDate,		CreatorID)
VALUES              ('GroupA',		'2020-08-03',	'1'),
                    ('GroupB',		'2020-01-08',	'2'),
					('GroupC',		'1996-03-04',	'1'),
					('GroupD',		'2019-07-04',	'4'),
					('GroupE',		'2015-08-04',	'5'),
					('GroupF',		'2014-08-04',	'4'),
					('GroupM',		'2020-03-31',	'8'),
					('GroupN',		'2020-04-06',	'6'),
					('GroupL',		'2020-01-04',	'9'),
					('GroupK',		'2020-02-25',	'2');

-- Insert data table GroupAccount

INSERT INTO GroupAccount (GroupID, AccountID, JointDate)
VALUES						(1,		2,		'2019-03-07'),
							(2,		5,		'2019-09-08'),
                            (2,		1,		'2018-08-09'),
                            (4,		3,		'2020-01-03'),
                            (5,		6,		'2019-08-09'),
                            (6,		4,		'2018-09-03'),
                            (7,		8,		'2018-08-23'),
                            (8,		7,		'2018-03-05'),
							(9,		9,		'2018-03-09'),
                            (10,	6,		'2020-09-08');
                            
-- Insert data table TypeQuestion

INSERT INTO Typequestion (TypeName)
VALUES                   ('Essay'), 
						 ('Multiple-Choice');
						
-- Insert data table CategoryQuestion

INSERT INTO CategoryQuestion (CategoryName)
VALUES                       ('Common_Part1'),
							 ('Common_Part2'),
                             ('Common_Part3'),
                             ('Basic Marketing_Part1'),
                             ('Basic Marketing_Part2'),
                             ('Basic Makreting_Part3'),
                             ('Basic Account'),
                             ('English_Part1'),
                             ('English_Part2'),
                             ('Stastics');
                             
-- Insert data table Question

INSERT INTO Question (Content, 					CategoryID, TypeID, CreatorID, CreateDate)
VALUES				('Business Manner in Japan',	1,		1,		'1',	'2018-08-05'),
					('Email Writting Skill', 		1,		1,		'3',	'2018-08-05'),
                    ('Reading Skill',				9,		2,		'5',	'2019-04-05'),
                    ('Color Picking',				4,		2,		'5',	'2020-01-31'),
                    ('Basic Photoshop',				5,		2,		'9',	'2018-04-02'),
                    ('Stastics in Research',		10,		2,		'2',	'2018-04-02'),
                    ('IELT Test',					8,		1,		'4',	'2018-04-02'),
                    ('Manufacturing Chain',			3,		1,		'4',	'2018-04-02'),
                    ('Basic Account',				7,		2,		'4',	'2018-07-31'),
                    ('Makers List',					2,		2,		'7',	'2020-04-02');
                    
-- Inser data table Answer

INSERT INTO Answer (Content, QuestionID, isCorrect)
VALUES             ('AAAAAA',	1,		'No'),
                   ('BBBBBB',	9,		'Yes'),
                   ('CCCCCC',	3,		'No'),
                   ('DDDDDD',	2,		'Yes'),
                   ('EEEEEE',	7,		'Yes'),
                   ('FFFFFF',	8,		'Yes'),
                   ('GGGGGG',	8,		'Yes'),
                   ('HHHHHH',	9,		'Yes'),
                   ('JJJJJJ',	9,		'Yes'),
                   ('KKKKKK',	10,		'Yes');
                   
-- Insert data table Exam

INSERT INTO Exam (`Code`, 			Title, 					CategoryID, 	 	Duration, 		CreatorID, 	CreateDate)
VALUES 				('C001'		, 'Business Manner Test 01'		,	1			,	60		,   '1'			,'2019-04-05'),
					('E001'		, 'IELT Listning Test'			,	8			,	60		,   '2'			,'2019-04-05'),
                    ('S001'		, 'Basic Stacstic Test'			,	10			,	120		,   '5'			,'2019-04-07'),
                    ('C002'		, 'Maker List'					,	2			,	60		,   '5'			,'2020-04-08'),
                    ('M001'		, 'Color Picking Test'			,	4			,	120		,   '9'			,'2020-04-10'),
                    ('E002'		, 'Reading Test 01'				,	9			,	60		,   '4'			,'2020-04-05'),
                    ('E003'		, 'Reading Test 02'				,	9			,	60		,   '3'			,'2020-04-05'),
                    ('C003'		, 'Business Manner Test 02'		,	1			,	60		,   '6'			,'2020-04-07'),
                    ('A001'		, 'Basic Account Test'			,	7			,	90		,   '9'			,'2020-04-07'),
                    ('M002'		, 'Basic Photoshop Test'		,	5			,	90		,   '1'         , '2020-04-08');
                    
-- Insert data table ExamQuestion

INSERT INTO ExamQuestion (ExamID, QuestionID)
VALUES                   (1		,	1),
						 (2		,	7),
                         (3		,	6),
                         (4		,	10),
                         (5		,	4),
                         (6		,	3),
                         (7		,	3),
                         (8		,	1),
                         (9		,	9),
                         (10	,	5);

