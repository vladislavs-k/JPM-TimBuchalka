package com.timbuchalka;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testjava";
        String user = "root";
        String pass = "test1234TEST!@#$";

        try{
            Connection conn = DriverManager.getConnection(url, user, pass);
//            conn.setAutoCommit(false);
            Statement stmt = conn.createStatement();

            stmt.execute("CREATE TABLE IF NOT EXISTS contacts" +
                            " (name TEXT, phone INT, email TEXT)");

//            stmt.execute("INSERT INTO contacts (name, phone, email) " +
//                              "VALUES ('Tim', 6544678, 'tim@email.com')");

//            stmt.execute("INSERT INTO contacts (name, phone, email) " +
//                    "VALUES ('Joe', 45632, 'joe@anywhere.com')");
//
//            stmt.execute("INSERT INTO contacts (name, phone, email) " +
//                    "VALUES ('Jane', 4829484, 'jane@somewhere.com')");
//
//            stmt.execute("INSERT INTO contacts (name, phone, email) " +
//                    "VALUES ('Fido', 9038, 'dog@email.com')");

//            stmt.execute("UPDATE contacts SET phone = 5566789 WHERE name = 'Jane'");

//            stmt.execute("DELETE FROM contacts WHERE name = 'Joe'");

            stmt.execute("SELECT * FROM contacts");
            ResultSet resultSet = stmt.getResultSet();
            while (resultSet.next()){
                String name = resultSet.getString("name");
                String phone = resultSet.getString("phone");
                String email = resultSet.getString("email");
                System.out.println(name + " " + phone + " " + email);
            }
            resultSet.close();

            stmt.close();
            conn.close();
        } catch (SQLException e){
            System.out.println("Something went wrong " + e.getMessage());
        }
    }
}
