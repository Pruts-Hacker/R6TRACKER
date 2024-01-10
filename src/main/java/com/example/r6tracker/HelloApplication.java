package com.example.r6tracker;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

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

        VBox inlog = new VBox();
        inlog.setId("inlog");
        inlog.setSpacing(15);
        inlog.setPadding(new Insets(10));



        TextField txtNaam = new TextField();
        txtNaam.setPromptText("Gebruikersnaam");
        txtNaam.setId("gebruikersnaam");




        TextField txtWachtwoord = new TextField();
        txtWachtwoord.setPromptText("Wachtwoord");
        txtWachtwoord.setId("wachtwoord");

        inlog.getChildren().addAll(txtNaam, txtWachtwoord);
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