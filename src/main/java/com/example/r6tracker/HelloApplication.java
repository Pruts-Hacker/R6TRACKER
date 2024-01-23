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

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {


//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        GridPane root = new GridPane();
        root.setId("Root");
        root.setPrefSize(1200,600);
        root.setAlignment(Pos.CENTER);
        root.setVgap(50);




        Label txtWelkom = new Label("Welkom bij de R6TRACKER");
        txtWelkom.setId("welkom");
        txtWelkom.setAlignment(Pos.TOP_CENTER);

        GridPane inlog = new GridPane();
        inlog.setId("inlog");
        inlog.setHgap(15);
        inlog.setPadding(new Insets(10));



        TextField Naam = new TextField();
        Naam.setPromptText("Gebruikersnaam");
        Naam.setId("gebruikersnaam");
        Naam.setPrefSize(175,25);


        TextField gamertag = new TextField();
        gamertag.setPromptText("Gamertag");
        gamertag.setId("gamertag");
        gamertag.setPrefSize(175,25);



        TextField level = new TextField();
        level.setPromptText("Level");
        level.setId("level");
        level.setPrefSize(175,25);


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

        Database db = new Database();

        Button btnLogIn = new Button("Opslaan");
        btnLogIn.setId("knop");
        btnLogIn.setAlignment(Pos.CENTER);

        SpelerController sc = new SpelerController();
        SpelerIdOpslaanController sio = new SpelerIdOpslaanController();

        btnLogIn.setOnAction(e -> {


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

            //ingevoerde data ophalen van de combobox
            String ranking = (String) rank.getValue();
            //ingevoerde data ophalen van de textfield Naam
            String name = Naam.getText();
            //ingevoerde data ophalen van de textfield gamertag
            String tag = gamertag.getText();
            //ingevoerde data ophalen van de textfield level
            String leveling = level.getText();

            int levels = Integer.parseInt(leveling);




            //  gegevens opslaan in array
            sc.addSpeler(db.geefSpelerId(), ranking, name, tag, levels);
            sio.addId(db.geefMaxPlayerID());


            db.opslaanSpeler(name, tag, levels, ranking);
            System.out.println("Aangemaakt playerid = " + db.geefMaxPlayerID());


           Home home = new Home();

        }});
        inlog.add(Naam,1,0);
        inlog.add(gamertag,2,0);
        inlog.add(level,1,1);
        inlog.add(rank,2,1);
        inlog.add(btnLogIn,1,3);
        root.add(txtWelkom,1,0);
        root.add(inlog,1,1);



        Scene scene = new Scene(root, 1200, 600);
        scene.getStylesheets().add(getClass().getResource("stylesheets/inlog.css").toString());

        stage.setTitle("R6TRACKER!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}

