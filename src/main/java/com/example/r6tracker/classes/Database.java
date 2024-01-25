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
    //methode om max speler id op te halen uit de speler-tabel
    public int geefMaxPlayerID() {
        // SQL-query om het maximale speler_id op te halen uit de "speler" tabel
        String SidOpslaan = "SELECT MAX(speler_id) as id FROM speler";

        // Initialiseer een variabele om het maximale speler_id op te slaan
        int id = 0;

        try {
            // Creëer een SQL Statement object
            Statement stm = this.conn.createStatement();

            // Voer de SELECT-query uit
            ResultSet rs = stm.executeQuery(SidOpslaan);

            // Controleer of er resultaten zijn en haal het maximale speler_id op
            if (rs.next()) {
                id = rs.getInt("id");
            }
        } catch (SQLException e) {
            // Gooi een runtime-uitzondering als er een SQL-fout optreedt
            throw new RuntimeException(e);
        }

        // Geef het opgehaalde maximale speler_id terug
        return id;
    }
//methode om speler id op te halen uit de speler-tabel
    public int geefSpelerId() {
        // SQL-query om het speler_id op te halen uit de "speler" tabel
        String SidOpslaan = "SELECT speler_id as id FROM speler";

        // Initialiseer een variabele om het speler_id op te slaan
        int id = 0;

        try {
            // Creëer een SQL Statement object
            Statement stm = this.conn.createStatement();

            // Voer de SELECT-query uit
            ResultSet rs = stm.executeQuery(SidOpslaan);

            // Controleer of er resultaten zijn en haal het speler_id op
            if (rs.next()) {
                id = rs.getInt("id");
            }
        } catch (SQLException e) {
            // Gooi een runtime-uitzondering als er een SQL-fout optreedt
            throw new RuntimeException(e);
        }

        // Geef het opgehaalde speler_id terug
        return id;
    }

    //methode om speler op te slaan in speler-tabel
    public void opslaanSpeler(String naam, String gamertag, int level, String rank) {
        try {
            // Creëer een SQL Statement object
            Statement stm = this.conn.createStatement();

            // SQL-query om een nieuwe speler op te slaan in de "speler" tabel
            String sql1 = "INSERT INTO speler VALUES (0,'" + naam + "', '" + gamertag + "','" + level + "', '" + rank + "')";

            // Toon de uit te voeren SQL-query in de console (kan worden verwijderd in productiecode)
            System.out.println("Executing SQL statement: " + sql1);

            // Voer de INSERT-query uit om de speler op te slaan
            stm.execute(sql1);

            // Toon een bevestiging in de console dat de speler is opgeslagen (kan worden verwijderd in productiecode)
            System.out.println("Speler Opgeslagen!!");
        } catch (SQLException e) {
            // Gooi een runtime-uitzondering als er een SQL-fout optreedt
            throw new RuntimeException(e);
        }
    }

    //methode om speler gegevens op te halen uit de database
    public ArrayList<Speler> geefSpeler() {
        // Initialiseer een ArrayList om de spelers op te slaan
        ArrayList<Speler> lijst = new ArrayList<>();

        // SQL-query om alle rijen op te halen uit de "speler" tabel
        String sQuery = "SELECT * FROM speler";

        try {
            // Creëer een SQL Statement object
            Statement stm = this.conn.createStatement();

            // Voer de SELECT-query uit
            stm.execute(sQuery);

            // Haal het resultaat op
            ResultSet rs = stm.getResultSet();

            // Loop door elk resultaat en maak een Speler-object voor elk record
            while (rs.next()) {
                int Ispelerid = rs.getInt("speler_id");
                String Snaam = rs.getString("naam");
                String Sgamertag = rs.getString("gamertag");
                int Ilevel = rs.getInt("level");
                String Srank = rs.getString("rank");

                Speler speler = new Speler(Ispelerid, Srank, Snaam, Sgamertag, Ilevel);
                lijst.add(speler);

                // Toon de gegevens in de console (kan worden verwijderd in productiecode)
                System.out.println(Ispelerid + " " + Snaam + " " + Sgamertag + " " + Ilevel + " " + Srank);
            }
        } catch (SQLException e) {
            // Gooi een runtime-uitzondering als er een SQL-fout optreedt
            throw new RuntimeException(e);
        }

        // Geef de lijst met spelers terug
        return lijst;
    }


    //methode om speler gegevens te updaten in speler-tabel
    public void updateSpeler(Speler s) {
        try {
            // SQL-query om een bestaande speler bij te werken in de "speler" tabel
            String sQuery = "UPDATE speler SET naam = ?, gamertag = ?, level = ?, rank = ? WHERE speler_id = ?";

            try {
                // Creëer een PreparedStatement object om SQL-injecties te voorkomen
                PreparedStatement preparedStatement = conn.prepareStatement(sQuery);

                // Set de parameters voor de UPDATE-query met de gegevens van het Speler-object
                preparedStatement.setString(1, s.getNaam());
                preparedStatement.setString(2, s.getGamertag());
                preparedStatement.setInt(3, s.getLevel());
                preparedStatement.setString(4, s.getRank());
                preparedStatement.setInt(5, s.getId());

                // Voer de UPDATE-query uit
                int rowsAffected = preparedStatement.executeUpdate();

                // Toon het aantal bijgewerkte rijen in de console (kan worden verwijderd in productiecode)
                System.out.println(rowsAffected + " row(s) updated");
            } catch (SQLException e) {
                // Toon de SQL-fout in de console
                e.printStackTrace();
            }
        } catch (Exception e) {
            // Toon de algemene fout in de console
            e.printStackTrace();
        }
    }


    //methode om speler gegevens te verwijderen uit speler-tabel
    public void verwijderSpeler() {
        // SQL-query om alle rijen te verwijderen uit de "speler" tabel
        String sQuery = "DELETE FROM speler";

        try {
            // Creëer een SQL Statement object
            Statement stm = this.conn.createStatement();

            // Voer de DELETE-query uit
            stm.execute(sQuery);
        } catch (SQLException e) {
            // Gooi een runtime-uitzondering als er een SQL-fout optreedt
            throw new RuntimeException(e);
        }
    }


    //-------------------------------------------------------------- Alle Opperator database gegevens------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //methode voor het ophalen van de max opperator id uit de opperator-tabel
    public int geefMaxOpperatorID() {
        // SQL-query om het maximale opperator_id op te halen uit de "opperator" tabel
        String OidOpslaan = "SELECT MAX(opperator_id) as op_id FROM opperator";

        // Initialiseer een variabele om het maximale opperator_id op te slaan
        int id = 0;

        try {
            // Creëer een SQL Statement object
            Statement stm = this.conn.createStatement();

            // Voer de SELECT-query uit
            ResultSet rs = stm.executeQuery(OidOpslaan);

            // Controleer of er resultaten zijn en haal het maximale opperator_id op
            if (rs.next()) {
                id = rs.getInt("op_id");
            }
        } catch (SQLException e) {
            // Gooi een runtime-uitzondering als er een SQL-fout optreedt
            throw new RuntimeException(e);
        }

        // Geef het opgehaalde maximale opperator_id terug
        return id;
    }

    //methode voor het ophalen van de opperator id uit de opperator-tabel
    public int geefOpperatorId() {
        // SQL-query om het opperator_id op te halen uit de "opperator" tabel
        String oppid = "SELECT opperator_id as id FROM opperator";

        // Initialiseer een variabele om het opperator_id op te slaan
        int id = 0;

        try {
            // Creëer een SQL Statement object
            Statement stm = this.conn.createStatement();

            // Voer de SELECT-query uit
            ResultSet rs = stm.executeQuery(oppid);

            // Controleer of er resultaten zijn en haal het opperator_id op
            if (rs.next()) {
                id = rs.getInt("id");
            }
        } catch (SQLException e) {
            // Gooi een runtime-uitzondering als er een SQL-fout optreedt
            throw new RuntimeException(e);
        }

        // Geef het opgehaalde opperator_id terug
        return id;
    }

    //methode voor het ophalen van de speler_id uit de opperator-tabel
    public int geefOppSpelerId() {
        // SQL-query om het speler_id op te halen uit de "opperator" tabel
        String oppsid = "SELECT speler_id as id FROM opperator";

        // Initialiseer een variabele om het speler_id op te slaan
        int id = 0;

        try {
            // Creëer een SQL Statement object
            Statement stm = this.conn.createStatement();

            // Voer de SELECT-query uit
            ResultSet rs = stm.executeQuery(oppsid);

            // Controleer of er resultaten zijn en haal het speler_id op
            if (rs.next()) {
                id = rs.getInt("id");
            }
        } catch (SQLException e) {
            // Gooi een runtime-uitzondering als er een SQL-fout optreedt
            throw new RuntimeException(e);
        }

        // Geef het opgehaalde speler_id terug
        return id;
    }

    //opperator gegevens opslaan in opperator-tabel
    public void opslaanOpperator(String naam, String type, String ability, int movespeed, int i) {
        try {
            // Creëer een SQL Statement object
            Statement stm = this.conn.createStatement();

            // SQL-query om een nieuwe opperator op te slaan in de "opperator" tabel
            String sql2 = "INSERT INTO opperator VALUES (0,'" + naam + "', '" + type + "','" + ability + "', '" + movespeed + "', '" + i + "')";

            // Toon de uit te voeren SQL-query in de console (kan worden verwijderd in productiecode)
            System.out.println("Executing SQL statement: " + sql2);

            // Voer de INSERT-query uit om de opperator op te slaan
            stm.execute(sql2);

            // Toon een bevestiging in de console dat de opperator is opgeslagen (kan worden verwijderd in productiecode)
            System.out.println("Opperator Opgeslagen!!");
        } catch (SQLException e) {
            // Gooi een runtime-uitzondering als er een SQL-fout optreedt
            throw new RuntimeException(e);
        }
    }
    //het ophalen van de opperator gegevens uit de opperator-tabel
    public ArrayList<Opperator> geefOpperator() {
        // Initialiseer een ArrayList om de opperators op te slaan
        ArrayList<Opperator> lijst = new ArrayList<>();

        // SQL-query om alle rijen op te halen uit de "opperator" tabel
        String sQuery = "SELECT * FROM opperator";

        try {
            // Creëer een SQL Statement object
            Statement stm = this.conn.createStatement();

            // Voer de SELECT-query uit
            stm.execute(sQuery);

            // Haal het resultaat op
            ResultSet rs = stm.getResultSet();

            // Loop door elk resultaat en maak een Opperator-object voor elk record
            while (rs.next()) {
                int Iopperatorid = rs.getInt("opperator_id");
                String Snaam = rs.getString("naam");
                String Stype = rs.getString("type");
                String Iability = rs.getString("ability");
                int Imovespeed = rs.getInt("move_speed");
                int Ispelerid = rs.getInt("speler_id");

                Opperator opp = new Opperator(Iopperatorid, Stype, Snaam, Iability, Imovespeed, Ispelerid);
                lijst.add(opp);

                // Toon de opgehaalde gegevens in de console (kan worden verwijderd in productiecode)
                System.out.println(Iopperatorid + " " + Stype + " " + Snaam + " " + Iability + " " + Imovespeed + " " + Ispelerid);
            }
        } catch (SQLException e) {
            // Gooi een runtime-uitzondering als er een SQL-fout optreedt
            throw new RuntimeException(e);
        }

        // Geef de lijst met Opperator-objecten terug
        return lijst;
    }

    //methode om de opperator gegevens te updaten in opperator-tabel
    public void updateOpperator(Opperator o) {
        try {
            // SQL-query om een bestaande opperator bij te werken in de "opperator" tabel
            String sQuery = "UPDATE opperator SET naam = ?, type = ?, ability = ?, move_speed = ? WHERE opperator_id = ?";

            try {
                // Creëer een PreparedStatement object om SQL-injecties te voorkomen
                PreparedStatement preparedStatement = conn.prepareStatement(sQuery);

                // Set de parameters voor de UPDATE-query met de gegevens van het Opperator-object
                preparedStatement.setString(1, o.getNaam());
                preparedStatement.setString(2, o.getType());
                preparedStatement.setString(3, o.getAbility());
                preparedStatement.setInt(4, o.getMovespeed());
                preparedStatement.setInt(5, o.getId());

                // Voer de UPDATE-query uit
                int rowsAffected = preparedStatement.executeUpdate();

                // Toon het aantal bijgewerkte rijen in de console (kan worden verwijderd in productiecode)
                System.out.println(rowsAffected + " row(s) updated");
            } catch (SQLException e) {
                // Toon de SQL-fout in de console
                e.printStackTrace();
            }
        } catch (Exception e) {
            // Toon de algemene fout in de console
            e.printStackTrace();
        }
    }
//methode om de opperator gegevens te verwijderen uit de opperator-tabel
    public void verwijderOpperator() {
        // SQL-query om alle rijen te verwijderen uit de "opperator" tabel
        String sQuery = "DELETE FROM opperator";

        try {
            // Creëer een SQL Statement object
            Statement stm = this.conn.createStatement();

            // Voer de DELETE-query uit
            stm.execute(sQuery);
        } catch (SQLException e) {
            // Gooi een runtime-uitzondering als er een SQL-fout optreedt
            throw new RuntimeException(e);
        }
    }

    //-------------------------------------------------------------- Alle MatchResult database gegevens------------------------------------------------------------------------------------------------------------------------------------------------------------------------


    //methode om match id op te halen uit de matchresult-tabel
    public int geefMatchId() {
        // SQL-query om het match_id op te halen uit de "matchresult" tabel
        String matchId = "SELECT match_id as id FROM matchresult";

        // Initialiseer een variabele om het match_id op te slaan
        int id = 0;

        try {
            // Creëer een SQL Statement object
            Statement stm = this.conn.createStatement();

            // Voer de SELECT-query uit
            ResultSet rs = stm.executeQuery(matchId);

            // Controleer of er resultaten zijn en haal het match_id op
            if (rs.next()) {
                id = rs.getInt("id");
            }
        } catch (SQLException e) {
            // Gooi een runtime-uitzondering als er een SQL-fout optreedt
            throw new RuntimeException(e);
        }

        // Geef het opgehaalde match_id terug
        return id;
    }

    //methode om speler id op te halen uit matchresult-tabel
    public int geefMatchSpelerId() {
        // SQL-query om het speler_id op te halen uit de "matchresult" tabel
        String matchsid = "SELECT speler_id as ms_id FROM matchresult";

        // Initialiseer een variabele om het speler_id op te slaan
        int id = 0;

        try {
            // Creëer een SQL Statement object
            Statement stm = this.conn.createStatement();

            // Voer de SELECT-query uit
            ResultSet rs = stm.executeQuery(matchsid);

            // Controleer of er resultaten zijn en haal het speler_id op
            if (rs.next()) {
                id = rs.getInt("ms_id");
            }
        } catch (SQLException e) {
            // Gooi een runtime-uitzondering als er een SQL-fout optreedt
            throw new RuntimeException(e);
        }

        // Geef het opgehaalde speler_id terug
        return id;
    }
    //methode om matchresultaat op te slaan in de matchresult-tabel
    public void opslaanMatchresult(int kills, int deaths, int wins, int losses, int i) {
        try {
            // Creëer een SQL Statement object
            Statement stm = this.conn.createStatement();

            // SQL-query om een nieuw matchresultaat op te slaan in de "matchresult" tabel
            String sql3 = "INSERT INTO matchresult VALUES (0,'" + kills + "', '" + deaths + "','" + wins + "', '" + losses + "', '" + i + "')";

            // Toon de uit te voeren SQL-query in de console (kan worden verwijderd in productiecode)
            System.out.println("Executing SQL statement: " + sql3);

            // Voer de INSERT-query uit om het matchresultaat op te slaan
            stm.execute(sql3);

            // Toon een bevestiging in de console dat het matchresultaat is opgeslagen (kan worden verwijderd in productiecode)
            System.out.println("MatchResult Opgeslagen!!");
        } catch (SQLException e) {
            // Gooi een runtime-uitzondering als er een SQL-fout optreedt
            throw new RuntimeException(e);
        }
    }

    //methode om gegevensop te halen uit de matchresult-tabel
    public ArrayList<MatchResult> geefMatchResult() {
        // Initialiseer een ArrayList om de matchresultaten op te slaan
        ArrayList<MatchResult> lijst = new ArrayList<>();

        // SQL-query om alle rijen op te halen uit de "matchresult" tabel
        String sQuery = "SELECT * FROM matchresult";

        try {
            // Creëer een SQL Statement object
            Statement stm = this.conn.createStatement();

            // Voer de SELECT-query uit
            stm.execute(sQuery);

            // Haal het resultaat op
            ResultSet rs = stm.getResultSet();

            // Loop door elk resultaat en maak een MatchResult-object voor elk record
            while (rs.next()) {
                int Imatchid = rs.getInt("match_id");
                int Ikills = rs.getInt("kills");
                int Ideaths = rs.getInt("deaths");
                int Iwins = rs.getInt("wins");
                int Ilosses = rs.getInt("losses");
                int Ispelerid = rs.getInt("speler_id");

                MatchResult match = new MatchResult(Imatchid, Ikills, Ideaths, Iwins, Ilosses, Ispelerid);
                lijst.add(match);

                // Toon de opgehaalde gegevens in de console (kan worden verwijderd in productiecode)
                System.out.println(Imatchid + " " + Ikills + " " + Ideaths + " " + Iwins + " " + Ilosses + " " + Ispelerid);
            }
        } catch (SQLException e) {
            // Gooi een runtime-uitzondering als er een SQL-fout optreedt
            throw new RuntimeException(e);
        }

        // Geef de lijst met MatchResult-objecten terug
        return lijst;
    }

    //methode voor het updaten van de gegevens in de matchresult-tabel
    public void updateMatchResult(MatchResult mr) {
        try {
            // SQL-query om een bestaand matchresultaat bij te werken in de "matchresult" tabel
            String sQuery = "UPDATE matchresult SET kills = ?, deaths = ?, wins = ?, losses = ? WHERE match_id = ?";

            try {
                // Creëer een PreparedStatement object om SQL-injecties te voorkomen
                PreparedStatement preparedStatement = conn.prepareStatement(sQuery);

                // Set de parameters voor de UPDATE-query met de gegevens van het MatchResult-object
                preparedStatement.setInt(1, mr.getKills());
                preparedStatement.setInt(2, mr.getDeaths());
                preparedStatement.setInt(3, mr.getWins());
                preparedStatement.setInt(4, mr.getLosses());
                preparedStatement.setInt(5, mr.getId());

                // Voer de UPDATE-query uit
                int rowsAffected = preparedStatement.executeUpdate();

                // Toon het aantal bijgewerkte rijen in de console (kan worden verwijderd in productiecode)
                System.out.println(rowsAffected + " row(s) updated");
            } catch (SQLException e) {
                // Toon de SQL-fout in de console
                e.printStackTrace();
            }
        } catch (Exception e) {
            // Toon de algemene fout in de console
            e.printStackTrace();
        }
    }

    //methode voor het verwijderen van gegevens uit de matchresut-tabel
    public void verwijderMatchResult() {
        // SQL-query om alle rijen te verwijderen uit de "matchresult" tabel
        String sQuery = "DELETE FROM matchresult";

        try {
            // Creëer een SQL Statement object
            Statement stm = this.conn.createStatement();

            // Voer de DELETE-query uit
            stm.execute(sQuery);
        } catch (SQLException e) {
            // Gooi een runtime-uitzondering als er een SQL-fout optreedt
            throw new RuntimeException(e);
        }
    }

    //-------------------------------------------------------------- Alle Weapon database gegevens------------------------------------------------------------------------------------------------------------------------------------------------------------------------


    //methode om weapon id op te halen uit de weapon-tabel
    public int geefWeaponId() {
        // SQL-query om het weapon_id op te halen uit de "weapon" tabel
        String weaponid = "SELECT weapon_id as id FROM weapon";

        // Initialiseer een variabele om het weapon_id op te slaan
        int id = 0;

        try {
            // Creëer een SQL Statement object
            Statement stm = this.conn.createStatement();

            // Voer de SELECT-query uit
            ResultSet rs = stm.executeQuery(weaponid);

            // Controleer of er resultaten zijn en haal het weapon_id op
            if (rs.next()) {
                id = rs.getInt("id");
            }
        } catch (SQLException e) {
            // Gooi een runtime-uitzondering als er een SQL-fout optreedt
            throw new RuntimeException(e);
        }

        // Geef het opgehaalde weapon_id terug
        return id;
    }

    //methode om opperator id op te halen uit de weapon-tabel
    public int geefWeaponOpperatorId() {
        // SQL-query om het opperator_id (wo_id) op te halen uit de "weapon" tabel
        String weaponoid = "SELECT opperator_id as wo_id FROM weapon";

        // Initialiseer een variabele om het opperator_id op te slaan
        int id = 0;

        try {
            // Creëer een SQL Statement object
            Statement stm = this.conn.createStatement();

            // Voer de SELECT-query uit
            ResultSet rs = stm.executeQuery(weaponoid);

            // Controleer of er resultaten zijn en haal het opperator_id op
            if (rs.next()) {
                id = rs.getInt("wo_id");
            }
        } catch (SQLException e) {
            // Gooi een runtime-uitzondering als er een SQL-fout optreedt
            throw new RuntimeException(e);
        }

        // Geef het opgehaalde opperator_id terug
        return id;
    }
//methode om weapon op te slaan in weapon-tabel
    public void opslaanWeapon(String naam, int dmg, int cpy, int fr, int mby, int i) {
        try {
            // Creëer een SQL Statement object
            Statement stm = this.conn.createStatement();

            // SQL-query om een nieuw wapen op te slaan in de "weapon" tabel
            String sql4 = "INSERT INTO weapon VALUES (0,'" + naam + "', '" + dmg + "','" + cpy + "', '" + fr + "', '" + mby + "', '" + i + "')";

            // Toon de uit te voeren SQL-query in de console (kan worden verwijderd in productiecode)
            System.out.println("Executing SQL statement: " + sql4);

            // Voer de INSERT-query uit om het wapen op te slaan
            stm.execute(sql4);

            // Toon een bevestiging in de console dat het wapen is opgeslagen (kan worden verwijderd in productiecode)
            System.out.println("Weapon Opgeslagen!!");
        } catch (SQLException e) {
            // Gooi een runtime-uitzondering als er een SQL-fout optreedt
            throw new RuntimeException(e);
        }
    }

//methode om weaponresult-objecten op te halen
    public ArrayList<WeaponResult> geefWeaponResult() {
        // Maak een ArrayList aan om WeaponResult-objecten op te slaan
        ArrayList<WeaponResult> lijst = new ArrayList<>();

        // SQL-query om alle records uit de "weapon" tabel op te halen
        String sQuery = "SELECT * FROM weapon";

        try {
            // Creëer een SQL Statement object
            Statement stm = this.conn.createStatement();

            // Voer de SELECT-query uit
            stm.execute(sQuery);

            // Haal het resultaat van de query op
            ResultSet rs = stm.getResultSet();

            // Verwerk elke rij in het resultaat
            while (rs.next()) {
                // Haal de velden uit de huidige rij
                int Iweaponid = rs.getInt("weapon_id");
                String Snaam = rs.getString("naam");
                int Idamage = rs.getInt("damage");
                int Icapacity = rs.getInt("capacity");
                int Ifirerate = rs.getInt("firerate");
                int Imobility = rs.getInt("mobility");
                int Ioppid = rs.getInt("opperator_id");

                // Maak een nieuw WeaponResult-object aan met de opgehaalde gegevens
                WeaponResult wpn = new WeaponResult(Iweaponid, Snaam, Idamage, Icapacity, Ifirerate, Imobility, Ioppid);

                // Voeg het WeaponResult-object toe aan de ArrayList
                lijst.add(wpn);

                // Toon de opgehaalde gegevens in de console (kan worden verwijderd in productiecode)
                System.out.println(Iweaponid + " " + Snaam + " " + Idamage + " " + Icapacity + " " + Ifirerate + " " + Imobility + " " + Ioppid);
            }
        } catch (SQLException e) {
            // Gooi een runtime-uitzondering als er een SQL-fout optreedt
            throw new RuntimeException(e);
        }

        // Geef de lijst met WeaponResult-objecten terug
        return lijst;
    }

    //methode om alle rcords in de weaoon-tabel te updaten
    public void updateWeaponResult(WeaponResult wr) {
        try {
            // SQL-query om een rij in de "weapon" tabel bij te werken op basis van weapon_id
            String sQuery = "UPDATE weapon SET naam = ?, damage = ?, capacity = ?, firerate = ?, mobility = ? WHERE weapon_id = ?";

            try {
                // Maak een PreparedStatement-object aan voor het uitvoeren van de update-query
                PreparedStatement preparedStatement = conn.prepareStatement(sQuery);

                // Wijs de waarden toe aan de placeholders in de query
                preparedStatement.setString(1, wr.getNaam());
                preparedStatement.setInt(2, wr.getDamage());
                preparedStatement.setInt(3, wr.getCapacity());
                preparedStatement.setInt(4, wr.getFirerate());
                preparedStatement.setInt(5, wr.getMobility());
                preparedStatement.setInt(6, wr.getId());

                // Voer de update-query uit en verkrijg het aantal bijgewerkte rijen
                int rowsAffected = preparedStatement.executeUpdate();

                // Toon het aantal bijgewerkte rijen in de console
                System.out.println(rowsAffected + " rij(en) bijgewerkt");
            } catch (SQLException e) {
                // Toon eventuele SQL-fouten in de console
                e.printStackTrace();
            }
        } catch (Exception e) {
            // Toon andere mogelijke fouten in de console
            e.printStackTrace();
        }
    }
    //methode om alle records uit de weapon-tabel te verwijderen
    public void verwijderWeapon() {
        // SQL-query om alle records uit de "weapon"-tabel te verwijderen
        String sQuery = "DELETE FROM weapon";

        try {
            // Creëer een SQL Statement object
            Statement stm = this.conn.createStatement();

            // Voer de DELETE-query uit om alle records te verwijderen
            stm.execute(sQuery);
        } catch (SQLException e) {
            // Gooi een runtime-uitzondering als er een SQL-fout optreedt
            throw new RuntimeException(e);
        }
    }}
