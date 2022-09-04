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