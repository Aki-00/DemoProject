-- Q1. Tạo trigger không cho phép người dùng nhập vào Group có ngày tạo trước 1 năm trước

DROP TRIGGER trigger_create_time;
DELIMITER $$
	CREATE TRIGGER trigger_create_time
    BEFORE INSERT ON `Group`
    FOR EACH ROW
    BEGIN
		IF NEW.CreateDate < DATE_SUB(CURDATE(), INTERVAL 1 YEAR) THEN
			SIGNAL SQLSTATE '12345'
            SET MESSAGE_TEXT = 'Cannot insert data';
		END IF;
        
	END $$
    
    DELIMITER ;
    
    INSERT INTO `Group` (GroupName, CreatorID, CreateDate)
    VALUES              ('GroupZ', 'admin', '2017-11-03');



-- Q2. ạo trigger Không cho phép người dùng thêm bất kỳ user nào vào department "Sale" nữa, khi thêm thì hiện ra thông báo "Department "Sale" cannot add more user"

DROP TRIGGER IF EXISTS trigger_add_sale_department_account;
DELIMITER $$
	CREATE TRIGGER trigger_add_sale_department_account
    BEFORE INSERT ON `Account`
    FOR EACH ROW
    BEGIN
		DECLARE sale_department_ID TINYINT UNSIGNED;
			SELECT DepartmentID INTO sale_department_ID
            FROM Department
            WHERE DepartmentName = 'Sale';
		
        IF NEW.DepartmentID = sale_department_ID THEN
			SIGNAL SQLSTATE '12345'
            SET MESSAGE_TEXT = 'Department "Sale" cannot add more user';
		END IF;
        
       END $$
    
    DELIMITER ; 
    
    INSERT INTO `Account` (Email, Username, Fullname, DepartmentID, PositionID, CreateDate)
    VALUES                ('an12@hotmail.com','an12', 'Nguyen Van An', 1, 4, '2019-09-12');
    

-- Question 12: Lấy ra thông tin exam trong đó
-- Duration <= 30 thì sẽ đổi thành giá trị "Short time"
-- 30 < duration <= 60 thì sẽ đổi thành giá trị "Medium time" duration >60 thì sẽ đổi thành giá trị "Long time"

SELECT ExamID,
				CASE 
					WHEN Duration <= 30 THEN 'Short time'
                    WHEN Duration <= 60 AND Duration >30 THEN 'Medium time'
                    ELSE 'Longtime'
				END AS ExamDuration
FROM Exam;

-- Q13.Thống kê số account trong mỗi group và in ra thêm 1 column nữa có tên là the_number_user_amount và mang giá trị được quy định như sau:
-- Nếu số lượng user trong group =< 5 thì sẽ có giá trị là few
-- Nếu số lượng user trong group <= 20 và > 5 thì sẽ có giá trị là normal Nếu số lượng user trong group > 20 thì sẽ có giá trị là higher

SELECT GroupID, 
				CASE
					WHEN COUNT(AccountID) <=5 THEN 'Few'
                    WHEN COUNT(AccountID) <=20 AND COUNT(AccountID)>5 THEN 'Normal'
                    ELSE 'Higher'
				END AS the_number_user_amount
FROM GroupAccount
GROUP BY GroupID;

-- Q14. Thống kê số mỗi phòng ban có bao nhiêu user, nếu phòng ban nào không có user thì sẽ thay đổi giá trị 0 thành "Không có User"

SELECT d.DepartmentName,
						CASE
							WHEN COUNT(a.AccountID) = 0 THEN 'Khong co User'
                            ELSE COUNT(a.AccountID)
						END AS Number_of_Account
FROM Department d
JOIN `Account` a ON d.DepartmentID = a.DepartmentID
GROUP BY d.DepartmentName;

-- Question 5: Tạo trigger không cho phép người dùng xóa tài khoản có email là admin@gmail.com (đây là tài khoản admin, không cho phép user xóa), còn lại các tài khoản khác thì sẽ cho phép xóa và sẽ xóa tất cả các thông tin liên quan tới user đó

DROP TRIGGER IF EXISTS trigger_delete_account;
DELIMITER $$
	CREATE TRIGGER trigger_delete_account
    BEFORE DELETE ON `Account`
    FOR EACH ROW
    BEGIN
		IF OLD.Email = 'admin@gmail.com' 
        THEN 
			SIGNAL SQLSTATE '12345'
            SET MESSAGE_TEXT = 'Cannot delete data';
		END IF;
        
	END $$
    DELIMITER ; 
        
DELETE
FROM `Account`
WHERE Email = 'admin@gmail.com';

-- Q6. Không sử dụng cấu hình default cho field DepartmentID của table Account, hãy tạo trigger cho phép người dùng khi tạo account không điền vào departmentID thì sẽ được phân vào phòng ban "waiting Department"
DROP TRIGGER IF EXISTS trigger_create_account;
DELIMITER $$
	CREATE TRIGGER trigger_create_account
    BEFORE INSERT ON `Account`
    FOR EACH ROW
    BEGIN
		DECLARE WaitingDepartment_ID TINYINT UNSIGNED;
			SELECT DepartmentID INTO WaitingDepartment_ID
            FROM Department
            WHERE DepartmentName = 'Waiting Department';
            
		IF NEW.DepartmentID IS NULL
        THEN SET NEW.DepartmentID = WaitingDepartment_ID;
		END IF;
        
	END $$
    DELIMITER ;

INSERT INTO `Account`(Email, Username, Fullname, DepartmentID, PositionID, CreateDate)
    VALUES           ('an14@hotmail.com','an14', 'Nguyen Van An', NULL, 4, '2019-09-12');

-- Q7.Cấu hình 1 bài thi chỉ cho phép user tạo tối đa 4 answers cho mỗi question, trong đó có tối đa 2 đáp án đúng.

DROP TRIGGER IF EXISTS trigger_create_answer;
DELIMITER $$
	CREATE TRIGGER trigger_create_answer
    BEFORE INSERT ON Answer
    FOR EACH ROW
    BEGIN
		DECLARE Number_of_Answer TINYINT UNSIGNED;
        DECLARE Number_of_Correct_Answer TINYINT UNSIGNED;
			SELECT COUNT(AnswerID) INTO Number_of_Answer
            FROM Answer
            WHERE QuestionID = New.QuestionID;
            
			SELECT COUNT(AnswerID) INTO Number_of_Correct_Answer
            FROM Answer
            WHERE QuestionID = New.QuestionID AND isCorrect = 'Yes';
            
		IF Number_of_Answer >5 OR Number_of_Correct_Answer>3 THEN 
        SIGNAL SQLSTATE '12345'
		SET MESSAGE_TEXT = 'Cannot insert data';
		END IF;
       
	END $$
    DELIMITER ;
    
    INSERT INTO Answer(Content, QuestionID, isCorrect)
    VALUES            ('XXXXXX', 8, 'Yes');

-- Q8.Viết trigger sửa lại dữ liệu cho đúng: nếu người dùng nhập vào gender của account là nam, nữ, chưa xác định thì sẽ đổi lại thành M, F, U cho giống với cấu hình ở database
DROP TRIGGER IF EXISTS trigger_insert_sex;
DELIMITER $$
	CREATE TRIGGER trigger_insert_sex
    BEFORE INSERT ON `Account`
    FOR EACH ROW
    BEGIN
		
       
	END $$
    DELIMITER ;
    
    INSERT INTO Answer(Content, QuestionID, isCorrect)
    VALUES            ('XXXXXX', 8, 'Yes');