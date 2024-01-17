package com.example.r6tracker.classes;

import java.sql.*;
import java.util.ArrayList;

public class Database {

    private Connection conn;
//Database connectie leggen
    public Database() {
        try {
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost/r6tracker", "root", "");
            System.out.println("Database connection established successfully!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



        }

    public void opslaanSpeler(String naam, String gamertag, int level, String rank) {
        try {
            Statement stm = this.conn.createStatement();
            String sql1 = "INSERT INTO speler VALUES (0,'" + naam + "', '" + gamertag + "','" + level + "', '" + rank + "')";
            System.out.println("Executing SQL statement: " + sql1);
            stm.execute(sql1);
            System.out.println("Speler Opgeslagen!!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public void opslaanOpperator(String naam, String type, String ability, int movespeed){
        try {
            Statement stm = this.conn.createStatement();
            String sql2 = "INSERT INTO opperator VALUES (0,'" + naam + "', '" + type + "','" + ability + "', '" + movespeed + "')";
            System.out.println("Executing SQL statement: " + sql2);
            stm.execute(sql2);
            System.out.println("Opperator Opgeslagen!!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void opslaanMatchresult(int kills, int deaths, int wins, int losses){
        try {
            Statement stm = this.conn.createStatement();
            String sql3 = "INSERT INTO matchresult VALUES (0,'" + kills + "', '" + deaths + "','" + wins + "', '" + losses + "')";
            System.out.println("Executing SQL statement: " + sql3);
            stm.execute(sql3);
            System.out.println("MatchResult Opgeslagen!!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void opslaanWeapon(String naam, int dmg, int cpy, int fr, int mby){
        try {
            Statement stm = this.conn.createStatement();
            String sql4 = "INSERT INTO weapon VALUES (0,'" + naam + "', '" + dmg + "','" + cpy + "', '" + fr + "', '" + mby + "', '"+1+"')";
            System.out.println("Executing SQL statement: " + sql4);
            stm.execute(sql4);
            System.out.println("Weapon Opgeslagen!!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
