package com.example.r6tracker.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class Database {

    private Connection conn;
    //Aanmaken lege arraylist van het type R6TRACKER

    public Database() {
        try {
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost/r6tracker", "root", "");
            System.out.println("Database connection established successfully!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
