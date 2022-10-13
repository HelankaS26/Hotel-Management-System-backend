/****************************************************** bill insert procedure *********************************************************************/
DELIMITER $$

CREATE PROCEDURE addBill(
	IN orderID INT,
    IN itemID CHAR(8),
    IN unitPrice DECIMAL(7,2),
    IN quantity INT
)  
BEGIN
	INSERT INTO bills (
		orderID,
        itemID,
        quantity,
        unitPrice)
    VALUES (orderID, itemID, quantity, unitPrice);
END$$

DELIMITER ;

CALL addReservation(2, 1, 20000.00);