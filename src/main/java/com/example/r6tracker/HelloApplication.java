package com.example.r6tracker;

import com.example.r6tracker.Screens.Home;
import com.example.r6tracker.Screens.Invullen;
import com.example.r6tracker.classes.Database;
import com.example.r6tracker.classes.SpelerController;
import com.example.r6tracker.classes.SpelerIdOpslaanController;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.util.converter.IntegerStringConverter;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {



        // Aanmaken van de hoofdlay-out als een GridPane
        GridPane root = new GridPane();
        root.setId("Root");
        root.setPrefSize(1200,600);
        root.setAlignment(Pos.CENTER);
        root.setVgap(50);



        // Label aanmaken voor welkomstbericht
        Label txtWelkom = new Label("Welkom bij de R6TRACKER");
        txtWelkom.setId("welkom");
        txtWelkom.setAlignment(Pos.TOP_CENTER);

        // GridPane aanmaken voor inloggegevens
        GridPane inlog = new GridPane();
        inlog.setId("inlog");
        inlog.setHgap(15);
        inlog.setPadding(new Insets(10));



        // Tekstvelden aanmaken voor gebruikersnaam, gamertag, level
        TextField Naam = new TextField();
        Naam.setPromptText("Gebruikersnaam");
        Naam.setId("gebruikersnaam");
        Naam.setPrefSize(175, 25);

        TextField gamertag = new TextField();
        gamertag.setPromptText("Gamertag");
        gamertag.setId("gamertag");
        gamertag.setPrefSize(175, 25);

        TextField level = new TextField();
        level.setPromptText("Level");
        level.setId("level");
        level.setPrefSize(175, 25);

        TextFormatter<Integer> textFormatter = new TextFormatter<>(new IntegerStringConverter(), null, c ->
                (c.getControlNewText().matches("\\d*") ? c : null));

        // Voeg de TextFormatter toe aan de TextField
        level.setTextFormatter(textFormatter);

        // ComboBox aanmaken voor rang gegevens
        ComboBox rank = new ComboBox();
        rank.setPromptText("Rank");
        rank.setId("rank");
        rank.setPrefSize(175,25);
        rank.getItems().add("Koper 5");
        rank.getItems().add("Koper 4");
        rank.getItems().add("Koper 3");
        rank.getItems().add("Koper 2");
        rank.getItems().add("Koper 1");
        rank.getItems().add("Brons 5");
        rank.getItems().add("Brons 4");
        rank.getItems().add("Brons 3");
        rank.getItems().add("Brons 2");
        rank.getItems().add("Brons 1");
        rank.getItems().add("Silver 5");
        rank.getItems().add("Silver 4");
        rank.getItems().add("Silver 3");
        rank.getItems().add("Silver 2");
        rank.getItems().add("Silver 1");
        rank.getItems().add("Gold 5");
        rank.getItems().add("Gold 4");
        rank.getItems().add("Gold 3");
        rank.getItems().add("Gold 2");
        rank.getItems().add("Gold 1");
        rank.getItems().add("Platinum 5");
        rank.getItems().add("Platinum 4");
        rank.getItems().add("Platinum 3");
        rank.getItems().add("Platinum 2");
        rank.getItems().add("Platinum 1");
        rank.getItems().add("Emerald 5");
        rank.getItems().add("Emerald 4");
        rank.getItems().add("Emerald 3");
        rank.getItems().add("Emerald 2");
        rank.getItems().add("Emerald 1");
        rank.getItems().add("Daimond 5");
        rank.getItems().add("Daimond 4");
        rank.getItems().add("Daimond 3");
        rank.getItems().add("Daimond 2");
        rank.getItems().add("Daimond 1");
        rank.getItems().add("Champion");

        //variabelle aanmaken voor Database class
        Database db = new Database();

        //Button aanmaken voor het opslaan van alle ingevoerde gegevens
        Button btnLogIn = new Button("Opslaan");
        btnLogIn.setId("knop");
        btnLogIn.setAlignment(Pos.CENTER);

        //Variabelle aanmaken voor de SpelerController en SpelerIdOpslaanController class
        SpelerController sc = new SpelerController();
        SpelerIdOpslaanController sio = new SpelerIdOpslaanController();

        //Aanmaken van een setonaction voor de Opslaan button
        btnLogIn.setOnAction(e -> {

            //If statament aanmaken voor legevelden contole
            if (rank.getValue() == null || Naam.getText().isEmpty() || gamertag.getText().isEmpty() || level.getText().isEmpty()) {
                System.out.println("een of meerdere velden zijn niet correct ingevlud");

                //  alert wanneer velden leeg zijn
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Waarschuwing");
                alert.setHeaderText("een of meerdere velden zijn niet ingevuld");
                alert.showAndWait();

                //   kleuren textfield border veranderen wanneer leeg
                if (rank.getValue() == null) {
                    rank.setStyle("-fx-border-color: red");
                }else {
                    rank.setStyle("-fx-border-color: black");
                }

                if (Naam.getText().isEmpty()) {
                    Naam.setStyle("-fx-border-color: red");
                }else {
                    Naam.setStyle("-fx-border-color: black");
                }

                if (gamertag.getText().isEmpty()) {
                    gamertag.setStyle("-fx-border-color: red");
                }else {
                    gamertag.setStyle("-fx-border-color: black");
                }
                if (level.getText().isEmpty()) {
                    level.setStyle("-fx-border-color: red");
                }else {
                    level.setStyle("-fx-border-color: black");
                }}else {
                try {


                    // Toon een melding dat de gegevens zijn opgeslagen
                    Alert successAlert = new Alert(Alert.AlertType.INFORMATION);
                    successAlert.setTitle("Succes");
                    successAlert.setHeaderText(null);
                    successAlert.setContentText("Gegevens zijn succesvol opgeslagen!");
                    successAlert.showAndWait();

                    // Doorverwijzing naar andere pagina
                    Home home = new Home();
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
            String ranking = (String) rank.getValue();
            //ingevoerde data ophalen van de textfield Naam
            String name = Naam.getText();
            //ingevoerde data ophalen van de textfield gamertag
            String tag = gamertag.getText();
            //ingevoerde data ophalen van de textfield level
            String leveling = level.getText();
            //ingevoerde date omzetten naat integer
            int levels = Integer.parseInt(leveling);




            //  gegevens opslaan in array
            sc.addSpeler(db.geefSpelerId(), ranking, name, tag, levels);
            sio.addId(db.geefMaxPlayerID());

            // gegevens opslaan in database
            db.opslaanSpeler(name, tag, levels, ranking);
            //system out print aanmaken als extra check of het oplaan lukt
            System.out.println("Aangemaakt playerid = " + db.geefMaxPlayerID());

            //Doorverwijzing naar andere pagina
           Home home = new Home();

        });

        //alle textfields, comboboxen en buttons toevoegen aan de Inlog gridpane
        inlog.add(Naam,1,0);
        inlog.add(gamertag,2,0);
        inlog.add(level,1,1);
        inlog.add(rank,2,1);
        inlog.add(btnLogIn,1,3);

        //de gridpanes toevoegen aan de hoofd layout root
        root.add(txtWelkom,1,0);
        root.add(inlog,1,1);


        //scene aanmaken
        Scene scene = new Scene(root, 1200, 600);
        //css stylesheet linken aan de pagina
        scene.getStylesheets().add(getClass().getResource("stylesheets/inlog.css").toString());

        //title ingeven voor de pagina
        stage.setTitle("R6TRACKER!");
        //scene toevoegen aan de stage
        stage.setScene(scene);
        //de applicatie mag niet groter worden dan de aangegeven width en height
        stage.setResizable(false);
        //de stage weergevem op de pagina
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}

