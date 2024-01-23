package com.example.r6tracker.Screens;

import com.example.r6tracker.classes.Database;
import com.example.r6tracker.classes.MatchResult;
import com.example.r6tracker.classes.Opperator;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class modifyView3 {
    public modifyView3(MatchResult mr){
        //opbouw nieuw scherm


        //1 aanmaken stageobject
        Stage deStage = new Stage();
        //aanmaken layout
        GridPane root = new GridPane();

        TextField txtKills = new TextField();
        txtKills.setText(String.valueOf(mr.getKills()));
        TextField txtDeaths = new TextField();
        txtDeaths.setText(String.valueOf(mr.getDeaths()));
        TextField txtWins = new TextField();
        txtWins.setText(String.valueOf(mr.getWins()));
        TextField txtLosses = new TextField();
        txtLosses.setText(String.valueOf(mr.getLosses()));



        Button btnWijzig = new Button("Wijzig");





        Database db = new Database();

        btnWijzig.setOnAction(e->{

            mr.setKills(Integer.valueOf(txtKills.getText()));
            mr.setDeaths(Integer.valueOf(txtDeaths.getText()));
            mr.setWins(Integer.valueOf(txtWins.getText()));
            mr.setLosses(Integer.valueOf(txtLosses.getText()));
            db.updateMatchResult(mr);
            deStage.close();


        });



        //controls toevoegen aan layout
        root.add(txtKills, 0, 1);
        root.add(txtDeaths, 0, 2);
        root.add(txtWins, 0, 3);
        root.add(txtLosses,0,4);
        root.add(btnWijzig, 0, 5);


        // 4 aanmaken scene
        Scene scene = new Scene(root, 1200, 600);

        deStage.setScene(scene);
        deStage.setTitle("Current");
        deStage.show();








    }
}
