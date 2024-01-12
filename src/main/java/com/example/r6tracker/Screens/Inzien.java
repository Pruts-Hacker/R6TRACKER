package com.example.r6tracker.Screens;

import javafx.animation.TranslateTransition;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Inzien {

    public Inzien(){
        Stage stage4 = new Stage();
        GridPane root = new GridPane();
        root.setId("Root");

        Label titleLabel = new Label("Statistieken Bekijken");
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

        HBox hbox = new HBox();


        hbox.getChildren().addAll(leftPane);
        root.add(topPane, 1, 0);
        root.add(hbox, 1, 1);


        Scene scene4 = new Scene(root, 1200, 600);
        scene4.getStylesheets().add(getClass().getResource("/com/example/r6tracker/stylesheets/Inzien.css").toString());
        stage4.setScene(scene4);
        stage4.setTitle("R6TRACKER");
        stage4.show();

    }


    private void switchToNewPage2() {
        Invullen invullen = new Invullen();
        System.out.println("Switched to the new page");
    }

    private void switchToNewPage3() {
        Inzien inzien = new Inzien();
        System.out.println("Switched to the new page");
    }
}




