package com.example.r6tracker.Screens;

import com.example.r6tracker.classes.Database;
import com.example.r6tracker.classes.Opperator;
import com.example.r6tracker.classes.Speler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class modifyView2 {
    public modifyView2(Opperator o){
        //opbouw nieuw scherm


        //1 aanmaken stageobject
        Stage deStage = new Stage();
        //aanmaken layout
        GridPane root = new GridPane();

        TextField txtNaam = new TextField();
        txtNaam.setText(o.getNaam());
        TextField txtType = new TextField();
        txtType.setText(o.getType());
        TextField txtAbility = new TextField();
        txtAbility.setText(o.getAbility());
        TextField txtMoveSpeed = new TextField();
        txtMoveSpeed.setText(String.valueOf(o.getMovespeed()));



        Button btnWijzig = new Button("Wijzig");





        Database db = new Database();

        btnWijzig.setOnAction(e->{

            o.setNaam(txtNaam.getText());
            o.setType(txtType.getText());
            o.setAbility(txtAbility.getText());
            o.setMovespeed(Integer.valueOf(txtMoveSpeed.getText()));
            db.updateOpperator(o);
            deStage.close();


        });



        //controls toevoegen aan layout
        root.add(txtNaam, 0, 1);
        root.add(txtType, 0, 2);
        root.add(txtAbility, 0, 3);
        root.add(txtMoveSpeed,0,4);
        root.add(btnWijzig, 0, 5);


        // 4 aanmaken scene
        Scene scene = new Scene(root, 1200, 600);

        deStage.setScene(scene);
        deStage.setTitle("Current");
        deStage.show();








    }
}






