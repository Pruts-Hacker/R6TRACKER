package com.example.r6tracker.classes;

import java.sql.*;
import java.util.ArrayList;

public class DatabaseMatchResult {

    private Connection conn;

    //Database connectie leggen
    public DatabaseMatchResult(){
        try {
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost/r6tracker", "root", "");
            System.out.println("Database connection established successfully!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
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
}
