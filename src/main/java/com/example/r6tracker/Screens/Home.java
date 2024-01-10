package com.example.r6tracker.Screens;

import javafx.animation.Animation;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.Objects;

public class Home {

    public Home(){
    Stage stage2 = new Stage();

    GridPane root = new GridPane();
    root.setId("Root");

    Label titleLabel = new Label("Home");
    titleLabel.setId("title");
    titleLabel.setPrefSize(1050,55);
        TranslateTransition tt = new TranslateTransition(Duration.seconds(2), titleLabel);
        tt.setFromX(0);
        tt.setToX(463);
        tt.play();


        Label name = new Label("R6TRACKER");
        name.setId("name");
        name.setPrefSize(150,55);
        name.setPadding(new Insets(15));




    HBox topPane = new HBox();
    topPane.setId("toppane");
    topPane.setAlignment(Pos.TOP_LEFT);
    topPane.setPrefSize(1200,55);


    topPane.getChildren().addAll(name, titleLabel);


    Button menu1 = new Button("Statistieken Invullen");
    menu1.setId("menu1");
    menu1.setStyle("");
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
    leftPane.setPadding(new Insets(20,0,0,5));/* top right bottom left */
    leftPane.setPrefSize(150,550);
    leftPane.add(menu1,1,0);
    leftPane.add(menu2,1,1);
    leftPane.add(menu3,1,2);
    leftPane.add(menu4,1,3);



       GridPane squares = new GridPane();
       squares.setAlignment(Pos.CENTER);
       squares.setPadding(new Insets(0,0,0,25));
       squares.setHgap(30);
       squares.setVgap(30);

       Pane square = new Pane();
       square.setId("box");
       square.setPrefSize(450,250);
       square.setOnMouseClicked(e->{
           switchToNewPage2();
       });

       Pane square2 = new Pane();
        square2.setId("box2");
        square2.setPrefSize(450,250);

        Pane square3 = new Pane();
        square3.setId("box3");
        square3.setPrefSize(450,250);

        Pane square4 = new Pane();
        square4.setId("box4");
        square4.setPrefSize(450,250);

        squares.add(square,1,0);
        squares.add(square2,2,0);
        squares.add(square3,1,1);
        squares.add(square4,2,1);

    HBox hbox = new HBox();




    hbox.getChildren().addAll(leftPane, squares);
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
