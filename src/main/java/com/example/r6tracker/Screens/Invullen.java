package com.example.r6tracker.Screens;

import com.example.r6tracker.classes.Database;
import com.example.r6tracker.classes.MatchResultController;
import com.example.r6tracker.classes.OpperatorController;
import com.example.r6tracker.classes.OpperatorIdOpslaanController;
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
        Stage stage3 = new Stage();
        //de applicatie mag niet groter worden dan de aangegeven width en height
        stage3.setResizable(false);
        GridPane root = new GridPane();
        root.setId("Root");

        Label titleLabel = new Label("Statistieken Invullen");
        titleLabel.setId("title");
        titleLabel.setPrefSize(1050, 55);
        TranslateTransition tt = new TranslateTransition(Duration.seconds(2), titleLabel);
        tt.setFromX(0);
        tt.setToX(312);
        tt.play();


        Label name = new Label("R6TRACKER");
        name.setId("name");
        name.setPrefSize(150, 55);
        name.setPadding(new Insets(15));


        HBox topPane = new HBox();
        topPane.setId("toppane");
        topPane.setAlignment(Pos.TOP_LEFT);
        topPane.setPrefSize(1200, 55);


        topPane.getChildren().addAll(name, titleLabel);


        Button menu1 = new Button("Statistieken Invullen");
        menu1.setId("menu1");
        menu1.setStyle("");
        menu1.setOnAction(e -> {
            Invullen inv = new Invullen();
        });


        Button menu2 = new Button("Statistieken Bekijken");
        menu2.setId("menu2");
        menu2.setOnAction(e -> {
            Inzien inz = new Inzien();
        });



        GridPane leftPane = new GridPane();
        leftPane.setId("leftpane");
        leftPane.setVgap(15);
        leftPane.setPadding(new Insets(20, 0, 0, 10));/* top right bottom left */
        leftPane.setPrefSize(150, 550);
        leftPane.add(menu1, 1, 0);
        leftPane.add(menu2, 1, 1);



        GridPane Inputs = new GridPane();
        Inputs.setAlignment(Pos.CENTER);
        Inputs.setPadding(new Insets(0, 0, 0, 250));
        Inputs.setHgap(35);
        Inputs.setVgap(35);

        ComboBox Name = new ComboBox();
        Name.setId("box");
        Name.setPrefSize(175, 35);
        Name.getItems().add("Attacker");
        Name.getItems().add("Defender");
        Name.setPromptText("Opperator Type");



            ComboBox Name2 = new ComboBox<>();
            Name2.setId("box2");
            Name2.setPrefSize(175, 35);
            Name2.setPromptText("Operator Name");

        ComboBox Name3 = new ComboBox<>();
        Name3.setId("box3");
        Name3.setPrefSize(175, 35);
        Name3.setPromptText("Ability");

        ComboBox Name4 = new ComboBox<>();
        Name4.setId("box4");
        Name4.setPrefSize(175, 35);
        Name4.setPromptText("Move Speed");
        Name4.getItems().addAll("1", "2", "3");


        Name.setOnAction(e -> {
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




        TextField Name5 = new TextField();
        Name5.setId("box5");
        Name5.setPrefSize(175, 35);
        Name5.setPromptText("Kills");

        TextFormatter<Integer> textFormatter = new TextFormatter<>(new IntegerStringConverter(), null, c ->
                (c.getControlNewText().matches("\\d*") ? c : null));

        // Voeg de TextFormatter toe aan de TextField
        Name5.setTextFormatter(textFormatter);

        TextField Name6 = new TextField();
        Name6.setId("box6");
        Name6.setPrefSize(175, 35);
        Name6.setPromptText("Deaths");

        TextFormatter<Integer> textFormatter2 = new TextFormatter<>(new IntegerStringConverter(), null, c ->
                (c.getControlNewText().matches("\\d*") ? c : null));

        // Voeg de TextFormatter toe aan de TextField
        Name6.setTextFormatter(textFormatter2);

        TextField Name7 = new TextField();
        Name7.setId("box7");
        Name7.setPrefSize(175, 35);
        Name7.setPromptText("Wins");


        TextFormatter<Integer> textFormatter3 = new TextFormatter<>(new IntegerStringConverter(), null, c ->
                (c.getControlNewText().matches("\\d*") ? c : null));
        // Voeg de TextFormatter toe aan de TextField
        Name7.setTextFormatter(textFormatter3);

        TextField Name8 = new TextField();
        Name8.setId("box8");
        Name8.setPrefSize(175, 35);
        Name8.setPromptText("Losses");

        TextFormatter<Integer> textFormatter4 = new TextFormatter<>(new IntegerStringConverter(), null, c ->
                (c.getControlNewText().matches("\\d*") ? c : null));
        // Voeg de TextFormatter toe aan de TextField
        Name8.setTextFormatter(textFormatter4);

        Button Name9 = new Button("Best Weapon");
        Name9.setId("box9");
        Name9.setPrefSize(175, 35);

        Name9.setOnAction(e->{
            Weapon weapon = new Weapon();
        });

        Database db = new Database();
        OpperatorIdOpslaanController oio = new OpperatorIdOpslaanController();
        MatchResultController mrc = new MatchResultController();
        OpperatorController oc = new OpperatorController();

        Button btnOpslaan = new Button("Opslaan");
        btnOpslaan.setPrefSize(175, 35);
        btnOpslaan.setOnAction(e->{
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

            if (Name.getValue() == null || Name2.getValue() == null || Name3.getValue() == null ||
                    Name4.getValue() == null || Name5.getText().isEmpty() || Name6.getText().isEmpty() ||
                    Name7.getText().isEmpty() || Name8.getText().isEmpty()) {

                // ... (rest van de validatie en meldingen bij lege velden)

            } else {
                try {
                    // (rest van je code om gegevens op te slaan)

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
            mrc.addMatchResult(db.geefMatchId(), Kills, Deaths, Wins, Losses, db.geefMatchSpelerId());
            oc.addOpperator(db.geefOpperatorId(), naam, type, Ability, moveSpeed, db.geefOppSpelerId());


            db.opslaanOpperator(naam, type, Ability, moveSpeed, db.geefMaxPlayerID());
            oio.addId(db.geefMaxOpperatorID());
            db.opslaanMatchresult(Kills, Deaths, Wins, Losses, db.geefMaxPlayerID());
            System.out.println("Aangemaakt opperatorid = " + db.geefMaxOpperatorID());





        });


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

        HBox hbox = new HBox();


        hbox.getChildren().addAll(leftPane, Inputs);
        root.add(topPane, 1, 0);
        root.add(hbox, 1, 1);
        Scene scene3 = new Scene(root, 1200, 600);
        scene3.getStylesheets().add(getClass().getResource("/com/example/r6tracker/stylesheets/Invullen.css").toString());
        stage3.setScene(scene3);
        stage3.setTitle("R6TRACKER");
        stage3.show();

    }





}




