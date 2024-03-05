package com.example.r6tracker.Screens;

import com.example.r6tracker.classes.DatabaseOpperator;
import com.example.r6tracker.classes.Opperator;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class modifyView2 {
    public modifyView2(Opperator o) {
        // Aanmaken stageobject
        Stage deStage = new Stage();
        //de applicatie mag niet groter worden dan de aangegeven width en height
        deStage.setResizable(false);
        // Aanmaken layout
        GridPane root = new GridPane();

        // ComboBox voor Opperator Type
        ComboBox txtType = new ComboBox();
        txtType.setId("box");
        txtType.setPrefSize(175, 35);
        txtType.getItems().add("Attacker");
        txtType.getItems().add("Defender");
        txtType.setPromptText("Opperator Type");

        // ComboBox voor Opperator Naam
        ComboBox txtNaam = new ComboBox<>();
        txtNaam.setId("box2");
        txtNaam.setPrefSize(175, 35);
        txtNaam.setPromptText(o.getNaam());

        // ComboBox voor Opperator Ability
        ComboBox txtAbility = new ComboBox<>();
        txtAbility.setId("box3");
        txtAbility.setPrefSize(175, 35);
        txtAbility.setPromptText(o.getAbility());

        // ComboBox voor Opperator Move Speed
        ComboBox txtMoveSpeed = new ComboBox<>();
        txtMoveSpeed.setId("box4");
        txtMoveSpeed.setPrefSize(175, 35);
        txtMoveSpeed.setPromptText(String.valueOf(o.getMovespeed()));
        txtMoveSpeed.getItems().addAll("1", "2", "3");

        // Event handler voor het wijzigen van Opperator Type
        txtType.setOnAction(e -> {
            if ("Attacker".equals(txtType.getValue())) {
                txtNaam.getItems().clear();
                txtNaam.getItems().addAll("Ace", "Amaru", "Ash", "Blackbeard","Blitz", "Brava", "Buck", "Capitão", "Dokkaebi", "Finka", "Flores", "Fuze", "Glaz",
                        "Gridlock", "Grim", "Hibana", "Iana", "IQ", "Jackal", "Kali", "Lion", "Maverick", "Montagne", "Nomad", "Nøkk", "Osa", "Ram", "Recruit", "Sens",
                        "Sledge", "Thatcher", "Thermite", "Twitch", "Ying", "Zero", "Zofia");

                txtAbility.getItems().clear();
                txtAbility.getItems().addAll("Sniper Eye", "Cluster Charge", "Electronics Scan", "Flash Shield","Shock Drone", "Extendable Shield", "Hardbreach Charge", "M120 Crem", "Emp Grenades", "Hammer", "Side Shotgun", "Gun Shield", "Crossbow",
                        "Hardbreach Charges", "Footprint Scanner", "Cluster Flashbangs", "  Side Grenadelauncher", "Logic Bomb", "Healing Charge", "Orbital Scan", "Breaching Tool", "Repulsion Grenades", "Spike Mats", "Camera Invisibility", "Instant Rappel", "Demolition shots", "Clone Drone", "Spy Camera", "Bomb Drones",
                        "Thorn", "Thunderbird", "Tubarão", "Valkyrie", "Vigil", "Wamai", "Warden");

            } else if ("Defender".equals(txtType.getValue())) {
                txtNaam.getItems().clear();
                txtNaam.getItems().addAll("Alibi", "Aruni", "Azami", "Bandit","Castle", "Caviera", "Clash", "Doc", "Echo", "Ela", "Fenrir", "Frost", "Goyo",
                        "Jäger", "Kaid", "Kapkan", "Lesion", "Maestro", "Melusi", "Mira", "Mozzie", "Mute", "Oryx", "Pulse", "Recruit", "Rook", "Smoke", "Solis", "Tachanka",
                        "Clear Shield", "Smoke Wall", "Scan Pest", "Hacking Drone", "Demolition Drone");

                txtAbility.getItems().clear();
                txtAbility.getItems().addAll("Signal Jammers", "Toxic Gas", "Cardiac Sensor", "Bulletproof Barricades","Stim pistol", "Ceramic Plates", "Shockwire Batteries", "ADS Devices", "Explosive Traps", "Fire Grenades", "Welcome Mat", "Sticky Cameras", "Special Pistol",
                        "Yokai Drones", "Bulletproof Windows", "Poison Mines", "Concussion Mines", "Cloaking Device", "Evil Eye", "Holograms", "Shock Shield", "Electroclaw", "Pest Robots", "Smart Glasses", "Fire Cannisters", "Wall Dash", "Laser Barrier", "Healing Station", "Spike Trap",
                        "Kabi Barrier", "Smoke Screen", "Mag-Net", "Banshee", "Spec-IO", "Zoto Cannister");
            }
        });

        // Button voor wijzigen
        Button btnWijzig = new Button("Wijzig");

        // Database object
        DatabaseOpperator dbo = new DatabaseOpperator();

        // Event handler voor het wijzigen van Opperator
        btnWijzig.setOnAction(e -> {
            String typeValue = txtType.getValue() != null ? txtType.getValue().toString() : "";
            String naamValue = txtNaam.getValue() != null ? txtNaam.getValue().toString() : "";
            String abilityValue = txtAbility.getValue() != null ? txtAbility.getValue().toString() : "";
            String movespeedValue = txtMoveSpeed.getValue() != null ? txtMoveSpeed.getValue().toString() : "";

            // Update alleen als waarden niet leeg zijn
            if (!typeValue.isEmpty()) {
                o.setType(typeValue);
            }

            if (!naamValue.isEmpty()) {
                o.setNaam(naamValue);
            }

            if (!abilityValue.isEmpty()) {
                o.setAbility(abilityValue);
            }

            if (!movespeedValue.isEmpty()) {
                o.setMovespeed(Integer.parseInt(movespeedValue));
            }



            dbo.updateOpperator(o);
            try{
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Succes");
                alert.setHeaderText(null);
                alert.setContentText("De gegevens zijn succesvol opgeslagen.");
                alert.showAndWait();

                // Stage sluiten na het updaten
                deStage.close();
            } catch (NumberFormatException ex) {
                // Foutmelding weergeven als het level geen geldig getal is
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Fout");
                alert.setHeaderText(null);
                alert.setContentText("Voer een geldig getal in voor het level.");
                alert.showAndWait();
            } catch (Exception ex){
                // Algemene foutmelding weergeven als er een andere fout optreedt
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Fout");
                alert.setHeaderText(null);
                alert.setContentText("Er is een fout opgetreden bij het opslaan van de gegevens.");
                alert.showAndWait();

            }});


        // Controls toevoegen aan layout
        root.add(txtType, 0, 1);
        root.add(txtNaam, 0, 2);
        root.add(txtAbility, 0, 3);
        root.add(txtMoveSpeed, 0, 4);
        root.add(btnWijzig, 0, 5);

        // Scene aanmaken
        Scene scene = new Scene(root, 1200, 600);

        deStage.setScene(scene);
        deStage.setTitle("Current");
        deStage.show();
    }
}