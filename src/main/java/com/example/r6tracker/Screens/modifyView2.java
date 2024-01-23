package com.example.r6tracker.Screens;

import com.example.r6tracker.classes.Database;
import com.example.r6tracker.classes.Opperator;
import com.example.r6tracker.classes.Speler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class modifyView2 {
    public modifyView2(Opperator o){
        //opbouw nieuw scherm


        //1 aanmaken stageobject
        Stage deStage = new Stage();
        //aanmaken layout
        GridPane root = new GridPane();

        ComboBox txtType = new ComboBox();
        txtType.setId("box");
        txtType.setPrefSize(175, 35);
        txtType.getItems().add("Attacker");
        txtType.getItems().add("Defender");
        txtType.setPromptText("Opperator Type");



        ComboBox txtNaam = new ComboBox<>();
        txtNaam.setId("box2");
        txtNaam.setPrefSize(175, 35);
        txtNaam.setPromptText(o.getNaam());

        ComboBox txtAbility = new ComboBox<>();
        txtAbility.setId("box3");
        txtAbility.setPrefSize(175, 35);
        txtAbility.setPromptText(o.getAbility());

        ComboBox txtMoveSpeed = new ComboBox<>();
        txtMoveSpeed.setId("box4");
        txtMoveSpeed.setPrefSize(175, 35);
        txtMoveSpeed.setPromptText(String.valueOf(o.getMovespeed()));
        txtMoveSpeed.getItems().addAll("1", "2", "3");


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




        Button btnWijzig = new Button("Wijzig");





        Database db = new Database();

        btnWijzig.setOnAction(e-> {
                    String typeValue = txtType.getValue() != null ? txtType.getValue().toString() : "";
                    String naamValue = txtNaam.getValue() != null ? txtNaam.getValue().toString() : "";
                    String abilityValue = txtAbility.getValue() != null ? txtAbility.getValue().toString() : "";
                    String movespeedValue = txtMoveSpeed.getValue() != null ? txtMoveSpeed.getValue().toString() : "";


                    // Update only if values are not null
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

                    db.updateOpperator(o);
                    deStage.close();
                });

            //controls toevoegen aan layout
            root.add(txtType, 0, 1);
            root.add(txtNaam, 0, 2);
            root.add(txtAbility, 0, 3);
            root.add(txtMoveSpeed, 0, 4);
            root.add(btnWijzig, 0, 5);


            // 4 aanmaken scene
            Scene scene = new Scene(root, 1200, 600);

            deStage.setScene(scene);
            deStage.setTitle("Current");
            deStage.show();


        }
    }