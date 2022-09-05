USE music;
SHOW tables;
DESCRIBE albums;
-- SELECT * FROM information_schema.columns WHERE table_schema = 'db_name';
SELECT * FROM information_schema.columns WHERE table_schema = 'music';

SELECT * FROM artists;
SELECT * FROM albums;
SELECT * FROM artists WHERE _id = 133;
SELECT * FROM songs;

SELECT name FROM albums WHERE _id = 367;
SELECT title FROM songs WHERE album = 367;

INSERT INTO artists VALUES (201, "Beyonce");
DELETE FROM artists WHERE name = 'Beyonce';

INSERT INTO artists (name) VALUES ("Beyonce");

SELECT * FROM artists ORDER BY name;
SELECT * FROM albums ORDER BY name;
SELECT * FROM albums ORDER BY name DESC;

SELECT * FROM albums ORDER BY artist, name;

SELECT * FROM songs ORDER BY album, track;

SELECT * FROM albums WHERE _id = 439;
SELECT * FROM artists WHERE _id = 133;

SELECT songs.track, songs.title, albums.name FROM songs JOIN albums ON songs.album = albums._id;
SELECT songs.track, songs.title, albums.name FROM songs INNER JOIN albums ON songs.album = albums._id;

SELECT songs.track, songs.title, albums.name 
FROM songs INNER JOIN albums ON songs.album = albums._id
ORDER BY albums.name, songs.track;

SELECT albums.name, songs.track, songs.title
FROM songs INNER JOIN albums ON songs.album = albums._id
ORDER BY albums.name, songs.track;

SELECT artists.name, albums.name
FROM albums INNER JOIN artists ON albums.artist = artists._id
ORDER BY artists.name;

SELECT artists.name, albums.name, songs.track, songs.title FROM songs 
INNER JOIN albums ON songs.album = albums._id
INNER JOIN artists ON albums.artist = artists._id
ORDER BY artists.name, albums.name, songs.track;

SELECT artists.name, albums.name, songs.track, songs.title FROM songs 
INNER JOIN albums ON songs.album = albums._id
INNER JOIN artists ON albums.artist = artists._id
WHERE albums._id = 19
ORDER BY artists.name, albums.name, songs.track;

SELECT artists.name, albums.name, songs.track, songs.title FROM songs 
INNER JOIN albums ON songs.album = albums._id
INNER JOIN artists ON albums.artist = artists._id
WHERE albums.name = "Doolittle"
ORDER BY artists.name, albums.name, songs.track;

SELECT artists.name, albums.name, songs.track, songs.title FROM songs 
INNER JOIN albums ON songs.album = albums._id
INNER JOIN artists ON albums.artist = artists._id
WHERE songs.title LIKE '%doctor%'
ORDER BY artists.name, albums.name, songs.track;

SELECT artists.name, albums.name, songs.track, songs.title FROM songs 
INNER JOIN albums ON songs.album = albums._id
INNER JOIN artists ON albums.artist = artists._id
WHERE artists.name LIKE 'jefferson%'
ORDER BY artists.name, albums.name, songs.track;

CREATE VIEW artist_list AS
SELECT artists.name AS artist_name, albums.name AS album_name, songs.track, songs.title FROM songs 
INNER JOIN albums ON songs.album = albums._id
INNER JOIN artists ON albums.artist = artists._id
ORDER BY artists.name , albums.name, songs.track;

SELECT * FROM artist_list;

SELECT * FROM artist_list WHERE artist_name LIKE 'jefferson%';

CREATE VIEW album_list AS
SELECT name FROM albums
ORDER BY name;

SELECT * FROM album_list;

SELECT * FROM artist_list WHERE artist_name LIKE 'jeffer%';