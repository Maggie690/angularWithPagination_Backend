SET SQL_SAFE_UPDATES = 0;

UPDATE `users` SET `status` = CASE
    WHEN (id % 2 = 0) THEN 'BANNED'
    WHEN (id % 3 = 0) THEN 'PENDING'
    WHEN (id % 5 = 0) THEN 'ACTIVE'
	WHEN (id % 7 = 0) THEN 'INACTIVE'
    ELSE 'ACTIVE'
    END