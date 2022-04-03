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

CREATE TABLE LockedIn.job(
job_id INT NOT NULL AUTO_INCREMENT,
company_id INT ,
description VARCHAR(200), 
salary INT ,
location VARCHAR(100),
PRIMARY KEY ( job_id ),
Foreign key (company_id) references LockedIn.company(company_id)
);

INSERT INTO LockedIn.job Values(50001,20001, "developer", 100000, "MD");
INSERT INTO LockedIn.job Values(50002, 20002, "developer", 100000, "MD");
-- INSERT INTO LockedIn.job (job_id, company_id, description, salary, location) 
-- Values(555, 555, "developer", 100000, "MD", 666, 666, "developer", 100000, "MD");


CREATE TABLE LockedIn.Matching_Job (
matching_job_id INT NOT NULL AUTO_INCREMENT,
user_id INT,
job_id INT,
PRIMARY KEY (matching_job_id),
FOREIGN KEY (user_id) references LockedIn.user(user_id)
);

INSERT INTO LockedIn.Matching_Job Values(90001,10001, 50000);
INSERT INTO LockedIn.Matching_Job Values(90001,10001, 500001);

