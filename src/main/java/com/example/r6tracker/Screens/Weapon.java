package com.example.r6tracker.Screens;

import com.example.r6tracker.classes.Database;
import com.example.r6tracker.classes.WeaponResultController;
import javafx.animation.TranslateTransition;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Weapon {

    public Weapon(){
        //nieuwe stage aanmaken voor nieuwe pagina
        Stage stage5 = new Stage();
        // Aanmaken van de hoofdlay-out als een GridPane
        GridPane root = new GridPane();
        //een id instellen voor de css pagina
        root.setId("Root");

        //Label aanmaken met de paginanaam voor de rechter zijde van de header
        Label titleLabel = new Label("Statistieken Bekijken");
        //een id instellen voor de css pagina
        titleLabel.setId("title");
        //een width en een height geven aan de label
        titleLabel.setPrefSize(1050, 55);
        // een transition toevoegen aan de label
        TranslateTransition tt = new TranslateTransition(Duration.seconds(2), titleLabel);
        //een startpunt instellen voor de transition
        tt.setFromX(0);
        //een eindpunt instellen voor de transition
        tt.setToX(312);
        //een afspeel functie instellen voor de transition
        tt.play();

        //Label aanmaken met de applicatie naam voor de linkerzijde van de header
        Label name = new Label("R6TRACKER");
        //een id instellen voor de css pagina
        name.setId("name");
        //een height en een width geven aan de label
        name.setPrefSize(150, 55);
        //een padding geven aan de label zodat er een ruimte is van 15 pixels rondom de label
        name.setPadding(new Insets(15));

        //Hbox aanmaken voor de header
        HBox topPane = new HBox();
        //een id instellen voor de css pagina
        topPane.setId("toppane");
        //een positie geven aan de hbox
        topPane.setAlignment(Pos.TOP_LEFT);
        //een height en een width meegeven aan de hbox
        topPane.setPrefSize(1200, 55);

        //de labels toevoegen aan de hbox
        topPane.getChildren().addAll(name, titleLabel);



        //gridpane aanmaken voor de menubar
        GridPane leftPane = new GridPane();
        //een id instellen voor de css pagina
        leftPane.setId("leftpane");
        //vertical gap instellen voor de items in de gridpane
        leftPane.setVgap(15);
        //een padding instellen voor de items in de gridpane
        leftPane.setPadding(new Insets(20, 0, 0, 10));/* top right bottom left */
        //een width en een height meegeven aan de gridpane
        leftPane.setPrefSize(150, 550);

        //hbox aanmaken voor het midden van de pagina
        HBox hbox = new HBox();

        //gridpane aanmaken voor de comboboxen
        GridPane Inputs = new GridPane();
        //een positie geven aan de hbox
        Inputs.setAlignment(Pos.CENTER);
        //een padding geven aan de items in de gridpane
        Inputs.setPadding(new Insets(0, 0, 0, 250));
        //een horizontal gap instellen voor de items in de gridpane
        Inputs.setHgap(35);
        //een vertical gap instellen voor de items in de gridpane
        Inputs.setVgap(35);

        // een comboboc aanmaken voor wapen namen
        ComboBox Name1 = new ComboBox();
        //een id geven aan de combobox voor de css pagina
        Name1.setId("box1");
        //een width en een height geven aan de combobox
        Name1.setPrefSize(175, 35);
        //een info text ingeven voor de combobox
        Name1.setPromptText("Best Weapon");
        //items toevoegen aan de combobox
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

        // een comboboc aanmaken voor damage types
        ComboBox Name2 = new ComboBox();
        //een id geven aan de combobox voor de css pagina
        Name2.setId("box2");
        //een width en een height geven aan de combobox
        Name2.setPrefSize(175, 35);
        //een info text geven aan de combobox
        Name2.setPromptText("Damage");
        //items toevoegen aan de combobox
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

        //een combobx aanmaken voor Capacity types
        ComboBox Name3 = new ComboBox();
        //een id geven aan de combobox voor de css pagina
        Name3.setId("box3");
        //een width en een height gevem aan de combobox
        Name3.setPrefSize(175, 35);
        //een info text geven aan de combobox
        Name3.setPromptText("Capacity");
        //items toevoegen aan de combobox
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

        //een combobox aanmaken voor de FireRate types
        ComboBox Name4 = new ComboBox();
        //een id geven aan de combobox voor de css pagina
        Name4.setId("box4");
        //een width en een height geven aan de combobox
        Name4.setPrefSize(175, 35);
        //een info text geven aan de combobox
        Name4.setPromptText("Fire Rate");
        //items toevoegen aan de combobox
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

        //combobox aanmaken voor de Mobility types
        ComboBox Name5 = new ComboBox();
        //een id geven aan de combobox voor de css pagina
        Name5.setId("box5");
        //een width en een height geven aan de combobox
        Name5.setPrefSize(175, 35);
        //een info text geven aan de combobox
        Name5.setPromptText("Mobility");
        //items toevoegen aan de combobox
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

        Database db = new Database();
        WeaponResultController wrc = new WeaponResultController();

        Button btnOpslaan = new Button("Opslaan");
        btnOpslaan.setId("opslaan");
        btnOpslaan.setPrefSize(175, 35);
        btnOpslaan.setOnAction(e -> {

            if (Name1.getValue() == null || Name2.getValue() == null || Name3.getValue() == null || Name4.getValue() == null || Name5.getValue() == null ) {
                System.out.println("een of meerdere velden zijn niet correct ingevlud");

                //  alert wanneer velden leeg zijn
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Waarschuwing");
                alert.setHeaderText("een of meerdere velden zijn niet ingevuld");
                alert.showAndWait();

                //   kleuren textfield border veranderen wanneer leeg
                if (Name1.getValue() == null) {
                    Name1.setStyle("-fx-border-color: red");
                }else {
                    Name1.setStyle("-fx-border-color: black");
                }

                if (Name2.getValue() == null) {
                    Name2.setStyle("-fx-border-color: red");
                }else {
                    Name2.setStyle("-fx-border-color: black");
                }

                if (Name3.getValue() == null) {
                    Name3.setStyle("-fx-border-color: red");
                }else {
                    Name3.setStyle("-fx-border-color: black");
                }

                if (Name4.getValue() == null) {
                    Name4.setStyle("-fx-border-color: red");
                }else {
                    Name4.setStyle("-fx-border-color: black");
                }

                if (Name5.getValue() == null) {
                    Name5.setStyle("-fx-border-color: red");
                }else {
                    Name5.setStyle("-fx-border-color: black");
                }}

            //ingevoerde data ophalen van de combobox
            String naam = Name1.getValue().toString();
            //ingevoerde data ophalen van de combobox
            String damage = Name2.getValue().toString();
            int dmg = Integer.parseInt(damage);
            //ingevoerde data ophalen van de combobox
            String capacity = Name3.getValue().toString();
            int cpy = Integer.parseInt(capacity);
            //ingevoerde data ophalen van de combobox
            String firerate = Name4.getValue().toString();
            int fr = Integer.parseInt(firerate);
            //ingevoerde data ophalen van de combobox
            String mobility = Name5.getValue().toString();
            int mby = Integer.parseInt(mobility);





            //  gegevens opslaan in array
            wrc.addWeaponResult(db.geefWeaponId(), naam, dmg, cpy, fr, mby, db.geefWeaponOpperatorId());



            db.opslaanWeapon(naam, dmg, cpy, fr, mby, db.geefMaxOpperatorID());
            stage5.close();



        });

            Inputs.add(Name1,1,0);
        Inputs.add(Name2,2,0);
        Inputs.add(Name3,1,1);
        Inputs.add(Name4,2,1);
        Inputs.add(Name5,1,2);
        Inputs.add(btnOpslaan,2,2);

        hbox.getChildren().addAll(leftPane, Inputs);
        root.add(topPane, 1, 0);
        root.add(hbox, 1, 1);


        Scene scene5 = new Scene(root, 1200, 600);
        scene5.getStylesheets().add(getClass().getResource("/com/example/r6tracker/stylesheets/Weapon.css").toString());
        stage5.setScene(scene5);
        stage5.setTitle("R6TRACKER");
        stage5.show();
    }

}
