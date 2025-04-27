SET SQL_SAFE_UPDATES = 0;

UPDATE usersdb.users SET image = CONCAT('https://i.pravatar.cc/300?img=',FLOOR(RAND()*70));