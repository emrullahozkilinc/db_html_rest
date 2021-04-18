package com.example.db_html_rest;

import java.sql.*;

public class DatabaseTest {
    public static void main(String[] args) {

        String databaseURL = "jdbc:ucanaccess://Customer_Db_Ex1.accdb";

        try (Connection connection = DriverManager.getConnection(databaseURL)) {


            String sql = "INSERT INTO Contacts (Name, Age) VALUES (?, ?)";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "Jim Rohn");
            preparedStatement.setString(2, "45");

            int row = preparedStatement.executeUpdate();

            if (row > 1) {
                System.out.println("A row has been inserted successfully.");
            }



        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
