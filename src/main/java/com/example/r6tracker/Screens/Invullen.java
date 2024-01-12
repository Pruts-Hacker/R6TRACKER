package com.example.r6tracker.Screens;

import javafx.animation.TranslateTransition;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Invullen {


    public Invullen() {
        Stage stage3 = new Stage();

        GridPane root = new GridPane();
        root.setId("Root");

        Label titleLabel = new Label("Statistieken Invullen");
        titleLabel.setId("title");
        titleLabel.setPrefSize(1050, 55);
        TranslateTransition tt = new TranslateTransition(Duration.seconds(2), titleLabel);
        tt.setFromX(0);
        tt.setToX(312);
        tt.play();


        Label name = new Label("R6TRACKER");
        name.setId("name");
        name.setPrefSize(150, 55);
        name.setPadding(new Insets(15));


        HBox topPane = new HBox();
        topPane.setId("toppane");
        topPane.setAlignment(Pos.TOP_LEFT);
        topPane.setPrefSize(1200, 55);


        topPane.getChildren().addAll(name, titleLabel);


        Button menu1 = new Button("Statistieken Invullen");
        menu1.setId("menu1");
        menu1.setStyle("");
        menu1.setOnAction(e -> {
            switchToNewPage2();
        });


        Button menu2 = new Button("Statistieken Bekijken");
        menu2.setId("menu2");
        menu2.setOnAction(e -> {
            switchToNewPage3();
        });



        GridPane leftPane = new GridPane();
        leftPane.setId("leftpane");
        leftPane.setVgap(15);
        leftPane.setPadding(new Insets(20, 0, 0, 10));/* top right bottom left */
        leftPane.setPrefSize(150, 550);
        leftPane.add(menu1, 1, 0);
        leftPane.add(menu2, 1, 1);



        GridPane Inputs = new GridPane();
        Inputs.setAlignment(Pos.CENTER);
        Inputs.setPadding(new Insets(0, 0, 0, 250));
        Inputs.setHgap(35);
        Inputs.setVgap(35);

        ComboBox Name = new ComboBox();
        Name.setId("box");
        Name.setPrefSize(175, 35);
        Name.getItems().add("Attacker");
        Name.getItems().add("Defender");
        Name.setPromptText("Opperator Type");

        ComboBox Name2 = new ComboBox();
        Name2.setId("box2");
        Name2.setPrefSize(175, 35);
        Name2.setPromptText("Opperator Name");
        Name2.getItems().add("Recruit");
        Name2.getItems().add("Sledge");
        Name2.getItems().add("Thatcher");
        Name2.getItems().add("Ash");
        Name2.getItems().add("Thermite");
        Name2.getItems().add("Twitch");
        Name2.getItems().add("Montagne");
        Name2.getItems().add("Glaz");
        Name2.getItems().add("Fuze");
        Name2.getItems().add("Blitz");
        Name2.getItems().add("Iq");
        Name2.getItems().add("Buck");
        Name2.getItems().add("Blackbeard");
        Name2.getItems().add("Capitão");
        Name2.getItems().add("Hibana");
        Name2.getItems().add("Jackal");
        Name2.getItems().add("Ying");
        Name2.getItems().add("Zofia");
        Name2.getItems().add("Dokkaebi");
        Name2.getItems().add("Lion");
        Name2.getItems().add("Finka");
        Name2.getItems().add("Maverick");
        Name2.getItems().add("Nomad");
        Name2.getItems().add("Nøkk");
        Name2.getItems().add("Amaru");
        Name2.getItems().add("Kali");
        Name2.getItems().add("Iana");
        Name2.getItems().add("Ace");
        Name2.getItems().add("Zero");
        Name2.getItems().add("Flores");
        Name2.getItems().add("Osa");
        Name2.getItems().add("Sens");
        Name2.getItems().add("Grim");
        Name2.getItems().add("Brava");
        Name2.getItems().add("Ram");
        Name2.getItems().add("Smoke");
        Name2.getItems().add("Mute");
        Name2.getItems().add("Castle");
        Name2.getItems().add("Pulse");
        Name2.getItems().add("Dock");
        Name2.getItems().add("Rook");
        Name2.getItems().add("Kapkan");
        Name2.getItems().add("Tachanka");
        Name2.getItems().add("Jäger");
        Name2.getItems().add("Bandit");
        Name2.getItems().add("Frost");
        Name2.getItems().add("Valkyrie");
        Name2.getItems().add("Caviera");
        Name2.getItems().add("Echo");
        Name2.getItems().add("Mira");
        Name2.getItems().add("Lesion");
        Name2.getItems().add("Ella");
        Name2.getItems().add("Vigil");
        Name2.getItems().add("Alibi");
        Name2.getItems().add("Maestro");
        Name2.getItems().add("Clash");
        Name2.getItems().add("kaid");
        Name2.getItems().add("Mozzie");
        Name2.getItems().add("Warden");
        Name2.getItems().add("Goyo");
        Name2.getItems().add("Wamai");
        Name2.getItems().add("Oryx");
        Name2.getItems().add("Melusi");
        Name2.getItems().add("Aruni");
        Name2.getItems().add("Thunderbird");
        Name2.getItems().add("Thorn");
        Name2.getItems().add("Azami");
        Name2.getItems().add("Solis");
        Name2.getItems().add("Fenrir");
        Name2.getItems().add("Tubarao");

        TextField Name3 = new TextField();
        Name3.setId("box3");
        Name3.setPrefSize(175, 35);
        Name3.setPromptText("Kills");

        TextField Name4 = new TextField();
        Name4.setId("box4");
        Name4.setPrefSize(175, 35);
        Name4.setPromptText("Deaths");

        TextField Name5 = new TextField();
        Name5.setId("box5");
        Name5.setPrefSize(175, 35);
        Name5.setPromptText("Wins");

        TextField Name6 = new TextField();
        Name6.setId("box6");
        Name6.setPrefSize(175, 35);
        Name6.setPromptText("Losses");

        Button Name7 = new Button("Best Weapon");
        Name7.setId("box7");
        Name7.setPrefSize(175, 35);

        Name7.setOnAction(e->{
            switchToNewPage4();
        });



        Button btnOpslaan = new Button("Opslaan");
        btnOpslaan.setPrefSize(175, 35);


        Inputs.add(Name, 1, 0);
        Inputs.add(Name2, 2, 0);
        Inputs.add(Name3, 1, 1);
        Inputs.add(Name4, 2, 1);
        Inputs.add(Name5, 1, 2);
        Inputs.add(Name6, 2, 2);
        Inputs.add(Name7, 1, 3);
        Inputs.add(btnOpslaan, 2, 3);

        HBox hbox = new HBox();


        hbox.getChildren().addAll(leftPane, Inputs);
        root.add(topPane, 1, 0);
        root.add(hbox, 1, 1);
        Scene scene3 = new Scene(root, 1200, 600);
        scene3.getStylesheets().add(getClass().getResource("/com/example/r6tracker/stylesheets/Invullen.css").toString());
        stage3.setScene(scene3);
        stage3.setTitle("R6TRACKER");
        stage3.show();

    }


    private void switchToNewPage2() {
        Invullen invullen = new Invullen();
        System.out.println("Switched to the new page");
    }

    private void switchToNewPage3() {
        Inzien inzien = new Inzien();
        System.out.println("Switched to the new page");
    }

    private void switchToNewPage4() {
        Weapon weapon = new Weapon();
        System.out.println("Switched to the new page");
    }
}




