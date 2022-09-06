USE music;

SELECT * FROM artists;
SELECT * FROM albums;
SELECT * FROM songs;

SELECT * FROM albums WHERE artist = 8;
SELECT albums.name FROM albums INNER JOIN artists ON albums.artist = artists._id WHERE artists.name = 'Iron Maiden' ORDER BY albums.name ASC;

SELECT * FROM albums WHERE artist = 130;
SELECT albums.name FROM albums INNER JOIN artists ON albums.artist = artists._id WHERE artists.name = 'Pink Floyd' ORDER BY albums.name ASC;

SELECT albums.name FROM albums INNER JOIN artists ON albums.artist = artists._id WHERE artists.name = 'Carole King' ORDER BY albums.name ASC;
