SELECT c.Name,
       l.LoanID,
       l.DueDate
FROM Customers c
JOIN Loans l
ON c.CustomerID=l.CustomerID
WHERE l.DueDate BETWEEN SYSDATE AND SYSDATE+30;