create database aspiresystems;
use aspiresystems;
CREATE TABLE Employees (
    employee_id INT PRIMARY KEY,
    employee_name VARCHAR(100),
    dob DATE,
    doj DATE,
    blood_group VARCHAR(5),
    address VARCHAR(255),
    designation ENUM('Training', 'Development', 'insurance', 'HR'),
    location ENUM('Chennai', 'Hyderabad', 'Kochi'),
    mobile_number VARCHAR(20),
    salary DECIMAL(10, 2)
);
INSERT INTO Employees (employee_id, employee_name, dob, doj, blood_group, address, designation, location, mobile_number, salary) VALUES
(1, 'Sandhiya', '2002-05-12', '2019-01-15', 'A1+', '1 annna nagar Chennai', 'insurance', 'Chennai', '9876543210', 15000.00),
(2, 'dharani', '2003-09-25', '2019-11-20', 'A-', '56 Onam street, Hyderabad', 'insurance', 'Hyderabad', '9123456789', 20000.00),
(3, 'janani', '2002-02-10', '2024-03-22', 'O+', '9 Kochi', 'HR','chennai','9988776655', 45000.00),
(4, 'vaishu', '2000-07-30', '2023-06-10', 'AB+', '309 kocil street, Chennai', 'Training', 'Chennai', '9444332211', 90000.00),
(5, 'sharan', '2001-11-05', '2021-08-14', 'O-', '705 puliyakulam, Hyderabad', 'Development', 'Hyderabad', '9612345678', 15000.00);
select * from Employees;

SELECT * FROM senior_most_employee;
CREATE OR REPLACE VIEW senior_most_employee AS
SELECT *
FROM employees
WHERE doj = (SELECT MIN(doj) FROM employees);
create view detailss_employee
as
select *from employees
where location="chennai" or DESIGNATION="training";
SELECT
*from detailss_employee;
CREATE TABLE Products (
    ProductID INT PRIMARY KEY,          
    ProductName VARCHAR(100) NOT NULL, 
    Category VARCHAR(50),              
    Price DECIMAL(10, 2) NOT NULL,     
	SupplierID INT                   
);

INSERT INTO Products (ProductID, ProductName, Category, Price, SupplierID) 
VALUES 
(1, 'Laptop', 'Electronics', 75000.00, 101),
(2, 'Smartphone', 'Electronics', 25000.00, 102),
(3, 'Refrigerator', 'Appliances', 40000.00,  103),
(4, 'Microwave Oven', 'Appliances', 15000.00, 104),
(5, 'Notebook', 'Stationery', 50.00, NULL);

select * from products;

SHOW TABLES;