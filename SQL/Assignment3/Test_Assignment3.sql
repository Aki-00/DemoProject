USE TestingSystem;

-- Q2. lay ra cac phong ban
SELECT *
FROM Department;

-- Q3. lay ra ID cua phong ban sale
SELECT DepartmentID
FROM Department
WHERE DepartmentName = 'Sale';

-- Q4. Lay ra thong tin account co fullname dai nhat va sap xep giam dan
SELECT 	*, LENGTH(FUllname)
FROM	`Account`
WHERE	LENGTH(Fullname) = ( SELECT 		Max(LENGTH(Fullname))
							 FROM 		`Account`);
                             
SELECT 	*, LENGTH(FUllname)
FROM	`Account`
ORDER BY LENGTH(Fullname) DESC;
                             
-- Q5. Lay ra thong tin co fullname dai nhat va thuoc ban co id=3
SELECT 
    fullname
FROM
    `Account`
WHERE
    LENGTH(Fullname) = (SELECT 
            MAX(LENGTH(Fullname))
        FROM
            `Account`
        WHERE
            DepartmentID = 3);
    
-- Q6. Lay ten group da tham gia truoc ngay 20/12/2019
SELECT GroupName
FROM `Group`
WHERE CreateDate < '2019-12-20';

-- Q7. Lay ra ID cua Question co >=2 tra loi
SELECT QuestionID, Count(AnswerID)
FROM Answer
GROUP BY QuestionID
HAVING COUNT(AnswerID)>=2;

-- Q8. Lay ra cac ma de thi co thoi gian thi >=60 phut va duoc tao truoc ngay 20/12/2019
SELECT ExamID
FROM exam
WHERE Duration >=60 AND CreateDate < '2019-12-20';

-- Q9. Lay ra 5 group dc tao gan nhat
SELECT *
FROM `Group`
ORDER BY CreateDate DESC
LIMIT 5;

-- Q10. Dem so nhan vien thuoc department co ID =2
SELECT Count(AccountID)
FROM `Account`
WHERE DepartmentID = 2;

-- Q11. Lay ra ten nhan vien bat dau va ket thuc bang n
SELECT Fullname
FROM `Account`
WHERE Fullname LIKE 'N%n';

-- Q12. Xoa tat ca exam duoc tao truoc ngay 20/12/2019
DELETE 
FROM Exam
WHERE CreateDate < '2019-12-20';

-- Q13. Xoa tat ca cac question co noi dung bat dau bang B
DELETE
FROM Question
WHERE Content LIKE 'B%';

-- Q14. Update thong tin account cua ID = 5 ten thanh Nguyen Ba Loc, Email thanh loc.nguyenba
UPDATE `Account`
SET Fullname = 'Nguyen Ba Loc', Email = 'loc.nguyenba@vti.com.vn'
WHERE AccountID = 5;

-- Q15. Update account co id=5 se thuoc group id =4
UPDATE `GroupAccount`
SET GroupID = 4
WHERE AccountID = 5;









  

 














 