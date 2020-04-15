-- Ex1. Q1. Viết 1 query lấy thông tin "Name" từ bảng Production.Product có name của ProductSubcategory là 'Saddles'.

SELECT DISTINCT p.`Name`
FROM product AS p, productsubcategory AS pc
WHERE p.ProductsubcategoryID = (SELECT pc.ProductSubcategoryID
							   FROM productsubcategory pc
                               WHERE pc.`Name` = 'Saddles');

-- Ex1.Q2. Thay đổi câu Query 1 để lấy được kết quả sau.
SELECT DISTINCT `Name`
FROM product
WHERE `Name` LIKE '%Bott%';

SELECT DISTINCT `Name`
FROM product
WHERE `Name` IN (SELECT `Name`
                    FROM product
					WHERE`Name` LIKE '%Bott%');
                    
-- Ex1/Q3. Viết câu query trả về tất cả các sản phẩm có giá rẻ nhất (lowest ListPrice) và Touring Bike (nghĩa là ProductSubcategoryID = 3)
 SELECT p.`Name`, p.Listprice
 FROM product AS p, productsubcategory AS pc
 WHERE p.ProductSubcategoryID = (SELECT pc.ProductSubcategoryID
							   FROM productsubcategory pc
                               WHERE pc.`Name` = 'Touring Bikes')
AND p.ListPrice = ( SELECT MIN(ListPrice)
					FROM product
					WHERE ListPrice <>0);

-- Ex2.Q1. Viết query lấy danh sách tên country và province được lưu trong AdventureWorks2008sample database.
SELECT cr.`Name` AS country, s.`Name` AS Province
FROM stateprovince s
LEFT JOIN countryregion cr ON s.CountryRegionCode = cr.CountryRegionCode
UNION
SELECT cr.`Name`, s.`Name`
FROM stateprovince s
RIGHT JOIN countryregion cr ON s.CountryRegionCode = cr.CountryRegionCode;

-- Ex2.Q3.Tiếp tục với câu query trước và thêm điều kiện là chỉ lấy country Germany và Canada


 
 

