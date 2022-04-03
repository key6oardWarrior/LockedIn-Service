CREATE DATABASE LockedIn;
CREATE TABLE LockedIn.User (
user_id INT NOT NULL AUTO_INCREMENT,
user_name VARCHAR(100),
address VARCHAR(200),
PRIMARY KEY (user_id));
INSERT INTO LockedIn.User Values( 10001, "David " , "11 Jersey Rd") ;
INSERT INTO LockedIn.User Values( 10002, "Jason " , "15 Ends St ") ;
SELECT * FROM LockedIn.USER ;


CREATE TABLE LockedIn.Company (
company_id INT NOT NULL AUTO_INCREMENT,
rating VARCHAR(5),
culture VARCHAR(200),
PRIMARY KEY (company_id));
INSERT INTO LockedIn.Company Values( 20001, "4" , "Diverse ") ;
INSERT INTO LockedIn.Company Values( 20002, "3" , "abc ") ;
SELECT * FROM LockedIn.Company ;

/*CREATE TABLE LockedIn.LockedIn_tbl(
id INT NOT NULL AUTO_INCREMENT,
LockedIn_Name VARCHAR(100) NOT NULL,
PRIMARY KEY ( LockedIn_id )
);*/
SELECT * FROM LockedIn.LockedIn_tbl ;
INSERT INTO LockedIn.LockedIn_tbl Values(123, "Jane Doe") ;

DROP TABLE LockedIn.job;

CREATE TABLE LockedIn.job(
job_id INT NOT NULL AUTO_INCREMENT,
company VARCHAR(200),
description VARCHAR(200),
skills VARCHAR(200), 
salary INT ,
location VARCHAR(100),
PRIMARY KEY ( job_id ));

INSERT INTO LockedIn.job Values(50001,"Google", "Software Engineer", "Java, SpringBoot, SQL", 100000, "MD");
INSERT INTO LockedIn.job Values(50002,"Lincoln Financial Group", "Senior Software Engnieer", "Python, ShellScript", 100000, "MD");
-- INSERT INTO LockedIn.job (job_id, company_id, description, salary, location) 
-- Values(555, 555, "developer", 100000, "MD", 666, 666, "developer", 100000, "MD");

DROP TABLE LockedIn.Matching_Job;

CREATE TABLE LockedIn.Matching_Job (
user_id INT,
job_id INT
);

INSERT INTO LockedIn.Matching_Job Values(10001, 50000);
INSERT INTO LockedIn.Matching_Job Values(10001, 500001);