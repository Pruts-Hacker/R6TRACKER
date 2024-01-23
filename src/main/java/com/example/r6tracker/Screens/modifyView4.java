package com.example.r6tracker.Screens;

import com.example.r6tracker.classes.Database;
import com.example.r6tracker.classes.Opperator;
import com.example.r6tracker.classes.WeaponResult;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class modifyView4 {

    public modifyView4(WeaponResult wr){
        //opbouw nieuw scherm


        //1 aanmaken stageobject
        Stage deStage = new Stage();
        //aanmaken layout
        GridPane root = new GridPane();

        ComboBox Name1 = new ComboBox();
        Name1.setId("box1");
        Name1.setPrefSize(175, 35);
        Name1.setPromptText(wr.getNaam());
        Name1.getItems().add(".44 Mag Semi-Auto");
        Name1.getItems().add("1911 TACOPS");
        Name1.getItems().add("416-C Carbine");
        Name1.getItems().add("417");
        Name1.getItems().add("552 Commando");
        Name1.getItems().add("556xi");
        Name1.getItems().add("6P41");
        Name1.getItems().add("9mm C1");
        Name1.getItems().add("9x19VSN");
        Name1.getItems().add("ACS12");
        Name1.getItems().add("AK-12");
        Name1.getItems().add("AK-47");
        Name1.getItems().add("AK-74");
        Name1.getItems().add("ALDA 5.56");
        Name1.getItems().add("AR-15.50");
        Name1.getItems().add("AR33");
        Name1.getItems().add("ARX200");
        Name1.getItems().add("AUG");
        Name1.getItems().add("AUG Para");
        Name1.getItems().add("Bailiff 410");
        Name1.getItems().add("Ballistic Shield");
        Name1.getItems().add("Bearing 9");
        Name1.getItems().add("Benelli M3");
        Name1.getItems().add("BOSG.12.2");
        Name1.getItems().add("C75 Auto");
        Name1.getItems().add("C7E");
        Name1.getItems().add("C8-SFW");
        Name1.getItems().add("Commando 9");
        Name1.getItems().add("CSRX 300");
        Name1.getItems().add("Desert Eagle");
        Name1.getItems().add("DP27");
        Name1.getItems().add("F90");
        Name1.getItems().add("FAMAS");
        Name1.getItems().add("Five-seven");
        Name1.getItems().add("FMG-9");
        Name1.getItems().add("FO-12");
        Name1.getItems().add("G36C");
        Name1.getItems().add("GSh-18");
        Name1.getItems().add("HK21");
        Name1.getItems().add("ITA12L");
        Name1.getItems().add("ITA12S");
        Name1.getItems().add("K1A");
        Name1.getItems().add("Keratos");
        Name1.getItems().add("L1A1");
        Name1.getItems().add("L85");
        Name1.getItems().add("LFP586");
        Name1.getItems().add("LMG-E");
        Name1.getItems().add("M1014");
        Name1.getItems().add("M12");
        Name1.getItems().add("M249");
        Name1.getItems().add("M4");
        Name1.getItems().add("M45 MEUSOC");
        Name1.getItems().add("M500");
        Name1.getItems().add("M60");
        Name1.getItems().add("M762");
        Name1.getItems().add("M870");
        Name1.getItems().add("MAC-11");
        Name1.getItems().add("Mk 14 EBR");
        Name1.getItems().add("Mk1 9mm");
        Name1.getItems().add("MP5");
        Name1.getItems().add("MP5K");
        Name1.getItems().add("MP5SD");
        Name1.getItems().add("MP7");
        Name1.getItems().add("MP9");
        Name1.getItems().add("MPX");
        Name1.getItems().add("Mx4 Storm");
        Name1.getItems().add("OTs-03");
        Name1.getItems().add("P-10C");
        Name1.getItems().add("P10 RONI");
        Name1.getItems().add("P12");
        Name1.getItems().add("P226");
        Name1.getItems().add("P229");
        Name1.getItems().add("P9");
        Name1.getItems().add("P90");
        Name1.getItems().add("PARA-308");
        Name1.getItems().add("PDW9");
        Name1.getItems().add("PMM");
        Name1.getItems().add("POF-9");
        Name1.getItems().add("PP-19 Bizon");
        Name1.getItems().add("PRB92");
        Name1.getItems().add("Q-929");
        Name1.getItems().add("R4-C");
        Name1.getItems().add("RG15");
        Name1.getItems().add("RPG-7");
        Name1.getItems().add("SASG-12");
        Name1.getItems().add("SC3000K");
        Name1.getItems().add("SCAR-H CQC");
        Name1.getItems().add("Scorpion EVO 3 A1");
        Name1.getItems().add("SDP 9mm");
        Name1.getItems().add("SG-CQB");
        Name1.getItems().add("SIX12");
        Name1.getItems().add("SMG-12");
        Name1.getItems().add("SPAS-12");
        Name1.getItems().add("SPAS-15");
        Name1.getItems().add("Spear .308");
        Name1.getItems().add("SR-25");
        Name1.getItems().add("Super Shorty");
        Name1.getItems().add("SuperNova");
        Name1.getItems().add("T-5 SMG");
        Name1.getItems().add("T-95 LSW");
        Name1.getItems().add("TCSG12");
        Name1.getItems().add("Type 89-F");
        Name1.getItems().add("UMP");
        Name1.getItems().add("USP");
        Name1.getItems().add("Uzi");
        Name1.getItems().add("V308");
        Name1.getItems().add("Vector .45 ACP");


        ComboBox Name2 = new ComboBox();
        Name2.setId("box2");
        Name2.setPrefSize(175, 35);
        Name2.setPromptText(String.valueOf(wr.getDamage()));
        Name2.getItems().add("71");
        Name2.getItems().add("61");
        Name2.getItems().add("57");
        Name2.getItems().add("52");
        Name2.getItems().add("50");
        Name2.getItems().add("49");
        Name2.getItems().add("47");
        Name2.getItems().add("46");
        Name2.getItems().add("45");
        Name2.getItems().add("44");
        Name2.getItems().add("42");
        Name2.getItems().add("41");
        Name2.getItems().add("39");
        Name2.getItems().add("38");
        Name2.getItems().add("37");
        Name2.getItems().add("36");
        Name2.getItems().add("34");
        Name2.getItems().add("31");
        Name2.getItems().add("29");
        Name2.getItems().add("21");


        ComboBox Name3 = new ComboBox();
        Name3.setId("box3");
        Name3.setPrefSize(175, 35);
        Name3.setPromptText(String.valueOf(wr.getCapacity()));
        Name3.getItems().add("101");
        Name3.getItems().add("50");
        Name3.getItems().add("31");
        Name3.getItems().add("30");
        Name3.getItems().add("25");
        Name3.getItems().add("20");
        Name3.getItems().add("11");
        Name3.getItems().add("10");
        Name3.getItems().add("8");
        Name3.getItems().add("7");
        Name3.getItems().add("5");
        Name3.getItems().add("1");

        ComboBox Name4 = new ComboBox();
        Name4.setId("box4");
        Name4.setPrefSize(175, 35);
        Name4.setPromptText(String.valueOf(wr.getFirerate()));
        Name4.getItems().add("980");
        Name4.getItems().add("970");
        Name4.getItems().add("900");
        Name4.getItems().add("860");
        Name4.getItems().add("850");
        Name4.getItems().add("800");
        Name4.getItems().add("780");
        Name4.getItems().add("770");
        Name4.getItems().add("750");
        Name4.getItems().add("749");
        Name4.getItems().add("700");
        Name4.getItems().add("690");
        Name4.getItems().add("680");
        Name4.getItems().add("670");
        Name4.getItems().add("600");
        Name4.getItems().add("1");

        ComboBox Name5 = new ComboBox();
        Name5.setId("box5");
        Name5.setPrefSize(175, 35);
        Name5.setPromptText(String.valueOf(wr.getMobility()));
        Name5.getItems().add("50");
        Name5.getItems().add("45");
        Name5.getItems().add("43");
        Name5.getItems().add("42");
        Name5.getItems().add("41");
        Name5.getItems().add("40");
        Name5.getItems().add("39");
        Name5.getItems().add("38");
        Name5.getItems().add("36");
        Name5.getItems().add("35");




        Button btnWijzig = new Button("Wijzig");





        Database db = new Database();

        btnWijzig.setOnAction(e->{

            wr.setNaam(String.valueOf(Name1.getValue()));
            wr.setDamage(Integer.valueOf(Name2.getValue().toString()));
            wr.setCapacity(Integer.valueOf(Name3.getValue().toString()));
            wr.setFirerate(Integer.valueOf(Name4.getValue().toString()));
            wr.setMobility(Integer.valueOf(Name5.getValue().toString()));
            db.updateWeaponResult(wr);
            deStage.close();


        });



        //controls toevoegen aan layout
        root.add(Name1, 0, 1);
        root.add(Name2, 0, 2);
        root.add(Name3, 0, 3);
        root.add(Name4,0,4);
        root.add(Name5,0,5);
        root.add(btnWijzig, 0, 6);


        // 4 aanmaken scene
        Scene scene = new Scene(root, 1200, 600);

        deStage.setScene(scene);
        deStage.setTitle("Current");
        deStage.show();








    }
}
