package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnection {

    private static final Logger logger = Logger.getLogger(DBConnection.class.getName());

    public static Connection getConnectionToDatabase(){
        Connection connection = null;

        try {
            // load the driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
            logger.info("MySQL JDBC Driver Registered");

            //get hold of the DriverManager
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hplus", Package.USER.val, Package.PASSWORD.val);
        } catch (ClassNotFoundException e) {
            logger.log(Level.SEVERE,"Where is your MySQL JDBC Driver?");
            e.printStackTrace();
        } catch (SQLException e){
            logger.log(Level.SEVERE,"Connection Failed! Check output console");
            e.printStackTrace();
        }

        if (connection != null){
            logger.log(Level.INFO,"Connection made to DB!");
        }
        return connection;
    }
}
