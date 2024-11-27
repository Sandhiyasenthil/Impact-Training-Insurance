create database pratice;
use pratice;
CREATE TABLE Employee (
    EmployeeID INT PRIMARY KEY,        
    FirstName VARCHAR(50) NOT NULL,    
    LastName VARCHAR(50) NOT NULL,     
    DateOfBirth DATE NOT NULL,         
    HireDate DATE NOT NULL,            
    Email VARCHAR(100) UNIQUE NOT NULL, 
    PhoneNumber BIGINT(15),           
    DepartmentID INT,                  
    Salary DECIMAL(10, 2) NOT NULL,    
    Position VARCHAR(50) ,  
    project VARCHAR(10)
    
        
);
INSERT INTO Employee (
    EmployeeID, 
    FirstName, 
    LastName, 
    DateOfBirth, 
    HireDate, 
    Email, 
    PhoneNumber, 
    DepartmentID, 
    Salary, 
    Position,
    project
    
) VALUES
(1, 'Alice', 'Johnson', '1990-05-15', '2020-01-10', 'alice.johnson@example.com', '1234567890', 101, 60000.00, 'Software Engineer',"A"),
(2, 'Bob', 'Smith', '1985-09-20', '2018-03-15', 'bob.smith@example.com', '9876543210', 102, 80000.00, 'Project Manager',"B"),
(3, 'Charlie', 'Brown', '1992-12-05', '2021-07-01', 'charlie.brown@example.com', '5551234567', 103, 50000.00, 'QA Analyst',"A"),
(4, 'Diana', 'Taylor', '1995-08-25', '2023-06-15', 'diana.taylor@example.com', NULL, 104, 55000.00, 'HR Specialist',"B");
select *from employee;
select firstname, salary from employee;

select*from employee where hiredate=2000;

select avG(SALARY) FROM EMPLOYEE;

 select max(salary) as highest_salary from employee;
 select sum(salary) as total_salary from employee;
 select count(*) from employee group by position;
 
 
 
 
 SELECT FirstName, LastName, Salary
FROM Employee
WHERE Salary = (
    SELECT MAX(Salary)
    FROM Employee
    WHERE Salary < (SELECT MAX(Salary) FROM Employee)
);
 select firstname,lastname from employee where salary>(select avg(salary)from employee);
 select *from employee where salary>(select avg(salary) from employee);
 select * from employee where position='HR';
 select name from employee where position='HR' or position='FINANCE';
 select name from employee where project = 'A' and project = 'B';
 select * from employee where project is null;
 INSERT INTO Employee (
    EmployeeID, 
    FirstName, 
    LastName, 
    DateOfBirth, 
    HireDate, 
    Email, 
    PhoneNumber, 
    DepartmentID, 
    Salary, 
    Position,
    project
    
) VALUES (10, 'Ali', 'Johnon', '1999-05-15', '2010-01-10', 'alic.johnson@example.com', '1234567090', 191, 90000.00, 'Software Engineer',"A");
 
 
 
update employee set salary = salary*1.10 where position='HR';
SET SQL_SAFE_UPDATES = 0;
DELETE FROM Employee
WHERE DATEDIFF(CURDATE(), HireDate) / 365 <= 5;
create table department(D_Id int primary key,Dept_name varchar(20));
Alter table employee add primary key(EmpId);
SELECT 
    CONSTRAINT_NAME, 
    CONSTRAINT_TYPE, 
    TABLE_NAME 
FROM 
    INFORMATION_SCHEMA.TABLE_CONSTRAINTS 
WHERE 
    TABLE_NAME = 'Employee';
drop table department;
 DROP TABLE EMPLOYEE;
 ALTER TABLE Employee
MODIFY email VARCHAR(15) NULL;