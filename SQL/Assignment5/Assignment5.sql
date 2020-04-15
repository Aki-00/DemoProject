USE TestingSystem;

-- Q1. Tạo view có chứa danh sách nhân viên thuộc phòng ban sale
DROP VIEW IF EXISTS Salememebers;
CREATE VIEW Salemembers AS
 SELECT a.AccountID 
 FROM `Account` a
 JOIN Department d ON a.DepartmentID = d.DepartmentID
 WHERE a.DepartmentID = 'Sale';
 
 SELECT *
 FROM Salemembers;
 
 -- Q2. Tạo view có chứa thông tin các account tham gia vào nhiều group nhất

SET GLOBAL sql_mode=(SELECT REPLACE(@@sql_mode,'ONLY_FULL_GROUP_BY',''));
 SELECT *
 FROM `Account` a
 JOIN GroupAccount ga ON a.AccountID = ga.AccountID
 GROUP BY a.AccountID
 HAVING COUNT(ga.GroupID) = (SELECT MAX(x)
                              FROM (
                                    SELECT COUNT(ga1.GroupID) x 
									FROM GroupAccount ga1
                                    GROUP BY ga1.AccountID) g1);
								
WITH accountnumber AS(
SELECT COUNT(GroupID)
FROM GroupAccount
GROUP BY AccountID),

SELECT *
 FROM `Account` a
 JOIN GroupAccount ga ON a.AccountID = ga.AccountID
 GROUP BY a.AccountID
 HAVING COUNT(ga.GroupID) = Max(Accountnumber);
 
-- Q3. Tạo view có chứa câu hỏi có những content quá dài (content quá 300 từ được coi là quá dài) và xóa nó đi
DROP VIEW IF EXISTS Longcontent;
CREATE VIEW Longcontent AS
	SELECT QuestionID
    FROM Question
    WHERE LENGTH(Content) > 300;
    
SELECT *
FROM Longcontent;


-- Q4. Tạo view có chứa danh sách các phòng ban có nhiều nhân viên nhất
DROP VIEW IF EXISTS BigDepartment;
CREATE VIEW BigDepartment AS
 SELECT a.DepartmentID, d.DepartmentName
 FROM `Account` a
 JOIN Department d ON a.DepartmentID = d.DepartmentID
 GROUP BY a.DepartmentID
 HAVING Count(a.AccountID) = (SELECT MAX(x)
                              FROM (SELECT COUNT(a1.AccountID) x
									FROM `Account` a1
									Group BY a1.DepartmentID) y);
SELECT *
FROM BigDepartment;

 -- Q5. Tạo view có chứa tất các các câu hỏi do user họ Nguyễn tạo
 DROP VIEW IF EXISTS Q_made_by_Nguyen;
 CREATE VIEW Q_made_by_Nguyen AS
  SELECT QuestionID, QuestionContent
  FROM Question
  WHERE CreatorID = (SELECT AccountID
                     From `Account`
                     WHERE Fullname LIKE 'Nguyen%');
    

                              