package com.example.r6tracker.classes;

import java.sql.*;
import java.util.ArrayList;

public class DatabaseWeapon {
    private Connection conn;
    //Database connectie leggen
    public DatabaseWeapon() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/r6tracker", "root", "");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
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
    }
}
