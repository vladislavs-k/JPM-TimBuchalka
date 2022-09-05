package com.timbuchalka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testjava";
        String user = "root";
        String pass = "test1234TEST!@#$";

        try{
            Connection conn = DriverManager.getConnection(url, user, pass);
            Statement stmt = conn.createStatement();

            stmt.execute("CREATE TABLE contacts (name TEXT, phone INT, email TEXT)");
            
            stmt.close();
            conn.close();
        } catch (SQLException e){
            System.out.println("Something went wrong " + e.getMessage());
        }
    }
}
