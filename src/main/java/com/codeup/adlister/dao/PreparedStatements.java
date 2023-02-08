package com.codeup.adlister.dao;

import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class PreparedStatements {
    public static void main(String[] args) {
        // create config object to build credential object
        Config config = new Config();
        try{
            //create driver and connection objects to access MYSQL database
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );

//            //create SQL query
//            String sql = "INSERT INTO student(name, category, price) VALUES (?, ?, ?)";
//            //create statement object
//            PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//
//            // For the sake of easier demonstration we are using literals here
//            stmt.setString(1, "bbb");
//            stmt.setString(2, "333");
//            stmt.setFloat(3, 11);
//
//            // run statement
//            stmt.executeUpdate();
//
//            ResultSet generatedIdResultSet = stmt.getGeneratedKeys();
//            if (generatedIdResultSet.next()) {
//                System.out.println("Inserted a new record! New id: " + generatedIdResultSet.getLong(1));
//            }
            // Create SQL string to make query
            String insertSql = "INSERT INTO albums (artist_name, album_name, release_date, sales, genre) VALUES (?, ?, ?, ?, ?)";
            // Instantiate PreparedStatement and pass the SQL string to be used
            PreparedStatement statement = connection.prepareStatement(insertSql, Statement.RETURN_GENERATED_KEYS);
            // Set the value of the question marks.
            statement.setString(1, "Lil' Wayne");
            statement.setString(2, "The Carter III");
            statement.setInt(3, 2008);
            statement.setDouble(4, 3.97);
            statement.setString(5, "rap");
            // Execute the prepared statement.
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            // Move to the first result
            rs.next();
            // Print new ID
            System.out.println(rs.getLong(1));
        }
        catch(SQLException e){
            throw new RuntimeException("Could not update products table");
        }
    }
}