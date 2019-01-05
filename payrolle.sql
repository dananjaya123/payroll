drop PROCEDURE if EXISTS AddEmployee;
DELIMITER $$;
CREATE PROCEDURE AddEmployee(in employeeID VARCHAR(100),in employeeName VARCHAR(100),in dateOfBirth VARCHAR(100),in id VARCHAR(100),in addreess VARCHAR(200), in phoneNo int , in desId VARCHAR(100),in LevelID VARCHAR(100),in deignationDate VARCHAR(100))
BEGIN

DECLARE EXIT HANDLER FOR 1062
	BEGIN
		SELECT 'Duplicate keys error encountered';
		ROLLBACK;
	END;
DECLARE EXIT HANDLER FOR SQLEXCEPTION
	BEGIN
		SELECT 'SQL Exception encountered';
		ROLLBACK;
	END;
	START TRANSACTION;
insert into employee values(employeeID,employeeName,dateOfBirth,id,addreess,phoneNo);
insert INTO deignationdetail VALUES(desId,employeeID,LevelID,deignationDate); 
COMMIT;
End$$;
DELIMITER ;


CALL AddEmployee('E001','sira','1998.10.10','123456789v','galle',0821482,'d001','L001','2018.12.12');
CALL AddEmployee('E002','asi','1998.10.10','123456789v','galle',0821482,'d002','L002','2018.12.12');
CALL AddEmployee('E003','dana','1998.10.10','123456789v','galle',0821482,'d003','L003','2018.12.12');

//////////////////////////////////////////////////////////////////////////////////////////////////////////

drop PROCEDURE if EXISTS DeleteEmployee;
DELIMITER $$;
CREATE PROCEDURE deleteEmployee(in employeeID VARCHAR(100))
BEGIN

DECLARE EXIT HANDLER FOR 1062
SELECT 'Duplicate keys error encountered';
DECLARE EXIT HANDLER FOR SQLEXCEPTION
SELECT 'SQL Exception encountered';

delete From employee where EmpID=employeeID;

END$$;
DELIMITER ;

call deleteEmployee('E001');

//////////////////////////////////////////////////////////////////////////////////////////////////////////

drop PROCEDURE if EXISTS UpdateEmployee;
DELIMITER $$;
CREATE PROCEDURE updateEmployee(in employeeName VARCHAR(100),in dateOfBirth VARCHAR(100),in id VARCHAR(100),in addreess VARCHAR(200), in phoneNo int ,in employeeID VARCHAR(100))
BEGIN

DECLARE EXIT HANDLER FOR 1062
SELECT 'Duplicate keys error encountered';
DECLARE EXIT HANDLER FOR SQLEXCEPTION
SELECT 'SQL Exception encountered';

update employee set EmpName=employeeName, DOB=dateOfBirth,NIC=id ,Address=addreess ,MobileNumber=phoneNo where EmpID=employeeID;

END$$;
DELIMITER ;

CALL updateEmployee('asi','1998.10.10','123456789v','galle',0821482,'E002');


//////////////////////////////////////////////////////////////////////////////////////////////////////////

DROP PROCEDURE IF EXISTS GETALLEMPLOYEE;
DELIMITER $$;
CREATE PROCEDURE GETALLEMPLOYEE()
BEGIN

DECLARE EXIT HANDLER FOR 1062
SELECT 'Duplicate keys error encountered';
DECLARE EXIT HANDLER FOR SQLEXCEPTION
SELECT 'SQL Exception encountered';

SELECT * FROM EMPLOYEE;

END$$;
DELIMITER ;

CALL GETALLEMPLOYEE();

////////////////////////////////////////////////////////////////////////////////////////

DROP PROCEDURE IF EXISTS SEARCHCOMBOEMPLOYEE;
DELIMITER $$;
CREATE PROCEDURE SEARCHCOMBOEMPLOYEE()
BEGIN

DECLARE EXIT HANDLER FOR 1062
SELECT 'Duplicate keys error encountered';
DECLARE EXIT HANDLER FOR SQLEXCEPTION
SELECT 'SQL Exception encountered';

SELECT * FROM LEVEL;

END$$;
DELIMITER ;

CALL SEARCHCOMBOEMPLOYEE();


////////////////////////////////////////////////////////////////////////////////////////



DROP PROCEDURE IF EXISTS SEARCHLEVEL;
DELIMITER $$;
CREATE PROCEDURE SEARCHLEVEL(in id varchar(20))
BEGIN

DECLARE EXIT HANDLER FOR 1062
SELECT 'Duplicate keys error encountered';
DECLARE EXIT HANDLER FOR SQLEXCEPTION
SELECT 'SQL Exception encountered';
 select *from level where LvlID=id;

END$$;
DELIMITER ;

///////////////////////////////////////////////////////////////////////////////////////

DROP PROCEDURE IF deignationdetail;

DELIMITER $$;
CREATE PROCEDURE deignationdetail(IN ID VARCHAR(30))
BEGIN


DECLARE EXIT HANDLER FOR 1062
SELECT 'Duplicate keys error encountered';
DECLARE EXIT HANDLER FOR SQLEXCEPTION
SELECT 'SQL Exception encountered';

SELECT * FROM deignationdetail WHERE DesDetailID=ID;

END$$;
DELIMITER ;