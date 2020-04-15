USE Fresher;

DROP TABLE IF EXISTS Department;
CREATE TABLE Department
(
 Department_Number TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
 Department_Name VARCHAR(50) UNIQUE NOT NULL);
 
DROP TABLE IF EXISTS Employee;
CREATE TABLE Employee
(
 Employee_Number INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
 Employee_Name VARCHAR(250) NOT NULL,
 Department_Number TINYINT UNSIGNED,
 FOREIGN KEY (Department_Number) REFERENCES Department(Department_Number));
 
 DROP TABLE IF EXISTS Employee_Skill;
 
 CREATE TABLE Employee_Skill
 (
  Employee_Number INT UNSIGNED NOT NULL,
  Skill_Code VARCHAR(50) NOT NULL,
  Date_Registered DATETIME,
  FOREIGN KEY (Employee_Number) REFERENCES Employee(Employee_Number));
  
  INSERT INTO Department (Department_Name)
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
                          
INSERT INTO Employee (Employee_Name, Department_Number)
VALUES                ('Nguyen Van An',	     1  ),
                      ('Peter Jack',		 5	),
                      ('Nguyen Van Vu',	     4	),
                      ('Nguyen Hoa',	     3	),
                      ('Nguyen Mai Hoa',     3	),
                      ('Nguyen Van Linh',	 2	),
                      ('Nguyen Van Linh',	 2	),
                      ('Nguyen Hoa',		 4	),
                      ('Nguyen Hoai Linh',	 1	),
                      ('Nguyen Thi An',	     3	);
 
INSERT INTO Employee_Skill (Employee_Number, Skill_Code, Date_Registered)
VALUES                     (1	,	 'JAVA1'	,	 '2020-03-14' 	),
						   (1	,	 'JAVA2'	,	 '2020-03-14' 	),
                           (1	,	 'JAVA3'	,	 '2020-03-14' 	),
                           (4	,	 'JAVA1'	,	 '2020-03-14' 	),
                           (7	,	 'Database1',	 '2018-03-25' 	),
                           (6	,	 'C++'		,	 '2019-04-30' 	);

-- Q3.Question 3: Viết lệnh để lấy ra danh sách nhân viên (name) có skill Java
SELECT e.Employee_Name, es.Skill_Code
FROM Employee e
JOIN Employee_Skill es ON e.Employee_Number = es. Employee_Number
WHERE es.Skill_Code LIKE '%Java%';

-- Q4. Viết lệnh để lấy ra danh sách các phòng ban có >3 nhân viên
SELECT d.Department_Name, COUNT(e.Employee_Number)
FROM Department d
JOIN Employee e ON d.Department_Number = e.Department_Number
GROUP BY d.Department_Number
HAVING COUNT(e.Employee_Number) >3;

-- Q5. Viết lệnh để lấy ra danh sách nhân viên của mỗi văn phòng ban.
SELECT d.Department_Name, COUNT(e.Employee_Number), group_concat(e.Employee_Name)
FROM Department d
JOIN Employee e ON d.Department_Number = e.Department_Number
GROUP BY d.Department_Name;
 
-- Q6.  Viết lệnh để lấy ra danh sách nhân viên có > 1 skills.
SELECT DISTINCT e.Employee_Name, COUNT(es.Skill_Code)
FROM Employee e
JOIN Employee_Skill es ON e.Employee_Number = es.Employee_Number
GROUP BY es. Employee_Number
HAVING COUNT(es.Skill_Code) >1;
  
                      