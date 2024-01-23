package com.example.r6tracker.Screens;

import com.example.r6tracker.classes.Database;
import com.example.r6tracker.classes.Speler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
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
        ComboBox txtRank = new ComboBox();
        txtRank.setPromptText(s.getRank());
        txtRank.setId("rank");
        txtRank.setPrefSize(175,25);
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



        Button btnWijzig = new Button("Wijzig");





        Database db = new Database();

        btnWijzig.setOnAction(e->{

            s.setNaam(txtNaam.getText());
            s.setGamertag(txtTag.getText());
            s.setLevel(Integer.valueOf(txtLevel.getText()));
            String rankValue = txtRank.getValue() != null ? txtRank.getValue().toString() : "";


            // Update only if values are not null
            if (!rankValue.isEmpty()) {
                s.setRank(rankValue);
            }

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




