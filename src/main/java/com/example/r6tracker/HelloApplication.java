package com.example.r6tracker;

import com.example.r6tracker.Screens.Home;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
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



        Button btnLogIn = new Button("Opslaan");
        btnLogIn.setId("knop");
        btnLogIn.setAlignment(Pos.CENTER);

        btnLogIn.setOnAction(e -> {

            switchToNewPage();

        });
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



    private boolean isValidCredentials(String username, String password) {
        // Replace this with your own validation logic
        return username.equals("admin") && password.equals("admin");
    }

    private void switchToNewPage() {
        Home home = new Home();
        System.out.println("Switched to the new page");
    }
}

