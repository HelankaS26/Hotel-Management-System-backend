/****************************************************** users insert procedure *********************************************************************/
DELIMITER $$

CREATE PROCEDURE addUser(
	IN username VARCHAR(30),
	IN password CHAR(100),
	IN employeeID CHAR(8)
)  
BEGIN
	DECLARE userID CHAR(8);
    
	SET userID = generateUserID();

	INSERT INTO users (
		userID,
		username,
		password,
		employeeID) 
    VALUES (userID, username, MD5(password), employeeID);
END$$

DELIMITER ;

CALL addUser('hotelAdmin', '123abc', 'CASHR001');


/****************************************************** users update procedure *********************************************************************/
DELIMITER $$

CREATE PROCEDURE updateUser(
	IN id CHAR(8), 
	IN username VARCHAR(30),
	IN status CHAR(10)
)  
BEGIN
	UPDATE users
    SET 
		username = username,
        status = status
    WHERE userID = id;
END$$

DELIMITER ;

CALL updateUser('USERS001', 'hotelAdmin1', 'Active');



/****************************************************** users password update procedure *********************************************************************/
DELIMITER $$

CREATE PROCEDURE changeUserPassword(
	IN id CHAR(8), 
	IN password CHAR(100)
)  
BEGIN
	UPDATE users
    SET 
		password = MD5(password)
    WHERE userID = id;
END$$

DELIMITER ;

CALL changeUserPassword('USERS001', 'abc123');
