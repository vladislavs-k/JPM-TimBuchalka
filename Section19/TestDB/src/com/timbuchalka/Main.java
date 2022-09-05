package com.timbuchalka;

import java.sql.*;

public class Main {
    public static final String DB_NAME = "testjava";
    public static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/";
    public static final String USER = "root";
    public static final String PASS = "test1234TEST!@#$";

    public static final String TABLE_CONTACTS = "contacts";

    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_PHONE = "phone";
    public static final String COLUMN_EMAIL = "email";

    public static void main(String[] args) {
//        String url = "jdbc:mysql://localhost:3306/testjava";
//        String user = "root";
//        String pass = "test1234TEST!@#$";

        try {
            Connection conn = DriverManager.getConnection(CONNECTION_STRING + DB_NAME, USER, PASS);
            Statement stmt = conn.createStatement();

            stmt.execute("DROP TABLE IF EXISTS " + TABLE_CONTACTS);

            stmt.execute("CREATE TABLE IF NOT EXISTS " + TABLE_CONTACTS +
                    " (" + COLUMN_NAME + " TEXT, " +
                    COLUMN_PHONE + " INT, " +
                    COLUMN_EMAIL + " TEXT" +
                    ")");

//            stmt.execute("INSERT INTO " + TABLE_CONTACTS +
//                    " (" + COLUMN_NAME + ", " +
//                    COLUMN_PHONE + ", " +
//                    COLUMN_EMAIL + ") " +
//                    "VALUES ('Tim', 6545678, 'tim@email.com')");
//
//            stmt.execute("INSERT INTO " + TABLE_CONTACTS +
//                    " (" + COLUMN_NAME + ", " +
//                    COLUMN_PHONE + ", " +
//                    COLUMN_EMAIL + ") " +
//                    "VALUES ('Joe', 45632, 'joe@anywhere.com')");
//
//            stmt.execute("INSERT INTO " + TABLE_CONTACTS +
//                    " (" + COLUMN_NAME + ", " +
//                    COLUMN_PHONE + ", " +
//                    COLUMN_EMAIL + ") " +
//                    "VALUES ('Jane', 4829484, 'jane@somewhere.com')");
//
//            stmt.execute("INSERT INTO " + TABLE_CONTACTS +
//                    " (" + COLUMN_NAME + ", " +
//                    COLUMN_PHONE + ", " +
//                    COLUMN_EMAIL + ") " +
//                    "VALUES ('Fido', 9038, 'dog@email.com')");

            insertContact(stmt, "Tim", "6545678", "tim@email.com");
            insertContact(stmt, "Joe", "45632", "joe@anywhere.com");
            insertContact(stmt, "Jane", "4829484", "jane@somewhere.com");
            insertContact(stmt, "Fido", "9038", "dog@email.com");

            stmt.execute("UPDATE " + TABLE_CONTACTS + " SET " +
                    COLUMN_PHONE + " = 5566789" +
                    " WHERE " + COLUMN_NAME + " = 'Jane'");

            stmt.execute("DELETE FROM " + TABLE_CONTACTS +
                    " WHERE " + COLUMN_NAME + " = 'Joe'");

            ResultSet resultSet = stmt.executeQuery("SELECT * FROM " + TABLE_CONTACTS);
            while (resultSet.next()) {
                System.out.println(resultSet.getString(COLUMN_NAME) + " " +
                                   resultSet.getString(COLUMN_PHONE) + " " +
                                   resultSet.getString(COLUMN_EMAIL));
            }
            resultSet.close();



//            stmt.execute("INSERT INTO contacts (name, phone, email) " +
//                              "VALUES ('Tim', 6545678, 'tim@email.com')");
//
//            stmt.execute("INSERT INTO contacts (name, phone, email) " +
//                    "VALUES ('Joe', 45632, 'joe@anywhere.com')");
//
//            stmt.execute("INSERT INTO contacts (name, phone, email) " +
//                    "VALUES ('Jane', 4829484, 'jane@somewhere.com')");
//
//            stmt.execute("INSERT INTO contacts (name, phone, email) " +
//                    "VALUES ('Fido', 9038, 'dog@email.com')");
//
//            stmt.execute("UPDATE contacts SET phone = 5566789 WHERE name = 'Jane'");
//
//            stmt.execute("DELETE FROM contacts WHERE name = 'Joe'");
//
//            stmt.execute("SELECT * FROM contacts");
//            ResultSet resultSet = stmt.getResultSet();
//            ResultSet resultSet = stmt.executeQuery("SELECT * FROM contacts");
//            while (resultSet.next()) {
//                String name = resultSet.getString("name");
//                String phone = resultSet.getString("phone");
//                String email = resultSet.getString("email");
//                System.out.println(name + " " + phone + " " + email);
//            }
//            resultSet.close();

            stmt.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Something went wrong " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void insertContact(Statement stmt, String name, String phone, String email) throws SQLException{
        stmt.execute("INSERT INTO " + TABLE_CONTACTS +
                " (" + COLUMN_NAME + ", " +
                COLUMN_PHONE + ", " +
                COLUMN_EMAIL + ") " +
                "VALUES ('" + name + "', " + phone + ", '" + email + "')");
    }
}
