create database demo1;
use demo1;
START TRANSACTION;
CREATE TABLE employees (
    employee_id INT PRIMARY KEY,
    name VARCHAR(100),
    salary DECIMAL(10, 2)
);
-- Insert data into the employees table
INSERT INTO employees (employee_id, name, salary) VALUES (102, 'John', 5000);
INSERT INTO employees (employee_id, name, salary) VALUES (101, 'John Doe', 50000);
SAVEPOINT after_insert;

-- Update salary for the employee
UPDATE employees
SET salary = 55000
WHERE employee_id = 101;

-- Rollback to the savepoint to undo only the UPDATE
ROLLBACK TO SAVEPOINT after_insert;

-- Commit the insert, but not the update
COMMIT; 
select *from employees;
drop table employees;