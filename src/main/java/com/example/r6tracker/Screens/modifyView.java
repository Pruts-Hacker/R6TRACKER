package com.example.r6tracker.Screens;

import com.example.r6tracker.classes.Database;
import com.example.r6tracker.classes.Speler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class modifyView {

    public modifyView(Speler s){
        //opbouw nieuw scherm


        //1 aanmaken stageobject
        Stage deStage = new Stage();
        //aanmaken layout
        GridPane root = new GridPane();

        TextField txtNaam = new TextField();
        txtNaam.setText(s.getNaam());
        TextField txtTag = new TextField();
        txtTag.setText(s.getGamertag());
        TextField txtLevel = new TextField();
        txtLevel.setText(String.valueOf(s.getLevel()));
        TextField txtRank = new TextField();
        txtRank.setText(s.getRank());



        Button btnWijzig = new Button("Wijzig");





        Database db = new Database();

        btnWijzig.setOnAction(e->{

            s.setNaam(txtNaam.getText());
            s.setGamertag(txtTag.getText());
            s.setLevel(Integer.valueOf(txtLevel.getText()));
            s.setRank(txtRank.getText());
            db.updateSpeler(s);
            deStage.close();


        });



        //controls toevoegen aan layout
        root.add(txtNaam, 0, 1);
        root.add(txtTag, 0, 2);
        root.add(txtLevel, 0, 3);
        root.add(txtRank,0,4);
        root.add(btnWijzig, 0, 5);


        // 4 aanmaken scene
        Scene scene = new Scene(root, 1200, 600);

        deStage.setScene(scene);
        deStage.setTitle("Current");
        deStage.show();








    }
}




