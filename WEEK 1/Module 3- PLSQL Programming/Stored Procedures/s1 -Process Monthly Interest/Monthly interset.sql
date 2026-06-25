CREATE TABLE SavingsAccounts (
    AccountID NUMBER PRIMARY KEY,
    CustomerName VARCHAR2(50),
    Balance NUMBER
);

INSERT INTO SavingsAccounts VALUES (101,'Janani',10000);
INSERT INTO SavingsAccounts VALUES (102,'Priya',20000);

COMMIT;

CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest
AS
BEGIN
    UPDATE SavingsAccounts
    SET Balance = Balance + (Balance * 0.01);

    COMMIT;
END;
/

BEGIN
    ProcessMonthlyInterest;
END;
/
SELECT * FROM SavingsAccounts;