package com.example.r6tracker.Screens;

import com.example.r6tracker.classes.*;
import javafx.animation.TranslateTransition;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.util.converter.IntegerStringConverter;

public class Invullen {


    public Invullen() {
        //stage aanmaken
        Stage stage3 = new Stage();
        //de applicatie mag niet groter worden dan de aangegeven width en height
        stage3.setResizable(false);
        //gridpane aanmaken voor de hoofdlayout
        GridPane root = new GridPane();
        //id geven aan de gridpane voor de css pagina
        root.setId("Root");

        //label aaanmaken voor de pagina
        Label titleLabel = new Label("Statistieken Invullen");
        //id geven aan de label voor de css pagina
        titleLabel.setId("title");
        //een width en een height geven aan de label
        titleLabel.setPrefSize(1050, 55);
        //animation toevoegen aan de label
        TranslateTransition tt = new TranslateTransition(Duration.seconds(2), titleLabel);
        //startpunt ingeven
        tt.setFromX(0);
        //eindpunt ingeven
        tt.setToX(312);
        //play functie geven
        tt.play();

        //label aaanmaken voor de applicatie naam
        Label name = new Label("R6TRACKER");
        //id geven aan de label
        name.setId("name");
        //een width en een height geven aan de label
        name.setPrefSize(150, 55);
        //een padding geven aan de label
        name.setPadding(new Insets(15));

        //hbox aanmaken
        HBox topPane = new HBox();
        //id geven aan de hbox
        topPane.setId("toppane");
        //een positie geven aan de hbox
        topPane.setAlignment(Pos.TOP_LEFT);
        //een width en een height geven aan de hbox
        topPane.setPrefSize(1200, 55);

        //labels toevoegen aan de gridpane
        topPane.getChildren().addAll(name, titleLabel);

        //button aanmaken voor invullen pagina
        Button menu1 = new Button("Statistieken Invullen");
        //id geven aan de button
        menu1.setId("menu1");
        //een setonaction geven aan de button
        menu1.setOnAction(e -> {
            //doorverwijzing naar invullen pagina
            Invullen inv = new Invullen();
        });

        //button aanmaken voor inzien pagina
        Button menu2 = new Button("Statistieken Bekijken");
        //id geven aan de button
        menu2.setId("menu2");
        //een setonaction geven aan de button
        menu2.setOnAction(e -> {
            //doorverwijzing naar inzien pagina
            Inzien inz = new Inzien();
        });


        //gridpane aanmaken voor het midden van de pagina
        GridPane leftPane = new GridPane();
        //id geven aan de gridpane
        leftPane.setId("leftpane");
        //een vertical gap geven aan de items in de gridpane
        leftPane.setVgap(15);
        //een padding geven aan de items in de gridpane
        leftPane.setPadding(new Insets(20, 0, 0, 10));/* top right bottom left */
        //een width en een height geven aan de gridpane
        leftPane.setPrefSize(150, 550);
        //menu buttons toevoegen aan de gridpane
        leftPane.add(menu1, 1, 0);
        leftPane.add(menu2, 1, 1);


        //gridpane aanmaken voor het midden voor de inputs
        GridPane Inputs = new GridPane();
        //positie geven aan de geidpane
        Inputs.setAlignment(Pos.CENTER);
        //padding geven aan de gridpane
        Inputs.setPadding(new Insets(0, 0, 0, 250));
        //een horizontal gap geven aan de items in de gridpane
        Inputs.setHgap(35);
        //een vertical gap geven aan de items in de gridpane
        Inputs.setVgap(35);

        //combobox aanmaken voor opperator types
        ComboBox Name = new ComboBox();
        //id geven aan de combobox
        Name.setId("box");
        //een width en een height geven aan de combobox
        Name.setPrefSize(175, 35);
        //items toevoegen aan de combobox
        Name.getItems().add("Attacker");
        Name.getItems().add("Defender");
        //een info text geven aan de combobox
        Name.setPromptText("Opperator Type");


            //comboboc aanmaken voor de name types
            ComboBox Name2 = new ComboBox<>();
            //id geven aan de combobox
            Name2.setId("box2");
            //een width en een height geven aan de combobox
            Name2.setPrefSize(175, 35);
            //een info text geven aan de combobox
            Name2.setPromptText("Operator Name");

        //comboboc aanmaken voor Ability types
        ComboBox Name3 = new ComboBox<>();
        //id geven aan de combobox
        Name3.setId("box3");
        //een width en een height geven aan de combobox
        Name3.setPrefSize(175, 35);
        //een info text geven aan de combobox
        Name3.setPromptText("Ability");

        //een combobox aanmaken voor de MoveSpeed types
        ComboBox Name4 = new ComboBox<>();
        //een id geven aan de combobox
        Name4.setId("box4");
        //een width en een height geven aan de combobox
        Name4.setPrefSize(175, 35);
        //een info text geven aan de combobox
        Name4.setPromptText("Move Speed");
        //items toevoegen aan de combobox
        Name4.getItems().addAll("1", "2", "3");

        //combobox Name een setonaction geven voor invoer mogelijkheden
        Name.setOnAction(e -> {
            //if statement aan maken voor name2 en name3 zodat de juiste namen en abilitys bij de juiste types hooren
                if ("Attacker".equals(Name.getValue())) {
                    Name2.getItems().clear();
                    Name2.getItems().addAll("Ace", "Amaru", "Ash", "Blackbeard","Blitz", "Brava", "Buck", "Capitão", "Dokkaebi", "Finka", "Flores", "Fuze", "Glaz",
                            "Gridlock", "Grim", "Hibana", "Iana", "IQ", "Jackal", "Kali", "Lion", "Maverick", "Montagne", "Nomad", "Nøkk", "Osa", "Ram", "Recruit", "Sens",
                            "Sledge", "Thatcher", "Thermite", "Twitch", "Ying", "Zero", "Zofia");

                    Name3.getItems().clear();
                    Name3.getItems().addAll("Sniper Eye", "Cluster Charge", "Electronics Scan", "Flash Shield","Shock Drone", "Extendable Shield", "Hardbreach Charge", "M120 Crem", "Emp Grenades", "Hammer", "Side Shotgun", "Gun Shield", "Crossbow",
                            "Hardbreach Charges", "Footprint Scanner", "Cluster Flashbangs", "  Side Grenadelauncher", "Logic Bomb", "Healing Charge", "Orbital Scan", "Breaching Tool", "Repulsion Grenades", "Spike Mats", "Camera Invisibility", "Instant Rappel", "Demolition shots", "Clone Drone", "Spy Camera", "Bomb Drones",
                            "Thorn", "Thunderbird", "Tubarão", "Valkyrie", "Vigil", "Wamai", "Warden");



                } else if ("Defender".equals(Name.getValue())) {
                    Name2.getItems().clear();
                    Name2.getItems().addAll("Alibi", "Aruni", "Azami", "Bandit","Castle", "Caviera", "Clash", "Doc", "Echo", "Ela", "Fenrir", "Frost", "Goyo",
                            "Jäger", "Kaid", "Kapkan", "Lesion", "Maestro", "Melusi", "Mira", "Mozzie", "Mute", "Oryx", "Pulse", "Recruit", "Rook", "Smoke", "Solis", "Tachanka",
                            "Clear Shield", "Smoke Wall", "Scan Pest", "Hacking Drone", "Demolition Drone");

                    Name3.getItems().clear();
                    Name3.getItems().addAll("Signal Jammers", "Toxic Gas", "Cardiac Sensor", "Bulletproof Barricades","Stim pistol", "Ceramic Plates", "Shockwire Batteries", "ADS Devices", "Explosive Traps", "Fire Grenades", "Welcome Mat", "Sticky Cameras", "Special Pistol",
                            "Yokai Drones", "Bulletproof Windows", "Poison Mines", "Concussion Mines", "Cloaking Device", "Evil Eye", "Holograms", "Shock Shield", "Electroclaw", "Pest Robots", "Smart Glasses", "Fire Cannisters", "Wall Dash", "Laser Barrier", "Healing Station", "Spike Trap",
                            "Kabi Barrier", "Smoke Screen", "Mag-Net", "Banshee", "Spec-IO", "Zoto Cannister");


                }
            });



        // Aanmaken van TextFields voor kills gegevens
        TextField Name5 = new TextField();
        //id geven aan de textfield
        Name5.setId("box5");
        //een width en een height geven aan de textfield
        Name5.setPrefSize(175, 35);
        //info text geven aan de textfield
        Name5.setPromptText("Kills");

        //een textformatter aanmaken zodat er geen letters kunnen worden ingevuld
        TextFormatter<Integer> textFormatter = new TextFormatter<>(new IntegerStringConverter(), null, c ->
                (c.getControlNewText().matches("\\d*") ? c : null));

        // Voeg de TextFormatter toe aan de TextField
        Name5.setTextFormatter(textFormatter);

        TextField Name6 = new TextField();
        Name6.setId("box6");
        Name6.setPrefSize(175, 35);
        Name6.setPromptText("Deaths");
        //een textformatter aanmaken zodat er geen letters kunnen worden ingevuld
        TextFormatter<Integer> textFormatter2 = new TextFormatter<>(new IntegerStringConverter(), null, c ->
                (c.getControlNewText().matches("\\d*") ? c : null));

        // Voeg de TextFormatter toe aan de TextField
        Name6.setTextFormatter(textFormatter2);

        TextField Name7 = new TextField();
        Name7.setId("box7");
        Name7.setPrefSize(175, 35);
        Name7.setPromptText("Wins");

        //een textformatter aanmaken zodat er geen letters kunnen worden ingevuld
        TextFormatter<Integer> textFormatter3 = new TextFormatter<>(new IntegerStringConverter(), null, c ->
                (c.getControlNewText().matches("\\d*") ? c : null));
        // Voeg de TextFormatter toe aan de TextField
        Name7.setTextFormatter(textFormatter3);

        TextField Name8 = new TextField();
        Name8.setId("box8");
        Name8.setPrefSize(175, 35);
        Name8.setPromptText("Losses");
        //een textformatter aanmaken zodat er geen letters kunnen worden ingevuld
        TextFormatter<Integer> textFormatter4 = new TextFormatter<>(new IntegerStringConverter(), null, c ->
                (c.getControlNewText().matches("\\d*") ? c : null));
        // Voeg de TextFormatter toe aan de TextField
        Name8.setTextFormatter(textFormatter4);

        //button aanmaken voor weapon page
        Button Name9 = new Button("Best Weapon");
        //id geven aan button
        Name9.setId("box9");
        //een width en een height geven aan de button
        Name9.setPrefSize(175, 35);

        //setonaction geven aan de button om door te gaan naar andere pagina
        Name9.setOnAction(e->{
            //doorverwijzing andere pagina
            Weapon weapon = new Weapon();
        });

        //database object aanmaken
        DatabaseSpeler dbs = new DatabaseSpeler();
        DatabaseOpperator dbo = new DatabaseOpperator();
        DatabaseMatchResult dbmr = new DatabaseMatchResult();
        //opperatoridopslaancontroller object aanmaken
        OpperatorIdOpslaanController oio = new OpperatorIdOpslaanController();
        //matchresultcontroller object aanmaken
        MatchResultController mrc = new MatchResultController();
        //opperatorcontroller object aanmaken
        OpperatorController oc = new OpperatorController();

        //button aanmaken voor het opslaan van gegevens
        Button btnOpslaan = new Button("Opslaan");
        //een width en een height geven aan de button
        btnOpslaan.setPrefSize(175, 35);
        //setonaction geven aan de button voor fout controle en opslaan gegevens
        btnOpslaan.setOnAction(e->{
            //if statement voor fout afhandeling
            if (Name.getValue() == null || Name2.getValue() == null ||  Name3.getValue() == null || Name4.getValue() == null || Name5.getText().isEmpty() || Name6.getText().isEmpty() || Name7.getText().isEmpty() || Name8.getText().isEmpty()) {
                System.out.println("een of meerdere velden zijn niet correct ingevlud");

                //  alert wanneer velden leeg zijn
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Waarschuwing");
                alert.setHeaderText("een of meerdere velden zijn niet ingevuld");
                alert.showAndWait();

                //   kleuren textfield border veranderen wanneer leeg
                if (Name.getValue() == null) {
                    Name.setStyle("-fx-border-color: red");
                }else {
                    Name.setStyle("-fx-border-color: black");
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
                if (Name5.getText().isEmpty()) {
                    Name5.setStyle("-fx-border-color: red");
                }else {
                    Name5.setStyle("-fx-border-color: black");
                }

                if (Name6.getText().isEmpty()) {
                    Name6.setStyle("-fx-border-color: red");
                }else {
                    Name6.setStyle("-fx-border-color: black");
                }
                if (Name7.getText().isEmpty()) {
                    Name7.setStyle("-fx-border-color: red");
                }else {
                    Name7.setStyle("-fx-border-color: black");
                }
                if (Name8.getText().isEmpty()) {
                    Name8.setStyle("-fx-border-color: red");
                }else {
                    Name8.setStyle("-fx-border-color: black");
                }}

            //if statement voor melding
            if (Name.getValue() == null || Name2.getValue() == null || Name3.getValue() == null ||
                    Name4.getValue() == null || Name5.getText().isEmpty() || Name6.getText().isEmpty() ||
                    Name7.getText().isEmpty() || Name8.getText().isEmpty()) {

                // ... (rest van de validatie en meldingen bij lege velden)

            } else {
                try {

                    // Toon een melding dat de gegevens zijn opgeslagen
                    Alert successAlert = new Alert(Alert.AlertType.INFORMATION);
                    successAlert.setTitle("Succes");
                    successAlert.setHeaderText(null);
                    successAlert.setContentText("Gegevens zijn succesvol opgeslagen!");
                    successAlert.showAndWait();
                } catch (Exception ex) {
                    // Toon een melding als er een probleem is bij het opslaan van de gegevens
                    Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                    errorAlert.setTitle("Fout bij opslaan");
                    errorAlert.setHeaderText(null);
                    errorAlert.setContentText("Er is een fout opgetreden bij het opslaan van de gegevens.");
                    errorAlert.showAndWait();
                }
            }


            //ingevoerde data ophalen van de combobox
            String type = Name.getValue().toString();
            //ingevoerde data ophalen van de combobox
            String naam = Name2.getValue().toString();
            //ingevoerde data ophalen van de combobox
            String Ability = Name3.getValue().toString();
            //ingevoerde data ophalen van de combobox
            String movespeed = Name4.getValue().toString();
            //combobox omzetten van string naar int
            int moveSpeed = Integer.parseInt(movespeed);
            //ingevoerde data ophalen van de textfield kills
            String kills = Name5.getText();
            //textfield omzetten van string naar int
            int Kills = Integer.parseInt(kills);
            //ingevoerde data ophalen van de textfield deaths
            String deaths = Name6.getText();
            //textfield omzetten van string naar int
            int Deaths = Integer.parseInt(deaths);
             //ingevoerde data ophalen van de textfield wins
            String wins = Name7.getText();
            //textfield omzetten van string naar int
            int Wins = Integer.parseInt(wins);
             //ingevoerde data ophalen van de textfield losses
            String losses = Name8.getText();
            //textfield omzetten van string naar int
            int Losses = Integer.parseInt(losses);






            //  gegevens opslaan in array
            mrc.addMatchResult(dbmr.geefMatchId(), Kills, Deaths, Wins, Losses, dbmr.geefMatchSpelerId());
            oc.addOpperator(dbo.geefOpperatorId(), naam, type, Ability, moveSpeed, dbo.geefOppSpelerId());


            dbo.opslaanOpperator(naam, type, Ability, moveSpeed, dbs.geefMaxPlayerID());
            oio.addId(dbo.geefMaxOpperatorID());
            dbmr.opslaanMatchresult(Kills, Deaths, Wins, Losses, dbs.geefMaxPlayerID());
            System.out.println("Aangemaakt opperatorid = " + dbo.geefMaxOpperatorID());





        });

        //alle invoervelden toevoegen aan de gridpane
        Inputs.add(Name, 1, 0);
        Inputs.add(Name2, 2, 0);
        Inputs.add(Name3, 1, 1);
        Inputs.add(Name4, 2, 1);
        Inputs.add(Name5, 1, 2);
        Inputs.add(Name6, 2, 2);
        Inputs.add(Name7, 1, 3);
        Inputs.add(Name8,2,3);
        Inputs.add(Name9,1,4);
        Inputs.add(btnOpslaan, 2, 4);
        //hbox aanmaken
        HBox hbox = new HBox();

        //gridpanes toevoegen aan hbox
        hbox.getChildren().addAll(leftPane, Inputs);
        //gridpane en hbox toevoegen aan hoofdlayout
        root.add(topPane, 1, 0);
        root.add(hbox, 1, 1);
        //scene aanmaken
        Scene scene3 = new Scene(root, 1200, 600);
        scene3.getStylesheets().add(getClass().getResource("/com/example/r6tracker/stylesheets/Invullen.css").toString());
        stage3.setScene(scene3);
        stage3.setTitle("R6TRACKER");
        stage3.show();

    }





}




