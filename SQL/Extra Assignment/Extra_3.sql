USE Fresher;

-- Q1.
INSERT INTO Trainee (	Full_Name, 			Birth_Date, 		Gender, 	ET_IQ, ET_Gmath, ET_English, Training_Class, Evaluation_Notes, VTI_Account)
VALUES              ('Nguyen Van An'	, 	'1993-09-06'	, 	'Male'	,	 14	, 	17	,	 18	,		 'J001'	,			NULL	,	 'An.NguyenVan'	),
                    ('Nguyen Van Linh'	, 	'1996-09-15'	, 	'Male'	,	 18	, 	17	,	 15	,		 'J001'	,			NULL	,	 'Linh.NguyenVan'	), 
                    ('Nguyen Thi Hoa'	, 	'2000-04-18'	, 	'Female',	 19	, 	19	,	 18	,		 'D001'	,			NULL	,	 'Hoa.NguyenThi'	), 
                    ('Nguyen Nhu Mai'	, 	'1999-09-15'	, 	'Unknown',	 18	, 	20	,	 17	,		 'J001'	,			NULL	,	 'Mai.NguyenNhu'	);
                  
-- Q2. Viết lệnh để lấy ra tất cả các thực tập sinh đã vượt qua bài test đầu vào, nhóm chúng thành các tháng sinh khác nhau
SET GLOBAL sql_mode=(SELECT REPLACE(@@sql_mode,'ONLY_FULL_GROUP_BY',''));

SELECT *
FROM Trainee
WHERE ET_IQ >= 10
GROUP BY MONTH(Birth_Date);

-- Q3. Viết lệnh để lấy ra thực tập sinh có tên dài nhất, lấy ra các thông tin sau: tên, tuổi, các thông tin cơ bản (như đã được định nghĩa trong table)
SELECT *
FROM Trainee
WHERE LENGTH(Full_Name) = (SELECT Max(x)
                            FROM (SELECT LENGTH(FUll_Name) x
						          FROM Trainee) y);

-- Q4. Viết lệnh để lấy ra tất cả các thực tập sinh là ET, 1 ET thực tập sinh là những người đã vượt qua bài test đầu vào và thỏa mãn số điểm như sau:
--  ET_IQ + ET_Gmath>=20
-- ET_IQ>=8
--  ET_Gmath>=8
-- ET_English>=18

SELECT Full_Name
FROM Trainee
WHERE ET_IQ >= 10
AND ET_IQ + ET_Gmath>=20
AND ET_Gmath>=8
AND ET_English>=18;

-- Q5. xóa thực tập sinh có TraineeID = 3
DELETE
FROM Trainee
WHERE TraineeID =3;

-- Q6. Thực tập sinh có TraineeID = 5 được chuyển sang lớp "2"
UPDATE Trainee
SET Training_Class = 'J002'
WHERE TraineeID =5;


                           
                           
                           