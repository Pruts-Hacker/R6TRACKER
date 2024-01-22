package com.example.r6tracker.classes;

import javafx.css.Match;

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


        //-------------------------------------------------------------- Alle Speler database gegevens------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        }

        public int geefMaxPlayerID(){
        String SidOpslaan = "SELECT MAX(speler_id) as id FROM speler";
        int id = 0;
            try {
                Statement stm = this.conn.createStatement();
                ResultSet rs = stm.executeQuery(SidOpslaan);

                if(rs.next()){
                    id = rs.getInt("id");
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        return id;
        }

        public int geefSpelerId(){
            String SidOpslaan = "SELECT speler_id as id FROM speler";
            int id = 0;
            try {
                Statement stm = this.conn.createStatement();
                ResultSet rs = stm.executeQuery(SidOpslaan);

                if(rs.next()){
                    id = rs.getInt("id");
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            return id;
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

    public ArrayList<Speler> geefSpeler() {
        ArrayList<Speler> lijst = new ArrayList<>();
        String sQuery = "SELECT * FROM speler";
        try {
            Statement stm = this.conn.createStatement();
            stm.execute(sQuery);
            ResultSet rs = stm.getResultSet();

            while (rs.next()) {
                int Ispelerid = rs.getInt("speler_id");
                String Snaam = rs.getString("naam");
                String Sgamertag = rs.getString("gamertag");
                int Ilevel = rs.getInt("level");
                String Srank = rs.getString("rank");

                Speler speler = new Speler(Ispelerid, Srank, Snaam, Sgamertag, Ilevel);
                lijst.add(speler);

                System.out.println(Ispelerid + " " + Snaam + " " + Sgamertag + " " + Ilevel + " " + Srank);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return lijst;
    }


    //-------------------------------------------------------------- Alle Opperator database gegevens------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public int geefMaxOpperatorID(){
        String OidOpslaan = "SELECT MAX(opperator_id) as op_id FROM opperator";
        int id = 0;
        try {
            Statement stm = this.conn.createStatement();
            ResultSet rs = stm.executeQuery(OidOpslaan);

            if(rs.next()){
                id = rs.getInt("op_id");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return id;
    }

    public int geefOpperatorId(){
        String oppid = "SELECT opperator_id as id FROM opperator";
        int id = 0;
        try {
            Statement stm = this.conn.createStatement();
            ResultSet rs = stm.executeQuery(oppid);

            if(rs.next()){
                id = rs.getInt("id");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return id;
    }

    public int geefOppSpelerId(){
        String oppsid = "SELECT speler_id as id FROM opperator";
        int id = 0;
        try {
            Statement stm = this.conn.createStatement();
            ResultSet rs = stm.executeQuery(oppsid);

            if(rs.next()){
                id = rs.getInt("id");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return id;
    }


    public void opslaanOpperator(String naam, String type, String ability, int movespeed, int i){
        try {
            Statement stm = this.conn.createStatement();
            String sql2 = "INSERT INTO opperator VALUES (0,'" + naam + "', '" + type + "','" + ability + "', '" + movespeed + "', '"+i+"')";
            System.out.println("Executing SQL statement: " + sql2);
            stm.execute(sql2);
            System.out.println("Opperator Opgeslagen!!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Opperator> geefOpperator() {
        ArrayList<Opperator> lijst = new ArrayList<>();
        String sQuery = "SELECT * FROM opperator";
        try {
            Statement stm = this.conn.createStatement();
            stm.execute(sQuery);
            ResultSet rs = stm.getResultSet();

            while (rs.next()) {
                int Iopperatorid = rs.getInt("opperator_id");
                String Snaam = rs.getString("naam");
                String Stype = rs.getString("type");
                String Iability = rs.getString("ability");
                int Imovespeed = rs.getInt("move_speed");
                int Ispelerid = rs.getInt("speler_id");

                Opperator opp = new Opperator(Iopperatorid, Stype, Snaam, Iability, Imovespeed, Ispelerid);
                lijst.add(opp);

                System.out.println(Iopperatorid + " " + Stype + " " + Snaam + " " + Iability + " " + Imovespeed + " " + Ispelerid);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return lijst;
    }

    //-------------------------------------------------------------- Alle MatchResult database gegevens------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    public int geefMaxMatchID(){
        String MidOpslaan = "SELECT MAX(match_id) as m_id FROM matchresult";
        int id = 0;
        try {
            Statement stm = this.conn.createStatement();
            ResultSet rs = stm.executeQuery(MidOpslaan);

            if(rs.next()){
                id = rs.getInt("m_id");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return id;
    }

    public int geefMatchId(){
        String matchId = "SELECT match_id as id FROM matchresult";
        int id = 0;
        try {
            Statement stm = this.conn.createStatement();
            ResultSet rs = stm.executeQuery(matchId);

            if(rs.next()){
                id = rs.getInt("id");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return id;
    }

    public int geefMatchSpelerId(){
        String matchsid = "SELECT speler_id as ms_id FROM matchresult";
        int id = 0;
        try {
            Statement stm = this.conn.createStatement();
            ResultSet rs = stm.executeQuery(matchsid);

            if(rs.next()){
                id = rs.getInt("ms_id");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return id;
    }

    public void opslaanMatchresult(int kills, int deaths, int wins, int losses, int i){
        try {
            Statement stm = this.conn.createStatement();
            String sql3 = "INSERT INTO matchresult VALUES (0,'" + kills + "', '" + deaths + "','" + wins + "', '" + losses + "', '"+i+"')";
            System.out.println("Executing SQL statement: " + sql3);
            stm.execute(sql3);
            System.out.println("MatchResult Opgeslagen!!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<MatchResult> geefMatchResult() {
        ArrayList<MatchResult> lijst = new ArrayList<>();
        String sQuery = "SELECT * FROM matchresult";
        try {
            Statement stm = this.conn.createStatement();
            stm.execute(sQuery);
            ResultSet rs = stm.getResultSet();

            while (rs.next()) {
                int Imatchid = rs.getInt("match_id");
                int Ikills = rs.getInt("kills");
                int Ideaths = rs.getInt("deaths");
                int Iwins = rs.getInt("wins");
                int Ilosses = rs.getInt("losses");
                int Ispelerid = rs.getInt("speler_id");

                MatchResult match = new MatchResult(Imatchid, Ikills, Ideaths, Iwins, Ilosses, Ispelerid);
                lijst.add(match);

                System.out.println(Imatchid + " " + Ikills + " " + Ideaths + " " + Iwins + " " + Ilosses + " " + Ispelerid);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return lijst;
    }

    //-------------------------------------------------------------- Alle Weapon database gegevens------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    public int geefMaxWeaponID(){
        String MidOpslaan = "SELECT MAX(match_id) as m_id FROM matchresult";
        int id = 0;
        try {
            Statement stm = this.conn.createStatement();
            ResultSet rs = stm.executeQuery(MidOpslaan);

            if(rs.next()){
                id = rs.getInt("m_id");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return id;
    }

    public int geefWeaponId(){
        String weaponid = "SELECT weapon_id as id FROM weapon";
        int id = 0;
        try {
            Statement stm = this.conn.createStatement();
            ResultSet rs = stm.executeQuery(weaponid);

            if(rs.next()){
                id = rs.getInt("id");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return id;
    }

    public int geefWeaponOpperatorId(){
        String matchsid = "SELECT opperator_id as wo_id FROM weapon";
        int id = 0;
        try {
            Statement stm = this.conn.createStatement();
            ResultSet rs = stm.executeQuery(matchsid);

            if(rs.next()){
                id = rs.getInt("ms_id");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return id;
    }

    public void opslaanWeapon(String naam, int dmg, int cpy, int fr, int mby, int i){
        try {
            Statement stm = this.conn.createStatement();
            String sql4 = "INSERT INTO weapon VALUES (0,'" + naam + "', '" + dmg + "','" + cpy + "', '" + fr + "', '" + mby + "', '"+i+"')";
            System.out.println("Executing SQL statement: " + sql4);
            stm.execute(sql4);
            System.out.println("Weapon Opgeslagen!!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public ArrayList<WeaponResult> geefWeaponResult() {
        ArrayList<WeaponResult> lijst = new ArrayList<>();
        String sQuery = "SELECT * FROM matchresult";
        try {
            Statement stm = this.conn.createStatement();
            stm.execute(sQuery);
            ResultSet rs = stm.getResultSet();

            while (rs.next()) {
                int Imatchid = rs.getInt("match_id");
                int Ikills = rs.getInt("kills");
                int Ideaths = rs.getInt("deaths");
                int Iwins = rs.getInt("wins");
                int Ilosses = rs.getInt("losses");
                int Ispelerid = rs.getInt("speler_id");

                MatchResult match = new MatchResult(Imatchid, Ikills, Ideaths, Iwins, Ilosses, Ispelerid);
                lijst.add(match);

                System.out.println(Imatchid + " " + Ikills + " " + Ideaths + " " + Iwins + " " + Ilosses + " " + Ispelerid);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return lijst;
    }
