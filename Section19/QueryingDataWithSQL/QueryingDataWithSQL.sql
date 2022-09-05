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



DELETE FROM songs WHERE track < 50;
SELECT * FROM artist_list;
SELECT * FROM songs WHERE track <> 71;
SELECT count(*) FROM songs;
SELECT count(*) FROM albums;
SELECT count(*) FROM artists;



-- Challenges ---------------------------------------------

-- Challenge 1: Select the titles of all the songs on the album "Forbidden".
SELECT songs.title FROM songs
INNER JOIN albums ON songs.album = albums._id
WHERE albums.name = "Forbidden";
-- SELECT songs.title FROM songs WHERE album = 252;


-- Challenge 2: Repeat the previous query but this time display the songs in track order.
-- 				You may want to include the track number in the output to verify that it worked ok.
SELECT songs.track, songs.title FROM songs
INNER JOIN albums ON songs.album = albums._id
WHERE albums.name = "Forbidden"
ORDER BY songs.track;


-- Challenge 3: Display all songs for the band "Deep Purple".
SELECT title FROM songs
INNER JOIN albums ON songs.album = albums._id
INNER JOIN artists ON albums.artist = artists._id
WHERE artists.name LIKE "Deep Purple";
-- SELECT * FROM albums WHERE artist = 196;
-- SELECT * FROM artists WHERE name LIKE '%Deep%';


-- Challenge 4: Rename the band "Mehitabel" to "One Kitten". Note that this is an exception
-- 				to the advice to always fully qualify your column names. SET artists.name
-- 				won't work, you just need to specify name.
UPDATE artists SET name = "One Kitten" WHERE artists.name = "Mehitabel";
-- SELECT * FROM artists WHERE name LIKE '%Meh%';
-- SELECT * FROM artists WHERE _id = 3;


-- Challenge 5: Check that record was correctly renamed.
SELECT * FROM artists WHERE artists.name LIKE "One%";


-- Challenge 6: Select the titles of all the songs by Aerosmith in alphabetical order. 
-- 				Include only the title in the output.
SELECT title FROM songs
INNER JOIN albums ON songs.album = albums._id
INNER JOIN artists ON albums.artist = artists._id
WHERE artists.name LIKE 'Aerosmith'
ORDER BY title;


-- Challenge 7: Replace the column that you used in the previous answer with count(title)
-- 				to get just a count of the number of songs.
SELECT count(title) FROM songs
INNER JOIN albums ON songs.album = albums._id
INNER JOIN artists ON albums.artist = artists._id
WHERE artists.name LIKE 'Aerosmith'
ORDER BY title;


-- Challenge 8: Search the Internet to find out how to get a list of the songs 
-- 				from step 6 without any duplicates.
SELECT DISTINCT title FROM songs
INNER JOIN albums ON songs.album = albums._id
INNER JOIN artists ON albums.artist = artists._id
WHERE artists.name LIKE 'Aerosmith'
ORDER BY title;


-- Challenge 9: Search the Internet again to find out how to get a count of
-- 				the songs without duplicates. 
SELECT count(DISTINCT title) FROM songs
INNER JOIN albums ON songs.album = albums._id
INNER JOIN artists ON albums.artist = artists._id
WHERE artists.name LIKE 'Aerosmith'
ORDER BY title;


-- Challenge 10: Repeat the previous query to find the nuber of artists
-- 				 (which, obviously, should be one) and the number of albums.
SELECT count(DISTINCT artists.name) FROM songs
INNER JOIN albums ON songs.album = albums._id
INNER JOIN artists ON albums.artist = artists._id
WHERE artists.name LIKE 'Aerosmith';

SELECT count(DISTINCT albums.name) FROM songs
INNER JOIN albums ON songs.album = albums._id
INNER JOIN artists ON albums.artist = artists._id
WHERE artists.name LIKE 'Aerosmith';

