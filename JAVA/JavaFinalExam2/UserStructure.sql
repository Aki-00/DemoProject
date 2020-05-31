-- Create Structure database
-- =============================================

-- Drop the database if it already exists
DROP DATABASE IF EXISTS UserManagement;
-- Create database
CREATE DATABASE IF NOT EXISTS UserManagement;
USE UserManagement;
-- Create table Manager
DROP TABLE IF EXISTS Manager;
CREATE TABLE IF NOT EXISTS Manager(
id			SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
firstName 	VARCHAR(50) NOT NULL,
lastName 	VARCHAR(50) NOT NULL,
phone		CHAR(12) NOT NULL UNIQUE CHECK (LENGTH(`phone`) >= 9 AND LENGTH(`phone`) <= 12),
email		CHAR(50) NOT NULL UNIQUE,
expInYear   TINYINT NOT NULL,
`passWord`	VARCHAR(50) NOT NULL
);

-- Create table Employee
DROP TABLE IF EXISTS Employee;
CREATE TABLE IF NOT EXISTS Employee(
id			SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
firstName 	VARCHAR(50) NOT NULL,
lastName 	VARCHAR(50) NOT NULL,
phone		CHAR(12) NOT NULL UNIQUE CHECK (LENGTH(`phone`) >= 9 AND LENGTH(`phone`) <= 12),
email		CHAR(50) NOT NULL UNIQUE,
projectName ENUM("TESTING_SYSTEM", "CRM", "TIME_SHEET") NOT NULL,
proSkill	VARCHAR(50) NOT NULL,
`passWord`	VARCHAR(50) NOT NULL
);
