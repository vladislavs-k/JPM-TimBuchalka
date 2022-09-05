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

    public static final String TABLE_ARTISTS = "artists";
    public static final String COLUMN_ARTIST_ID = "_id";
    public static final String COLUMN_ARTIST_NAME = "name";

    public static final String TABLE_SONGS = "songs";
    public static final String COLUMN_SONG_TRACK = "track";
    public static final String COLUMN_SONG_TITLE = "title";
    public static final String COLUMN_SONG_ALBUM = "album";

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


    public List<Artist> queryArtists(){

        try ( Statement stmt = conn.createStatement();
              ResultSet rs = stmt.executeQuery("SELECT * FROM " + TABLE_ARTISTS)){

            List<Artist> artists = new ArrayList<>();
            while (rs.next()){
                Artist artist = new Artist();
                artist.setId(rs.getInt(COLUMN_ARTIST_ID));
                artist.setName(rs.getString(COLUMN_ARTIST_NAME));
                artists.add(artist);
            }

            return artists;

        } catch (SQLException e){
            System.out.println("Query failed: " + e.getMessage());
            return null;
        }
    }




}
