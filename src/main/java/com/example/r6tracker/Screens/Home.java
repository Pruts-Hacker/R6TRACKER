package com.example.r6tracker.Screens;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Home {

    public Home(){
    Stage stage2 = new Stage();

    GridPane root = new GridPane();
    root.setId("Root");

    Label titleLabel = new Label("R6TRACKER");
    titleLabel.setId("title");

    StackPane topPane = new StackPane(titleLabel);
    topPane.setId("toppane");
    topPane.setAlignment(Pos.CENTER);
    topPane.setPrefSize(1200,50);

    Button menu1 = new Button("Statistieken Invullen");
    menu1.setId("menu1");
    menu1.setOnAction(e->{
        switchToNewPage2();
    });

    Button menu2 = new Button("Statistieken Bekijken");
    menu2.setId("menu2");
        menu2.setOnAction(e->{
            switchToNewPage3();
        });

    Button menu3 = new Button("Leaderboard");
    menu3.setId("menu3");
        menu3.setOnAction(e->{
            switchToNewPage4();
        });

    Button menu4 = new Button("Search");
    menu4.setId("menu4");
        menu4.setOnAction(e->{
            switchToNewPage5();
        });

    GridPane leftPane = new GridPane();
    leftPane.setId("leftpane");
    leftPane.setVgap(15);
    leftPane.setPadding(new Insets(20,0,0,10));/* top right bottom left */
    leftPane.setPrefSize(150,550);
    leftPane.add(menu1,1,0);
    leftPane.add(menu2,1,1);
    leftPane.add(menu3,1,2);
    leftPane.add(menu4,1,3);





    HBox hbox = new HBox();




    hbox.getChildren().addAll(leftPane);
    root.add(topPane,1,0);
    root.add(hbox,1,1);
    Scene scene2 = new Scene(root,1200,600);
        scene2.getStylesheets().add(getClass().getResource("/com/example/r6tracker/stylesheets/Home.css").toString());
    stage2.setScene(scene2);
    stage2.setTitle("R6TRACKER");
    stage2.show();

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
        Leaderboard leaderboard = new Leaderboard();
        System.out.println("Switched to the new page");
    }

    private void switchToNewPage5() {
        Search search = new Search();
        System.out.println("Switched to the new page");
    }
}
