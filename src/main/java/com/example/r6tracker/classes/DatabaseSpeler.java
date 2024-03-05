package com.example.r6tracker.classes;

import java.sql.*;
import java.util.ArrayList;

public class DatabaseSpeler {
    private Connection conn;


    //Database connectie leggen
    public DatabaseSpeler() {
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

}

