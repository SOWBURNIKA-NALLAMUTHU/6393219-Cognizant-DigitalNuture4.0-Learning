CREATE DATABASE BankSystem;
USE BankSystem;


CREATE TABLE Customers (
    CustomerID INT PRIMARY KEY,
    Name VARCHAR(100),
    Age INT,
    Balance DECIMAL(10,2),
    InterestRate DECIMAL(5,2),
    IsVIP VARCHAR(5)
);



CREATE TABLE Loans (
    LoanID INT PRIMARY KEY,
    CustomerID INT,
    DueDate DATE,
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);


INSERT INTO Customers VALUES
(101, 'Alice', 55, 8000.00, 7.5, 'FALSE'),
(102, 'Bob', 58, 12000.00, 5.9, 'FALSE'),
(103, 'Charlie', 23, 9500.00, 8.1, 'FALSE'),
(104, 'David', 89, 15000.00, 7.2, 'FALSE');

INSERT INTO Loans VALUES
(201, 101, CURDATE() + INTERVAL 10 DAY),
(202, 102, CURDATE() + INTERVAL 30 DAY),
(203, 103, CURDATE() + INTERVAL 5 DAY);

Select * from Customers;
Select * from Loans;

UPDATE Customers
SET InterestRate = InterestRate - 1
WHERE Age > 60;

SELECT * FROM Customers;



UPDATE Customers
SET IsVIP = 'TRUE'
WHERE Balance > 10000;

SELECT * FROM Customers;


SELECT c.CustomerID, c.Name, l.LoanID, l.DueDate
FROM Loans l
JOIN Customers c ON c.CustomerID = l.CustomerID
WHERE l.DueDate <= CURDATE() + INTERVAL 30 DAY;
