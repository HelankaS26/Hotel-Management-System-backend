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
