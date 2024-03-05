package com.example.r6tracker.Screens;

import com.example.r6tracker.classes.DatabaseMatchResult;
import com.example.r6tracker.classes.MatchResult;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class modifyView3 {
    public modifyView3(MatchResult mr){



        //aanmaken stageobject
        Stage deStage = new Stage();
        //de applicatie mag niet groter worden dan de aangegeven width en height
        deStage.setResizable(false);
        //aanmaken layout
        GridPane root = new GridPane();

        // textfield aanmaken voor kills
        TextField txtKills = new TextField();
        //de opgehaalde text uit de database instellen als prompttext
        txtKills.setText(String.valueOf(mr.getKills()));
        //textfield aanmaken voor deaths
        TextField txtDeaths = new TextField();
        //de opgehaalde text uit de database instellen als prompttext
        txtDeaths.setText(String.valueOf(mr.getDeaths()));
        //textfield aanmaken voor wins
        TextField txtWins = new TextField();
        //de opgehaalde text uit de database instellen als prompttext
        txtWins.setText(String.valueOf(mr.getWins()));
        //textfield aanmaken voor losses
        TextField txtLosses = new TextField();
        //de opgehaalde text uit de database instellen als prompttext
        txtLosses.setText(String.valueOf(mr.getLosses()));


        //button aanmaken voor het wijzigen van gegevens
        Button btnWijzig = new Button("Wijzig");




        //variabele aanmaken voor de database class
        DatabaseMatchResult dbmr = new DatabaseMatchResult();

        //setonaction geven aan de wijzig button
        btnWijzig.setOnAction(e->{

            // de text in de database vervangen door de ingevoerde text
            mr.setKills(Integer.valueOf(txtKills.getText()));
            mr.setDeaths(Integer.valueOf(txtDeaths.getText()));
            mr.setWins(Integer.valueOf(txtWins.getText()));
            mr.setLosses(Integer.valueOf(txtLosses.getText()));


            dbmr.updateMatchResult(mr);
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
                deStage.close();
            }});






        //controls toevoegen aan layout
        root.add(txtKills, 0, 1);
        root.add(txtDeaths, 0, 2);
        root.add(txtWins, 0, 3);
        root.add(txtLosses,0,4);
        root.add(btnWijzig, 0, 5);


        // aanmaken scene
        Scene scene = new Scene(root, 1200, 600);

        deStage.setScene(scene);
        deStage.setTitle("Current");
        deStage.show();








    }
}
