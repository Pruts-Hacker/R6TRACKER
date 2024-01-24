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

    public int geefMaxPlayerID() {
        String SidOpslaan = "SELECT MAX(speler_id) as id FROM speler";
        int id = 0;
        try {
            Statement stm = this.conn.createStatement();
            ResultSet rs = stm.executeQuery(SidOpslaan);

            if (rs.next()) {
                id = rs.getInt("id");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return id;
    }

    public int geefSpelerId() {
        String SidOpslaan = "SELECT speler_id as id FROM speler";
        int id = 0;
        try {
            Statement stm = this.conn.createStatement();
            ResultSet rs = stm.executeQuery(SidOpslaan);

            if (rs.next()) {
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

//    public void updateSpeler(Speler s){
//        String sQuery = "UPDATE speler SET  naam = '" +s.getNaam()+"', gamertag = '"+s.getGamertag()+"', level = '"+ s.getLevel()+"', rank = '"+ s.getRank()+" WHERE ";
//
//        try {
//            Statement stm = this.conn.createStatement();
//            stm.execute(sQuery);
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//
//    }

    public void updateSpeler(Speler s) {
        try {
            String sQuery = "UPDATE speler SET naam = ?, gamertag = ?, level = ?, rank = ? WHERE speler_id = ?";

            try {
                 PreparedStatement preparedStatement = conn.prepareStatement(sQuery) ;

                preparedStatement.setString(1, s.getNaam());
                preparedStatement.setString(2, s.getGamertag());
                preparedStatement.setInt(3, s.getLevel());
                preparedStatement.setString(4, s.getRank());
                preparedStatement.setInt(5, s.getId());

                int rowsAffected = preparedStatement.executeUpdate();
                System.out.println(rowsAffected + " row(s) updated");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void verwijderSpeler() {
        String sQuery = "DELETE FROM speler";
        try {
            Statement stm = this.conn.createStatement();
            stm.execute(sQuery);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    //-------------------------------------------------------------- Alle Opperator database gegevens------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public int geefMaxOpperatorID() {
        String OidOpslaan = "SELECT MAX(opperator_id) as op_id FROM opperator";
        int id = 0;
        try {
            Statement stm = this.conn.createStatement();
            ResultSet rs = stm.executeQuery(OidOpslaan);

            if (rs.next()) {
                id = rs.getInt("op_id");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return id;
    }

    public int geefOpperatorId() {
        String oppid = "SELECT opperator_id as id FROM opperator";
        int id = 0;
        try {
            Statement stm = this.conn.createStatement();
            ResultSet rs = stm.executeQuery(oppid);

            if (rs.next()) {
                id = rs.getInt("id");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return id;
    }

    public int geefOppSpelerId() {
        String oppsid = "SELECT speler_id as id FROM opperator";
        int id = 0;
        try {
            Statement stm = this.conn.createStatement();
            ResultSet rs = stm.executeQuery(oppsid);

            if (rs.next()) {
                id = rs.getInt("id");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return id;
    }


    public void opslaanOpperator(String naam, String type, String ability, int movespeed, int i) {
        try {
            Statement stm = this.conn.createStatement();
            String sql2 = "INSERT INTO opperator VALUES (0,'" + naam + "', '" + type + "','" + ability + "', '" + movespeed + "', '" + i + "')";
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

    public void updateOpperator(Opperator o) {
        try {
            String sQuery = "UPDATE opperator SET naam = ?, type = ?, ability = ?, move_speed = ? WHERE opperator_id = ?";

            try {
                PreparedStatement preparedStatement = conn.prepareStatement(sQuery) ;

                preparedStatement.setString(1, o.getNaam());
                preparedStatement.setString(2, o.getType());
                preparedStatement.setString(3, o.getAbility());
                preparedStatement.setInt(4, o.getMovespeed());
                preparedStatement.setInt(5, o.getId());


                int rowsAffected = preparedStatement.executeUpdate();
                System.out.println(rowsAffected + " row(s) updated");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verwijderOpperator() {
        String sQuery = "DELETE FROM opperator";
        try {
            Statement stm = this.conn.createStatement();
            stm.execute(sQuery);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //-------------------------------------------------------------- Alle MatchResult database gegevens------------------------------------------------------------------------------------------------------------------------------------------------------------------------



    public int geefMatchId() {
        String matchId = "SELECT match_id as id FROM matchresult";
        int id = 0;
        try {
            Statement stm = this.conn.createStatement();
            ResultSet rs = stm.executeQuery(matchId);

            if (rs.next()) {
                id = rs.getInt("id");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return id;
    }

    public int geefMatchSpelerId() {
        String matchsid = "SELECT speler_id as ms_id FROM matchresult";
        int id = 0;
        try {
            Statement stm = this.conn.createStatement();
            ResultSet rs = stm.executeQuery(matchsid);

            if (rs.next()) {
                id = rs.getInt("ms_id");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return id;
    }

    public void opslaanMatchresult(int kills, int deaths, int wins, int losses, int i) {
        try {
            Statement stm = this.conn.createStatement();
            String sql3 = "INSERT INTO matchresult VALUES (0,'" + kills + "', '" + deaths + "','" + wins + "', '" + losses + "', '" + i + "')";
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

    public void updateMatchResult(MatchResult mr) {
        try {
            String sQuery = "UPDATE matchresult SET kills = ?, deaths = ?, wins = ?, losses = ? WHERE match_id = ?";

            try {
                PreparedStatement preparedStatement = conn.prepareStatement(sQuery) ;

                preparedStatement.setInt(1, mr.getKills());
                preparedStatement.setInt(2, mr.getDeaths());
                preparedStatement.setInt(3, mr.getWins());
                preparedStatement.setInt(4, mr.getLosses());
                preparedStatement.setInt(5, mr.getId());


                int rowsAffected = preparedStatement.executeUpdate();
                System.out.println(rowsAffected + " row(s) updated");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verwijderMatchResult() {
        String sQuery = "DELETE FROM matchresult";
        try {
            Statement stm = this.conn.createStatement();
            stm.execute(sQuery);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    //-------------------------------------------------------------- Alle Weapon database gegevens------------------------------------------------------------------------------------------------------------------------------------------------------------------------



    public int geefWeaponId() {
        String weaponid = "SELECT weapon_id as id FROM weapon";
        int id = 0;
        try {
            Statement stm = this.conn.createStatement();
            ResultSet rs = stm.executeQuery(weaponid);

            if (rs.next()) {
                id = rs.getInt("id");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return id;
    }

    public int geefWeaponOpperatorId() {
        String weaponoid = "SELECT opperator_id as wo_id FROM weapon";
        int id = 0;
        try {
            Statement stm = this.conn.createStatement();
            ResultSet rs = stm.executeQuery(weaponoid);

            if (rs.next()) {
                id = rs.getInt("wo_id");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return id;
    }

    public void opslaanWeapon(String naam, int dmg, int cpy, int fr, int mby, int i) {
        try {
            Statement stm = this.conn.createStatement();
            String sql4 = "INSERT INTO weapon VALUES (0,'" + naam + "', '" + dmg + "','" + cpy + "', '" + fr + "', '" + mby + "', '" + i + "')";
            System.out.println("Executing SQL statement: " + sql4);
            stm.execute(sql4);
            System.out.println("Weapon Opgeslagen!!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public ArrayList<WeaponResult> geefWeaponResult() {
        ArrayList<WeaponResult> lijst = new ArrayList<>();
        String sQuery = "SELECT * FROM weapon";
        try {
            Statement stm = this.conn.createStatement();
            stm.execute(sQuery);
            ResultSet rs = stm.getResultSet();

            while (rs.next()) {
                int Iweaponid = rs.getInt("weapon_id");
                String Snaam = rs.getString("naam");
                int Idamage = rs.getInt("damage");
                int Icapacity = rs.getInt("capacity");
                int Ifirerate = rs.getInt("firerate");
                int Imobility = rs.getInt("mobility");
                int Ioppid = rs.getInt("opperator_id");

                WeaponResult wpn = new WeaponResult(Iweaponid, Snaam, Idamage, Icapacity, Ifirerate, Imobility, Ioppid);
                lijst.add(wpn);

                System.out.println(Iweaponid + " " + Snaam + " " + Idamage + " " + Icapacity + " " + Ifirerate + " " + Imobility + " " + Ioppid);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return lijst;
    }

    public void updateWeaponResult(WeaponResult wr) {
        try {
            String sQuery = "UPDATE weapon SET naam = ?, damage = ?, capacity = ?, firerate = ?, mobility = ? WHERE weapon_id = ?";

            try {
                PreparedStatement preparedStatement = conn.prepareStatement(sQuery) ;

                preparedStatement.setString(1, wr.getNaam());
                preparedStatement.setInt(2, wr.getDamage());
                preparedStatement.setInt(3, wr.getCapacity());
                preparedStatement.setInt(4, wr.getFirerate());
                preparedStatement.setInt(5, wr.getMobility());
                preparedStatement.setInt(6, wr.getId());


                int rowsAffected = preparedStatement.executeUpdate();
                System.out.println(rowsAffected + " row(s) updated");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void verwijderWeapon() {
        String sQuery = "DELETE FROM weapon";
        try {
            Statement stm = this.conn.createStatement();
            stm.execute(sQuery);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
