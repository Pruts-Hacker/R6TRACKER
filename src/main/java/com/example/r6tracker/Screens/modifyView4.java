package com.example.r6tracker.Screens;

import com.example.r6tracker.classes.DatabaseWeapon;
import com.example.r6tracker.classes.WeaponResult;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class modifyView4 {

    public modifyView4(WeaponResult wr){

        //aanmaken stageobject
        Stage deStage = new Stage();
        //de applicatie mag niet groter worden dan de aangegeven width en height
        deStage.setResizable(false);
        //aanmaken hoofd layout
        GridPane root = new GridPane();
        //combobox aanmaken voor weapon type
        ComboBox txtWeapon = new ComboBox();
        //id geven aan de combobox
        txtWeapon.setId("box1");
        //de combobox een width en height geven
        txtWeapon.setPrefSize(175, 35);
        //de opgehaalde text uit de database instellen als prompttext
        txtWeapon.setPromptText(wr.getNaam());
        //items toevoegen aan de combobox
        txtWeapon.getItems().add(".44 Mag Semi-Auto");
        txtWeapon.getItems().add("1911 TACOPS");
        txtWeapon.getItems().add("416-C Carbine");
        txtWeapon.getItems().add("417");
        txtWeapon.getItems().add("552 Commando");
        txtWeapon.getItems().add("556xi");
        txtWeapon.getItems().add("6P41");
        txtWeapon.getItems().add("9mm C1");
        txtWeapon.getItems().add("9x19VSN");
        txtWeapon.getItems().add("ACS12");
        txtWeapon.getItems().add("AK-12");
        txtWeapon.getItems().add("AK-47");
        txtWeapon.getItems().add("AK-74");
        txtWeapon.getItems().add("ALDA 5.56");
        txtWeapon.getItems().add("AR-15.50");
        txtWeapon.getItems().add("AR33");
        txtWeapon.getItems().add("ARX200");
        txtWeapon.getItems().add("AUG");
        txtWeapon.getItems().add("AUG Para");
        txtWeapon.getItems().add("Bailiff 410");
        txtWeapon.getItems().add("Ballistic Shield");
        txtWeapon.getItems().add("Bearing 9");
        txtWeapon.getItems().add("Benelli M3");
        txtWeapon.getItems().add("BOSG.12.2");
        txtWeapon.getItems().add("C75 Auto");
        txtWeapon.getItems().add("C7E");
        txtWeapon.getItems().add("C8-SFW");
        txtWeapon.getItems().add("Commando 9");
        txtWeapon.getItems().add("CSRX 300");
        txtWeapon.getItems().add("Desert Eagle");
        txtWeapon.getItems().add("DP27");
        txtWeapon.getItems().add("F90");
        txtWeapon.getItems().add("FAMAS");
        txtWeapon.getItems().add("Five-seven");
        txtWeapon.getItems().add("FMG-9");
        txtWeapon.getItems().add("FO-12");
        txtWeapon.getItems().add("G36C");
        txtWeapon.getItems().add("GSh-18");
        txtWeapon.getItems().add("HK21");
        txtWeapon.getItems().add("ITA12L");
        txtWeapon.getItems().add("ITA12S");
        txtWeapon.getItems().add("K1A");
        txtWeapon.getItems().add("Keratos");
        txtWeapon.getItems().add("L1A1");
        txtWeapon.getItems().add("L85");
        txtWeapon.getItems().add("LFP586");
        txtWeapon.getItems().add("LMG-E");
        txtWeapon.getItems().add("M1014");
        txtWeapon.getItems().add("M12");
        txtWeapon.getItems().add("M249");
        txtWeapon.getItems().add("M4");
        txtWeapon.getItems().add("M45 MEUSOC");
        txtWeapon.getItems().add("M500");
        txtWeapon.getItems().add("M60");
        txtWeapon.getItems().add("M762");
        txtWeapon.getItems().add("M870");
        txtWeapon.getItems().add("MAC-11");
        txtWeapon.getItems().add("Mk 14 EBR");
        txtWeapon.getItems().add("Mk1 9mm");
        txtWeapon.getItems().add("MP5");
        txtWeapon.getItems().add("MP5K");
        txtWeapon.getItems().add("MP5SD");
        txtWeapon.getItems().add("MP7");
        txtWeapon.getItems().add("MP9");
        txtWeapon.getItems().add("MPX");
        txtWeapon.getItems().add("Mx4 Storm");
        txtWeapon.getItems().add("OTs-03");
        txtWeapon.getItems().add("P-10C");
        txtWeapon.getItems().add("P10 RONI");
        txtWeapon.getItems().add("P12");
        txtWeapon.getItems().add("P226");
        txtWeapon.getItems().add("P229");
        txtWeapon.getItems().add("P9");
        txtWeapon.getItems().add("P90");
        txtWeapon.getItems().add("PARA-308");
        txtWeapon.getItems().add("PDW9");
        txtWeapon.getItems().add("PMM");
        txtWeapon.getItems().add("POF-9");
        txtWeapon.getItems().add("PP-19 Bizon");
        txtWeapon.getItems().add("PRB92");
        txtWeapon.getItems().add("Q-929");
        txtWeapon.getItems().add("R4-C");
        txtWeapon.getItems().add("RG15");
        txtWeapon.getItems().add("RPG-7");
        txtWeapon.getItems().add("SASG-12");
        txtWeapon.getItems().add("SC3000K");
        txtWeapon.getItems().add("SCAR-H CQC");
        txtWeapon.getItems().add("Scorpion EVO 3 A1");
        txtWeapon.getItems().add("SDP 9mm");
        txtWeapon.getItems().add("SG-CQB");
        txtWeapon.getItems().add("SIX12");
        txtWeapon.getItems().add("SMG-12");
        txtWeapon.getItems().add("SPAS-12");
        txtWeapon.getItems().add("SPAS-15");
        txtWeapon.getItems().add("Spear .308");
        txtWeapon.getItems().add("SR-25");
        txtWeapon.getItems().add("Super Shorty");
        txtWeapon.getItems().add("SuperNova");
        txtWeapon.getItems().add("T-5 SMG");
        txtWeapon.getItems().add("T-95 LSW");
        txtWeapon.getItems().add("TCSG12");
        txtWeapon.getItems().add("Type 89-F");
        txtWeapon.getItems().add("UMP");
        txtWeapon.getItems().add("USP");
        txtWeapon.getItems().add("Uzi");
        txtWeapon.getItems().add("V308");
        txtWeapon.getItems().add("Vector .45 ACP");

        //Comcobox aanmaken voor Damage type
        ComboBox txtDamage = new ComboBox();
        // id geven aan combobox
        txtDamage.setId("box2");
        //een width en een height geven aan de combobox
        txtDamage.setPrefSize(175, 35);
        //de opgehaalde text uit de database instellen als prompttext
        txtDamage.setPromptText(String.valueOf(wr.getDamage()));
        //items toevoegen aan de combobox
        txtDamage.getItems().add("71");
        txtDamage.getItems().add("61");
        txtDamage.getItems().add("57");
        txtDamage.getItems().add("52");
        txtDamage.getItems().add("50");
        txtDamage.getItems().add("49");
        txtDamage.getItems().add("47");
        txtDamage.getItems().add("46");
        txtDamage.getItems().add("45");
        txtDamage.getItems().add("44");
        txtDamage.getItems().add("42");
        txtDamage.getItems().add("41");
        txtDamage.getItems().add("39");
        txtDamage.getItems().add("38");
        txtDamage.getItems().add("37");
        txtDamage.getItems().add("36");
        txtDamage.getItems().add("34");
        txtDamage.getItems().add("31");
        txtDamage.getItems().add("29");
        txtDamage.getItems().add("21");

        //combobox aanmaken voor Capacity type
        ComboBox txtCapacity = new ComboBox();
        //id geven aan de combobox
        txtCapacity.setId("box3");
        //een width en een height geven aan de combobox
        txtCapacity.setPrefSize(175, 35);
        //de opgehaalde text uit de database instellen als prompttext
        txtCapacity.setPromptText(String.valueOf(wr.getCapacity()));
        //items toevoegen aan de combobox
        txtCapacity.getItems().add("101");
        txtCapacity.getItems().add("50");
        txtCapacity.getItems().add("31");
        txtCapacity.getItems().add("30");
        txtCapacity.getItems().add("25");
        txtCapacity.getItems().add("20");
        txtCapacity.getItems().add("11");
        txtCapacity.getItems().add("10");
        txtCapacity.getItems().add("8");
        txtCapacity.getItems().add("7");
        txtCapacity.getItems().add("5");
        txtCapacity.getItems().add("1");

        //combox aanmaken voor FireRate type
        ComboBox txtFireRate = new ComboBox();
        //id geven aan de combobox
        txtFireRate.setId("box4");
        //een width en een height geven aan de combobox
        txtFireRate.setPrefSize(175, 35);
        //de opgehaalde text uit de database instellen als prompttext
        txtFireRate.setPromptText(String.valueOf(wr.getFirerate()));
        //items toevoegen aan de combobox
        txtFireRate.getItems().add("980");
        txtFireRate.getItems().add("970");
        txtFireRate.getItems().add("900");
        txtFireRate.getItems().add("860");
        txtFireRate.getItems().add("850");
        txtFireRate.getItems().add("800");
        txtFireRate.getItems().add("780");
        txtFireRate.getItems().add("770");
        txtFireRate.getItems().add("750");
        txtFireRate.getItems().add("749");
        txtFireRate.getItems().add("700");
        txtFireRate.getItems().add("690");
        txtFireRate.getItems().add("680");
        txtFireRate.getItems().add("670");
        txtFireRate.getItems().add("600");
        txtFireRate.getItems().add("1");

        //combobox aanmaken voor Mobility type
        ComboBox txtMobility = new ComboBox();
        //id geven aan de combobox
        txtMobility.setId("box5");
        //een width en een height geven aan de combobox
        txtMobility.setPrefSize(175, 35);
        //de opgehaalde text uit de database instellen as prompttext
        txtMobility.setPromptText(String.valueOf(wr.getMobility()));
        //items toevoegen aan de combobox
        txtMobility.getItems().add("50");
        txtMobility.getItems().add("45");
        txtMobility.getItems().add("43");
        txtMobility.getItems().add("42");
        txtMobility.getItems().add("41");
        txtMobility.getItems().add("40");
        txtMobility.getItems().add("39");
        txtMobility.getItems().add("38");
        txtMobility.getItems().add("36");
        txtMobility.getItems().add("35");



        //button aanmaken voor het wijzigen van gegevens
        Button btnWijzig = new Button("Wijzig");




        //variabele aanmaken voor de database class
        DatabaseWeapon dbw = new DatabaseWeapon();

        //setonaction geven aan de wijzig button
        btnWijzig.setOnAction(e->{
            //values ophalen en omzetten in string
            String naamValue = txtWeapon.getValue() != null ? txtWeapon.getValue().toString() : "";
            String damageValue = txtDamage.getValue() != null ? txtDamage.getValue().toString() : "";
            String capacityValue = txtCapacity.getValue() != null ? txtCapacity.getValue().toString() : "";
            String firerateValue = txtFireRate.getValue() != null ? txtFireRate.getValue().toString() : "";
            String mobilityValue = txtMobility.getValue() != null ? txtMobility.getValue().toString() : "";

            // Update only if values are not null
            if (!naamValue.isEmpty()) {
                wr.setNaam(naamValue);
            }

            if (!damageValue.isEmpty()) {
                wr.setDamage(Integer.parseInt(damageValue));
            }

            if (!capacityValue.isEmpty()) {
                wr.setCapacity(Integer.parseInt(capacityValue));
            }

            if (!firerateValue.isEmpty()) {
                wr.setFirerate(Integer.parseInt(firerateValue));
            }

            if (!mobilityValue.isEmpty()) {
                wr.setMobility(Integer.parseInt(mobilityValue));
            }


            // Update the database and close the stage
            dbw.updateWeaponResult(wr);
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



        //controls toevoegen aan layout
        root.add(txtWeapon, 0, 1);
        root.add(txtDamage, 0, 2);
        root.add(txtCapacity,0,3);
        root.add(txtMobility,0,4);
        root.add(btnWijzig, 0, 5);


        // 4 aanmaken scene
        Scene scene = new Scene(root, 1200, 600);

        deStage.setScene(scene);
        deStage.setTitle("Current");
        deStage.show();








    }
}
