USE TestingSystem;

-- Q1. 	Tạo store để người dùng nhập vào tên phòng ban và in ra tất cả các account thuộc phòng ban đó
DROP PROCEDURE IF EXISTS account_of_department; 
DELIMITER $$	
CREATE PROCEDURE account_of_department (IN in_DepartmentName VARCHAR(20))
	BEGIN	 
		SELECT a.Fullname
        FROM Department d
        JOIN `Account` a ON d.DepartmentID = a.DepartmentID
        WHERE d.DepartmentName = in_DepartmentName ;
	END$$
DELIMITER ;

CALL account_of_department('Sale');

-- Q2. Tạo store để in ra số lượng account trong mỗi group
DROP PROCEDURE IF EXISTS number_of_account;
DELIMITER $$
CREATE PROCEDURE number_of_account (IN in_group_name VARCHAR(50))
	BEGIN
		SELECT COUNT(AccountID)
		FROM `Group` g
        JOIN `GroupAccount` ga ON g.GroupID = ga.GroupID
        WHERE g.GroupName = in_group_name;
	END $$
DELIMITER ;

CALL number_of_account('GroupC');

-- Q3.Question 3: Tạo store để thống kê mỗi type question có bao nhiêu question được tạo trong tháng hiện tại
SET GLOBAL sql_mode=(SELECT REPLACE(@@sql_mode,'ONLY_FULL_GROUP_BY',''));
DROP PROCEDURE IF EXISTS question_thismonth;
DELIMITER $$
CREATE PROCEDURE question_thismonth (IN in_typequestion ENUM('Essay','Multi-CHoice'))
BEGIN
	SELECT COUNT(q.QuestionID)
	FROM Typequestion tq
    JOIN question q ON tq.TypeID = q.TypeID
    WHERE MONTH(q.CreateDate) = MONTH(NOW());
END $$
Delimiter ;



-- Q4. Tạo store để trả ra id của type question có nhiều câu hỏi nhất
DROP PROCEDURE IF EXISTS max_type_question;
DELIMITER $$
CREATE PROCEDURE max_type_question (OUT out_type_question TINYINT UNSIGNED)
	BEGIN
		SELECT q.TypeID  INTO out_type_question
        FROM Question q
        JOIN TypeQuestion tq ON q.TypeID = tq.TypeID
        GROUP BY q.TypeID
        HAVING COUNT(q.QuestionID) = (SELECT MAX(x)
                                      FROM (SELECT COUNT(q1.QuestionID) x
                                         FROM Question q1
                                         GROUP BY q1.TypeID) y);
	END $$
    DELIMITER ;
    
    SET @type_ID = 0;
    CALL max_type_question(@type_ID);
    SELECT @Type_ID;
    
    -- Q5. Sử dụng store ở question 4 để tìm ra tên của type question
    
    SELECT TypeName
    FROM TypeQuestion
    WHERE TypeID = @Type_ID;
        
   -- Nhap vao Username tra ra ID
   DROP FUNCTION IF EXISTS ID_Output;
   DELIMITER $$
   CREATE FUNCTION ID_Output (user_name VARCHAR(50)) RETURNS TINYINT
   READS SQL DATA
   DETERMINISTIC
		BEGIN
			DECLARE Account_ID TINYINT;
			SELECT AccountID INTO Account_ID
            FROM `Account`
            WHERE Username = user_name;
			RETURN Account_ID;
		END$$
	DELIMITER ;
    
    SELECT ID_Output('hoamai');
    
-- Q6.Question 6: Viết 1 store cho phép người dùng nhập vào 1 chuỗi và trả về group có tên chứa chuỗi của người dùng nhập vào hoặc trả về user có username chứa chuỗi của người dùng nhập vào
DROP PROCEDURE IF EXISTS user_name;
DELIMITER $$
CREATE PROCEDURE user_name (IN in_user_name VARCHAR(50), OUT out_user_name VARCHAR(50))
	BEGIN
		SELECT a.Username INTO out_user_name
        FROM `Account` a
        WHERE a.Username LIKE CONCAT('%',in_user_name,'%');
	END$$
DELIMITER ;

SET @user_name = 'a';
CALL user_name ('vu', out_user_name);
SELECT @user_name;

-- Q7.Viết 1 store cho phép người dùng nhập vào thông tin fullName, email và trong store sẽ tự động gán
DROP PROCEDURE IF EXISTS get_user_name_Position_ID;
DELIMITER $$
CREATE PROCEDURE get_user_name_Position_ID (IN in_fullname VARCHAR(50), IN in_email VARCHAR(50), OUT out_user_name VARCHAR(50), OUT out_PositionID, OUT out_DepartmentID TINYINT UNSIGNED)
	BEGIN
		SELECT
        FROM ;
        
        SELECT 
        FROM `nguyenvana@gmail.com`

-- Q8.Viết 1 store cho phép người dùng nhập vào Essay hoặc Multiple-Choice để thống kê câu hỏi essay hoặc multiple-choice nào có content dài nhất
DROP PROCEDURE IF EXISTS longest_question;
DELIMITER $$
CREATE PROCEDURE longest_question (IN in_typename ENUM('Essay','Multi-CHoice'))
	BEGIN
		SELECT q.Content
        FROM Question q
        JOIN TypeQuestion tq ON q.TypeID = tq.TypeID
        WHERE tq.TypeName = in_typename
        HAVING LENGTH(q.Content) = (SELECT MAX(x)
									FROM (SELECT LENGTH(q1.Content) x
                                          FROM question q1) y);
	END$$
    DELIMITER ;
    
-- Q9. Viết 1 store cho phép người dùng xóa exam dựa vào ID
DROP PROCEDURE IF EXISTS delete_exam;

DELIMITER $$
CREATE PROCEDURE delete_exam (IN in_examID TINYINT UNSIGNED)
	BEGIN
		DELETE
        FROM Exam
        WHERE ExamID = in_examID;
	END$$
DELIMITER ;

CALL delete_exam (4);

-- Q10. Tìm ra các exam được tạo từ 3 năm trước và xóa các exam đó đi (sử dụng store ở câu 9 để xóa), sau đó in số lượng record đã remove từ các table liên quan trong khi removing





