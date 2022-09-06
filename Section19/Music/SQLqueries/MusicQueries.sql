USE music;

SELECT * FROM artists;
SELECT * FROM albums;
SELECT * FROM songs;

SELECT * FROM albums WHERE artist = 8;
SELECT albums.name FROM albums INNER JOIN artists ON albums.artist = artists._id WHERE artists.name = 'Iron Maiden' ORDER BY albums.name ASC;

SELECT * FROM albums WHERE artist = 130;
SELECT albums.name FROM albums INNER JOIN artists ON albums.artist = artists._id WHERE artists.name = 'Pink Floyd' ORDER BY albums.name ASC;

SELECT albums.name FROM albums INNER JOIN artists ON albums.artist = artists._id WHERE artists.name = 'Carole King' ORDER BY albums.name ASC;

SELECT * FROM songs WHERE title = 'Heartless';
SELECT * FROM albums WHERE _id = 308;
SELECT * FROM artists WHERE _id = 39;

SELECT * FROM songs WHERE title = "She's On Fire";
SELECT * FROM albums WHERE _id = 416;
SELECT * FROM artists WHERE _id = 92;

SELECT * FROM songs WHERE title = "Go Your Own Way";
SELECT * FROM albums WHERE _id = 248;
SELECT * FROM artists WHERE _id = 152;

SELECT artists.name, albums.name, songs.track FROM songs
INNER JOIN albums ON songs.album = albums._id
INNER JOIN artists ON albums.artist = artists._id
WHERE songs.title = "Go Your Own Way"
ORDER BY artists.name, albums.name ASC;

CREATE OR REPLACE VIEW artist_list AS
SELECT artists.name AS artist_name, albums.name AS album_name, songs.track, songs.title FROM songs 
INNER JOIN albums ON songs.album = albums._id
INNER JOIN artists ON albums.artist = artists._id
ORDER BY artists.name , albums.name, songs.track;