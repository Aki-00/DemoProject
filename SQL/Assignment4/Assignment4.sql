USE TestingSystem;

-- Q1. Lay ra ds nv va phong ban
SELECT a.Fullname, d.DepartmentName
FROM Account a
JOIN Department d ON a.DepartmentID = d.DepartmentID;

-- Q2. Thong tin account sau ngay 20/12/2010

SELECT *
From `Account`
WHERE createDtae > '2010-12-20';

-- Q3. Lay ra cac Manager

SELECT *
FROM Account a
JOIN Position p ON a.PositionID = p.PositionID
WHERE PositionName = 'Manager';

-- Q4. DS phong ban co > 3 nhan vien
SELECT *, COUNT(1)
FROM `Account` a
JOIN Department d ON a.DepartmentID = d.DepartmentID
GROUP BY d.DepartmentID
HAVING Count(AccountID)>3;

-- Q5. Lay danh sach cau hoi duoc dung trong de thi nhieu nhat
-- NG. Bang ket qua trang?
SET GLOBAL sql_mode=(SELECT REPLACE(@@sql_mode,'ONLY_FULL_GROUP_BY',''));

-- Set data -> Inset Data
TRUNCATE TABLE exam;

SELECT QuestionID,COUNT(e.ExamID)
FROM ExamQuestion eq
JOIN Exam e ON eq.ExamID = e.ExamID
GROUP BY QuestionID
HAVING Count(e.ExamID) = (SELECT MAX(COUNT(e.ExamID))
				          FROM Exam);
                          
-- Q6. Thông kê mỗi category Question được sử dụng trong bao nhiêu Question
SELECT cq.CategoryID, COUNT(QuestionID)
FROM CategoryQuestion cq
JOIN Question q ON cq.CategoryID = q.CategoryID
Group BY cq.CategoryID;

-- Q7. Thông kê mỗi Question được sử dụng trong bao nhiêu Exam
SELECT QuestionID, COUNT(ExamID)
FROM ExamQuestion
GROUP BY QuestionID;

-- Q8. Lấy ra Question có nhiều câu trả lời nhất
-- NG. Ket qua tra ve sai

SELECT a.QuestionID, q.Content, COUNT(1) 
FROM Answer a
JOIN Question q ON a.QuestionID = q.QuestionID
GROUP BY a.QuestionID
HAVING COUNT(a.AnswerID) = (SELECT MAX(`number`)
                          FROM(SELECT (COUNT(*)) `number`
							   FROM Answer
							   GROUP BY a.QuestionID) g);

SELECT *, COUNT(a.AnswerID)
FROM Answer a
JOIN Question q ON a.QuestionID = q.QuestionID
GROUP BY a.QuestionID
HAVING COUNT(a.AnswerID) = (SELECT Count(a.AnswerID)
                            FROM Answer
                            GROUP BY a.QuestionID
                            ORDER BY COUNT(a.AnswerID) DESC
                            LIMIT 1);

-- Q9. Thống kê số lượng account trong mỗi group
SELECT GroupID, COUNT(AccountID)
FROM GroupAccount
GROUP BY GroupID;

-- Q10. Tìm chức vụ có ít người nhất 
-- NG. Ket qua ko dung
SELECT *,Count(1)
FROM `Position` p
JOIN `Account` a ON p.PositionID = a.PositionID
GROUP BY p.PositionID
HAVING Count(a.AccountID) = (SELECT COUNT(a.AccountID)
							 FROM `Account`
                             GROUP BY a.AccountID
                             ORDER BY COUNT(a.AccountID) DESC
                             LIMIT 1);
                             
					
-- Q11. thống kê mỗi phòng ban có bao nhiêu dev, test, scrum master, PM
SELECT DepartmentName, PositionName, COUNT(PositionName)
FROM `Account` a
JOIN Department d ON a.DepartmentID = d.DepartmentID
JOIN `Position` p ON a.PositionID = p.PositionID
GROUP BY PositionName;

-- Q12. Lấy thông tin chi tiết của câu hỏi bao gồm: thông tin cơ bản của question, loại câu hỏi, ai là người tạo ra câu hỏi, câu trả lời là gì, ...
-- Note: Tai sao ko dung cau lenh FULL OUTER JOIN duoc?
SELECT q.Content, cq.CategoryName, tq.TypeName, a.Content
FROM Question q
JOIN CategoryQuestion cq ON q.CategoryID = cq.CategoryID
JOIN TypeQuestion tq ON q.TypeID = tq.TypeID
JOIN Answer a ON q.QuestionID = a.QuestionID
WHERE a.Iscorrect = 'Yes';

-- Q13. lấy ra số lượng câu hỏi của mỗi loại tự luận hay trắc nghiệm
SELECT TypeName, COUNT(1)
FROM Question q
JOIN Typequestion tq ON q.TypeID = tq.TypeID
GROUP BY TypeName;

-- Q14. lấy ra group không có account nào
-- NOTE: Thay * thanh GroupName thi loi?
SELECT *
FROM `Group` g
LEFT JOIN GroupAccount ga ON g.GroupID = ga.GroupID
GROUP BY GroupName
HAVING AccountID IS NULL;

-- Q16. Lấy ra question không có answer nào
-- Note: Tai sao khong Select q.QuestionID, q.Content duoc.
SELECT *
FROM Question q
LEFT JOIN Answer a ON q.QuestionID = a.QuestionID
GROUP BY q.QuestionID
HAVING a.AnswerID IS NULL;

-- Q17. 
SELECT*
FROM GroupAccount
WHERE GroupID = 1
UNION
SELECT*
FROM GroupAccount
WHERE GroupID = 2;

-- Q18.
SELECT*
FROM GroupAccount
GROUP BY GroupID
HAVING COUNT(AccountID) > 5
UNION
SELECT*
FROM GroupAccount
GROUP BY GroupID
HAVING COUNT(AccountID) <7




















