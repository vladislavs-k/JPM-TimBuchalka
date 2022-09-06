package com.timbuchalka.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DataSource {
    public static final String DB_NAME = "music";
    public static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/";
    public static final String USER = "root";
    public static final String PASS = "test1234TEST!@#$";

    public static final String TABLE_ALBUMS = "albums";
    public static final String COLUMN_ALBUM_ID = "_id";
    public static final String COLUMN_ALBUM_NAME = "name";
    public static final String COLUMN_ALBUM_ARTIST = "artist";
    public static final int INDEX_ALBUM_ID = 1;
    public static final int INDEX_ALBUM_NAME = 2;
    public static final int INDEX_ALBUM_ARTIST = 3;

    public static final String TABLE_ARTISTS = "artists";
    public static final String COLUMN_ARTIST_ID = "_id";
    public static final String COLUMN_ARTIST_NAME = "name";
    public static final int INDEX_ARTIST_ID = 1;
    public static final int INDEX_ARTIST_NAME = 2;

    public static final String TABLE_SONGS = "songs";
    public static final String COLUMN_SONG_ID = "_id";
    public static final String COLUMN_SONG_TRACK = "track";
    public static final String COLUMN_SONG_TITLE = "title";
    public static final String COLUMN_SONG_ALBUM = "album";
    public static final int INDEX_SONG_ID = 1;
    public static final int INDEX_SONG_TRACK = 2;
    public static final int INDEX_SONG_TITLE = 3;
    public static final int INDEX_SONG_ALBUM = 4;

    public static final int ORDER_BY_NONE = 1;
    public static final int ORDER_BY_ASC = 2;
    public static final int ORDER_BY_DESC = 3;

    public static final String QUERY_ALBUMS_BY_ARTIST_START =
            "SELECT " + TABLE_ALBUMS + '.' + COLUMN_ALBUM_NAME + " FROM " + TABLE_ALBUMS +
                    " INNER JOIN " +TABLE_ARTISTS + " ON " + TABLE_ALBUMS + "." + COLUMN_ALBUM_ARTIST +
                    " = " + TABLE_ARTISTS + "." + COLUMN_ARTIST_ID +
                    " WHERE " + TABLE_ARTISTS + "." + COLUMN_ARTIST_NAME + " = \"";

    public static final String QUERY_ALBUMS_BY_ARTIST_SORT =
            " ORDER BY " + TABLE_ALBUMS + "." + COLUMN_ALBUM_NAME + " ";

    public static final String QUERY_ARTIST_FOR_SONG_START =
            "SELECT " + TABLE_ARTISTS + "." + COLUMN_ARTIST_NAME + ", " +
                    TABLE_ALBUMS + "." + COLUMN_ALBUM_NAME + ", " +
                    TABLE_SONGS + "." + COLUMN_SONG_TRACK + " FROM " + TABLE_SONGS +
                    " INNER JOIN " + TABLE_ALBUMS + " ON " +
                    TABLE_SONGS + "." + COLUMN_SONG_ALBUM + " = " + TABLE_ALBUMS + "." + COLUMN_ALBUM_ID +
                    " INNER JOIN " + TABLE_ARTISTS + " ON " +
                    TABLE_ALBUMS + "." + COLUMN_ALBUM_ARTIST + " = " + TABLE_ARTISTS + "." + COLUMN_ARTIST_ID +
                    " WHERE " + TABLE_SONGS + "." + COLUMN_SONG_TITLE + " = \"";

    public static final String QUERY_ARTIST_FOR_SONG_SORT =
            " ORDER BY " + TABLE_ARTISTS + "." + COLUMN_ARTIST_NAME + ", " +
                    TABLE_ALBUMS + "." + COLUMN_ALBUM_NAME + " ";


    private Connection conn;

    public boolean open(){
        try {
            conn = DriverManager.getConnection(CONNECTION_STRING + DB_NAME, USER, PASS);
            return true;
        } catch (SQLException e){
            System.out.println("Couldn't connect to database " + e.getMessage());
            return false;
        }
    }

    public void close(){
        try {
            if(conn != null){
                conn.close();
            }
        } catch (SQLException e){
            System.out.println("Couldn't close connection " + e.getMessage());
        }
    }

//    public List<Artist> queryArtists(){
//        Statement stmt = null;
//        ResultSet rs = null;
//
//        try {
//            stmt = conn.createStatement();
//            rs = stmt.executeQuery("SELECT * FROM " + TABLE_ARTISTS);
//
//            List<Artist> artists = new ArrayList<>();
//            while (rs.next()){
//                Artist artist = new Artist();
//                artist.setId(rs.getInt(COLUMN_ARTIST_ID));
//                artist.setName(rs.getString(COLUMN_ARTIST_NAME));
//                artists.add(artist);
//            }
//
//            return artists;
//
//        } catch (SQLException e){
//            System.out.println("Query failed: " + e.getMessage());
//            return null;
//        } finally {
//
//            try {
//                if(rs != null){
//                    rs.close();
//                }
//            } catch (SQLException e){
//                System.out.println("Error closing ResultSet: " + e.getMessage());
//                e.printStackTrace();
//            }
//
//            try {
//                if(stmt != null){
//                    stmt.close();
//                }
//            } catch (SQLException e){
//                System.out.println("Error closing Statement: " + e.getMessage());
//                e.printStackTrace();
//            }
//        }
//    }


    public List<Artist> queryArtists(int sortOrder){
        StringBuilder sb = new StringBuilder("SELECT * FROM ");
        sb.append(TABLE_ARTISTS);
        if(sortOrder != ORDER_BY_NONE){
            sb.append(" ORDER BY ");
            sb.append(COLUMN_ARTIST_NAME);
            if (sortOrder == ORDER_BY_DESC){
                sb.append(" DESC");
            }else {
                sb.append(" ASC");
            }
        }

        try ( Statement stmt = conn.createStatement();
              ResultSet rs = stmt.executeQuery(sb.toString())){

            List<Artist> artists = new ArrayList<>();
            while (rs.next()){
                Artist artist = new Artist();
//                artist.setId(rs.getInt(COLUMN_ARTIST_ID));
                artist.setId(rs.getInt(INDEX_ARTIST_ID));
//                artist.setName(rs.getString(COLUMN_ARTIST_NAME));
                artist.setName(rs.getString(INDEX_ARTIST_NAME));
                artists.add(artist);
            }

            return artists;

        } catch (SQLException e){
            System.out.println("Query failed: " + e.getMessage());
            return null;
        }
    }

    public List<String> queryAlbumsForArtist(String artistName, int sortOrder){

        //SELECT albums.name FROM albums INNER JOIN artists ON albums.artist = artists._id
        // WHERE artists.name = 'Carole King' ORDER BY albums.name ASC;
        StringBuilder sb = new StringBuilder(QUERY_ALBUMS_BY_ARTIST_START);

//        StringBuilder sb = new StringBuilder("SELECT ");
//        sb.append(TABLE_ALBUMS);
//        sb.append(".");
//        sb.append(COLUMN_ARTIST_NAME);
//        sb.append(" FROM ");
//        sb.append(TABLE_ALBUMS);
//        sb.append(" INNER JOIN ");
//        sb.append(TABLE_ARTISTS);
//        sb.append(" ON ");
//        sb.append(TABLE_ALBUMS);
//        sb.append(".");
//        sb.append(COLUMN_ALBUM_ARTIST);
//        sb.append(" = ");
//        sb.append(TABLE_ARTISTS);
//        sb.append(".");
//        sb.append(COLUMN_ARTIST_ID);
//        sb.append(" WHERE ");
//        sb.append(TABLE_ARTISTS);
//        sb.append(".");
//        sb.append(COLUMN_ARTIST_NAME);
//        sb.append(" = \"");

        sb.append(artistName);
        sb.append("\"");

        if (sortOrder != ORDER_BY_NONE){
            sb.append(QUERY_ALBUMS_BY_ARTIST_SORT);
//            sb.append(" ORDER BY ");
//            sb.append(TABLE_ALBUMS);
//            sb.append(".");
//            sb.append(COLUMN_ALBUM_NAME);
//            sb.append(" ");
            if (sortOrder == ORDER_BY_DESC){
                sb.append("DESC");
            } else {
                sb.append("ASC");
            }
        }

        System.out.println("SQL statement = " + sb.toString());

        try (Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sb.toString())){

            List<String> albums = new ArrayList<>();
            while (rs.next()){
                albums.add(rs.getString(1));
            }

            return albums;

        }catch (SQLException e){
            System.out.println("Query failed: " + e.getMessage());
            return null;
        }

    }



}
