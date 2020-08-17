-- Create Structure database
-- =============================================

-- Drop the database if it already exists
DROP DATABASE IF EXISTS UserManagement;
-- Create database
CREATE DATABASE IF NOT EXISTS UserManagement;
USE UserManagement;
-- Create table Manager
DROP TABLE IF EXISTS Manager;
CREATE TABLE IF NOT EXISTS User(
id			SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
userName		CHAR(50) NOT NULL UNIQUE,
`passWord`	VARCHAR(50) NOT NULL
);