DROP DATABASE IF EXISTS Fresher;

CREATE DATABASE IF NOT EXISTS Fresher;

CREATE TABLE Trainee
(
	TraineeID INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Full_Name NVARCHAR(50) NOT NULL,
    Birth_Date DATE,
    Gender ENUM('Maie','Female','Unknown'),
    ET_IQ TINYINT UNSIGNED,
    ET_Gmath TINYINT UNSIGNED,
    ET_English TINYINT UNSIGNED,
    Training_Class VARCHAR(10) NOT NULL,
    Evaluation_Notes NVARCHAR(250)
);

ALTER TABLE Trainee
ADD COLUMN VTI_Account VARCHAR(50) NOT NULL UNIQUE;



    
    
    
    
    

