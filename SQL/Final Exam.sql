-- Tao bang

DROP DATABASE IF EXISTS Student;

CREATE DATABASE Student;

USE Student;

DROP TABLE IF EXISTS Student;
CREATE TABLE Student
(
	RN INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    `Name` VARCHAR(50) NOT NULL,
    Age TINYINT UNSIGNED,
    Gender ENUM('0', '1', 'NULL')
);

DROP TABLE IF EXISTS `Subject`;
CREATE TABLE `Subject`
(
	sID TINYINT UNSIGNED PRIMARY KEY,
    SName VARCHAR(50)
);

DROP TABLE IF EXISTS StudentSubject;
CREATE TABLE StudentSubject
(
	RN INT UNSIGNED,
    sID TINYINT UNSIGNED,
    Mark TINYINT UNSIGNED,
    `Date` Date,
    FOREIGN KEY (RN) REFERENCES Student(RN),
    FOREIGN KEY (sID) REFERENCES `Subject`(sID)
);

-- Insert Data

INSERT INTO Student(`Name`, 				Age, 	Gender)
VALUES  			('Nguyen Van An'	,	18	,	'1'),
					('Nguyen Thi Hoa'	,	19	,	'0'),
                    ('Nguyen Nhu Mai'	,	18	,	'NULL');
                    
INSERT INTO `Subject`(sID,  sName)
VALUES 				(1,    'Chemical'),
					(2,		'Math'),
                    (3,		'Art');
                    
INSERT INTO StudentSubject  (RN, sID,     Mark,      `Date`)
VALUES						(1	,	2	,	9	,	'2019-04-06'),
							(3	,	2	,	7	,	'2019-04-09'),
                            (2	,	1	,	8	,	'2019-07-08');
                            

-- a. Lấy tất cả các môn học không có bất kì điểm nào
	 SELECT s.sName 
     FROM `Subject` s
     LEFT JOIN StudentSubject ss ON s.sID = ss.sID
     WHERE ss.Mark IS NULL;
     
-- b. Lấy danh sách các môn học có ít nhất 2 điểm
SELECT s.sName 
     FROM `Subject` s
     LEFT JOIN StudentSubject ss ON s.sID = ss.sID
     GROUP BY s.sName
     HAVING COUNT(ss.Mark) >=2;
     
-- c.Tạo "StudentInfo" view có các thông tin về học sinh bao gồm: RN,sID,Name, Age, Gender, sName, Mark, Date. Với cột Gender show Male để thay thế cho 0, Female thay thế cho 1 và Unknow thay thế cho null.

	SELECT s.RN, su.sID, s.`Name`, s.Age, su.sName, ss.Mark, ss.`Date`,
           CASE	
				WHEN s.Gender = 0 THEN 'Male'
                WHEN s.Gender = 1 THEN 'Female'
                ELSE 'Unknown'
			END AS Gender
    FROM Student s
    LEFT JOIN StudentSubject ss ON s.RN = ss.RN
    LEFT JOIN `Subject` su ON ss.sID = su.sID;
    
    
-- d.a. Trigger CasUpdate: khi thay đổi data của cột sID, thì giá trị của cột sID của table StudentSubject cũng thay đổi theo

DROP TRIGGER IF EXISTS trigger_update_sID;
DELIMITER $$
	CREATE TRIGGER trigger_update_sID
    BEFORE UPDATE ON `Subject`
    FOR EACH ROW
    BEGIN
		UPDATE StudentSubject ss
        SET ss.sID = NEW.sID
        WHERE ss.ID = NEW.sID;
	END $$
    DELIMITER ;

UPDATE `Subject`
SELECT 

-- d.b.Trigger casDel: Khi xóa 1 student, các dữ liệu của table StudentSubject cũng sẽ bị xóa theo
DROP TRIGGER IF EXISTS trigger_delete_student;
DELIMITER $$
	CREATE TRIGGER trigger_delete_student
    BEFORE DELETE ON `Student`
    FOR EACH ROW
    BEGIN
        DELETE
        FROM StudentSubject
        WHERE RN = OLD.RN;
	END $$
    DELIMITER ;

DELETE
FROM Student
WHERE RN = 1;


-- e.Viết 1 thủ tục (có 2 parameters: student name, mark). Thủ tục sẽ xóa tất cả
-- các thông tin liên quan tới học sinh có cùng tên như parameter và tất cả các điểm nhỏ hơn của các học sinh đó.
-- Trong trường hợp nhập vào "*" thì thủ tục sẽ xóa tất cả các học sinh

DROP PROCEDURE IF EXISTS delete_account;
DELIMITER $$
CREATE PROCEDURE delete_account (IN in_studentname VARCHAR(50), IN in_mark TINYINT UNSIGNED)
	BEGIN
			DELETE
			FROM Student
            WHERE `Name` = in_studentname;
            
            DELETE
			FROM StudentSubject
			WHERE Mark < in_mark;
	END $$
DELIMITER ;
