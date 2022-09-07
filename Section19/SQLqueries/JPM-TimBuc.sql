SET SQL_SAFE_UPDATES = 0;

CREATE DATABASE jpm_timbuc;

USE jpm_timbuc;

CREATE TABLE contacts(
name TEXT,
phone INT,
email TEXT );

INSERT INTO contacts(name, phone, email)
VALUES ('Tim', 6545678, 'tim@email.com');

-- DELETE FROM contacts;

SELECT * FROM contacts;

SELECT name, phone, email FROM contacts;

SELECT email FROM contacts;

INSERT INTO contacts VALUES ("Brian", 1234, "brian@email.com");

INSERT INTO contacts VALUES ("Steve", 87654);

INSERT INTO contacts (name, phone) VALUES ("Steve", 87654);

INSERT INTO contacts VALUES ("Avril", "+61 (0)87654321", "avril@email.com.au"); -- In SQLite it'll work but not int MySQL.

UPDATE contacts SET email="steve@email.com";

UPDATE contacts SET email="steve@email.com" WHERE name = "Steve";

UPDATE contacts SET email="steve@hisemail.com" WHERE name = 'Steve';

SELECT * FROM contacts WHERE name = "Brian";

SELECT phone, email FROM contacts WHERE name = "Brian";

DELETE FROM contacts WHERE phone=1234;

SHOW TABLES;

