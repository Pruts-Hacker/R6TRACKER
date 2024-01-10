package com.example.r6tracker;

import com.example.r6tracker.Screens.Home;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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


        Button btnLogIn = new Button("Inloggen");
        btnLogIn.setId("knop");
        btnLogIn.setAlignment(Pos.CENTER);

        btnLogIn.setOnAction(e -> {
            String username = txtNaam.getText();
            String password = txtWachtwoord.getText();
            // Validate the credentials
            if (isValidCredentials(username, password)) {
                // Switch to the new page
                switchToNewPage();
            } else {
                // Show an error message
                System.out.println("Invalid credentials");
            }
        });
        inlog.getChildren().addAll(txtNaam, txtWachtwoord, btnLogIn);
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

