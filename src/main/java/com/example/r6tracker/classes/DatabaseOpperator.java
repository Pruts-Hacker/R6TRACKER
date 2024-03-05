package com.example.r6tracker.classes;

import java.sql.*;
import java.util.ArrayList;

public class DatabaseOpperator {

    private Connection conn;

    public DatabaseOpperator(){
        try {
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost/r6tracker", "root", "");
            System.out.println("Database connection established successfully!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
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
}
