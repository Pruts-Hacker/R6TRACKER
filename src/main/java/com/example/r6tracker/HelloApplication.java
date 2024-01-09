package com.example.r6tracker;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);

        Label txtWelkom = new Label("Welkom bij de R6TRACKER");

        VBox inlog = new VBox();
        TextField txtNaam = new TextField();
        txtNaam.setPromptText("Gebruikersnaam");
        TextField txtWachtwoord = new TextField();
        txtWachtwoord.setPromptText("Wachtwoord");

        inlog.getChildren().addAll(txtNaam, txtWachtwoord);
        root.add(txtWelkom,1,0);
        root.add(inlog,1,1);

        Scene scene = new Scene(root, 1200, 600);
        stage.setTitle("R6TRACKER!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}