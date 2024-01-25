package com.example.r6tracker.Screens;

import com.example.r6tracker.classes.Database;
import com.example.r6tracker.classes.Speler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class modifyView {

    public modifyView(Speler s) {
        // Aanmaken stageobject
        Stage deStage = new Stage();
        //de applicatie mag niet groter worden dan de aangegeven width en height
        deStage.setResizable(false);
        // Aanmaken layout
        GridPane root = new GridPane();

        // TextFields voor het invoeren van Speler gegevens
        TextField txtNaam = new TextField();
        txtNaam.setText(s.getNaam());
        TextField txtTag = new TextField();
        txtTag.setText(s.getGamertag());
        TextField txtLevel = new TextField();
        txtLevel.setText(String.valueOf(s.getLevel()));

        // ComboBox voor het selecteren van Speler Rank
        ComboBox txtRank = new ComboBox();
        txtRank.setPromptText(s.getRank());
        txtRank.setId("rank");
        txtRank.setPrefSize(175, 25);
        txtRank.getItems().add("Koper 5");
        txtRank.getItems().add("Koper 4");
        txtRank.getItems().add("Koper 3");
        txtRank.getItems().add("Koper 2");
        txtRank.getItems().add("Koper 1");
        txtRank.getItems().add("Brons 5");
        txtRank.getItems().add("Brons 4");
        txtRank.getItems().add("Brons 3");
        txtRank.getItems().add("Brons 2");
        txtRank.getItems().add("Brons 1");
        txtRank.getItems().add("Silver 5");
        txtRank.getItems().add("Silver 4");
        txtRank.getItems().add("Silver 3");
        txtRank.getItems().add("Silver 2");
        txtRank.getItems().add("Silver 1");
        txtRank.getItems().add("Gold 5");
        txtRank.getItems().add("Gold 4");
        txtRank.getItems().add("Gold 3");
        txtRank.getItems().add("Gold 2");
        txtRank.getItems().add("Gold 1");
        txtRank.getItems().add("Platinum 5");
        txtRank.getItems().add("Platinum 4");
        txtRank.getItems().add("Platinum 3");
        txtRank.getItems().add("Platinum 2");
        txtRank.getItems().add("Platinum 1");
        txtRank.getItems().add("Emerald 5");
        txtRank.getItems().add("Emerald 4");
        txtRank.getItems().add("Emerald 3");
        txtRank.getItems().add("Emerald 2");
        txtRank.getItems().add("Emerald 1");
        txtRank.getItems().add("Daimond 5");
        txtRank.getItems().add("Daimond 4");
        txtRank.getItems().add("Daimond 3");
        txtRank.getItems().add("Daimond 2");
        txtRank.getItems().add("Daimond 1");
        txtRank.getItems().add("Champion");



        // Button voor het wijzigen van Speler gegevens
        Button btnWijzig = new Button("Wijzig");

        // Database object
        Database db = new Database();

        // Event handler voor het wijzigen van Speler
        btnWijzig.setOnAction(e -> {
            // Waarden van de TextFields ophalen en toewijzen aan de Speler
            s.setNaam(txtNaam.getText());
            s.setGamertag(txtTag.getText());
            s.setLevel(Integer.valueOf(txtLevel.getText()));

            // Rank waarde ophalen van de ComboBox
            String rankValue = txtRank.getValue() != null ? txtRank.getValue().toString() : "";

            // Speler updaten alleen als waarden niet leeg zijn
            if (!rankValue.isEmpty()) {
                s.setRank(rankValue);
            }




            // Spelergegevens updaten in de database
            db.updateSpeler(s);
            try{
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Succes");
            alert.setHeaderText(null);
            alert.setContentText("De gegevens zijn succesvol opgeslagen.");
            alert.showAndWait();

            // Stage sluiten na het updaten
            deStage.close();
        } catch (NumberFormatException ex) {
            // Foutmelding weergeven als het level geen geldig getal is
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Fout");
            alert.setHeaderText(null);
            alert.setContentText("Voer een geldig getal in voor het level.");
            alert.showAndWait();
        } catch (Exception ex){
            // Algemene foutmelding weergeven als er een andere fout optreedt
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Fout");
            alert.setHeaderText(null);
            alert.setContentText("Er is een fout opgetreden bij het opslaan van de gegevens.");
            alert.showAndWait();

        }});




        // Controls toevoegen aan layout
        root.add(txtNaam, 0, 1);
        root.add(txtTag, 0, 2);
        root.add(txtLevel, 0, 3);
        root.add(txtRank, 0, 4);
        root.add(btnWijzig, 0, 5);

        // Scene aanmaken
        Scene scene = new Scene(root, 1200, 600);

        // Scene instellen op het stage object
        deStage.setScene(scene);
        // Titel instellen voor het stage object
        deStage.setTitle("Modify Player");
        // Stage weergeven
        deStage.show();
    }
    }


