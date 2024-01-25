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
        //stage aanmaken
    Stage stage2 = new Stage();
        //de applicatie mag niet groter worden dan de aangegeven width en height
        stage2.setResizable(false);
        //gridpane aanmaken als hoofdlayout
    GridPane root = new GridPane();
    //id geven aan gridpane
    root.setId("Root");

    //label aanmaken voor paginanaam
    Label titleLabel = new Label("Home");
    //id geven aan label
    titleLabel.setId("title");
    //een width en een height geven aan de label
    titleLabel.setPrefSize(1050,55);
    //een animation geven aan de label
        TranslateTransition tt = new TranslateTransition(Duration.seconds(2), titleLabel);
        //startpunt instellen
        tt.setFromX(0);
        //eindpunt instellen
        tt.setToX(463);
        //play functie geven
        tt.play();


        //label aanmaken voor applicatie naam
        Label name = new Label("R6TRACKER");
        //id geven aan label
        name.setId("name");
        //een width en een height geven aan de label
        name.setPrefSize(150,55);
        //padding geven aan de label
        name.setPadding(new Insets(15));



    //hbox aanmaken voor labels
    HBox topPane = new HBox();
    //id geven aan hbox
    topPane.setId("toppane");
    //positie geven aan hbox
    topPane.setAlignment(Pos.TOP_LEFT);
    //een width en een height geven aan de hbox
    topPane.setPrefSize(1200,55);


    //gridpanes toevoegen aan de hoofdlayout
    topPane.getChildren().addAll(name, titleLabel);

    //button aanmaken voor menu
    Button menu1 = new Button("Statistieken Invullen");
    //id geven aan button
    menu1.setId("menu1");
    //setonaction geven aan button
    menu1.setOnAction(e->{
        //verwijzing aanmaken naar nieuwe pagina
        Invullen inv = new Invullen();
    });


    //button aanmaken voor menu
    Button menu2 = new Button("Statistieken Bekijken");
    //id geven aan button
    menu2.setId("menu2");
        //setonaction geven aan button
        menu2.setOnAction(e->{
            //verwijzing aanmaken naar nieuwe pagina
            Inzien inzien = new Inzien();
        });

        //gridpane aanmaken voor menu
    GridPane leftPane = new GridPane();
    //id geven aan gridpane
    leftPane.setId("leftpane");
    //vertical gap geven aan items in de gridpane
    leftPane.setVgap(15);
    //padding instellen voor de items in de gridpane
    leftPane.setPadding(new Insets(20,0,0,5));/* top right bottom left */
    //een width en een height geven aan de gridpane
    leftPane.setPrefSize(150,550);
    //buttons toevoegen aan de gridpane
    leftPane.add(menu1,1,0);
    leftPane.add(menu2,1,1);



        //gridpane aanmaken voor de pagina sqaures
       GridPane squares = new GridPane();
       //positie geven aan de gridpane
       squares.setAlignment(Pos.CENTER);
       //padding geven aan de gridpane
       squares.setPadding(new Insets(0,0,0,25));
       //horizontal gap geven aan de gridpane
       squares.setHgap(30);
       //vertical gap geven aan de gridpane
       squares.setVgap(30);

       //pane aanmaken voor doorverwijzing naar andere pagina
       Pane square = new Pane();
       //id geven aan pane
       square.setId("box");
       //een width en een height geven aan de pane
       square.setPrefSize(450,250);
       //setonmouseclicked geven aan pane
       square.setOnMouseClicked(e->{
           //verwijzing aanmaken naar nieuwe pagina
           Invullen inv = new Invullen();
       });

       //pane aanmaken voor doorverwijzing naar andere pagina
       Pane square2 = new Pane();
       //id geven aan pane
        square2.setId("box2");
        //een width en een height geven aan de pane
        square2.setPrefSize(450,250);
        //setonmouseclicked geven aan pane
        square2.setOnMouseClicked(e->{
            //verwijzing aanmaken naar nieuwe pagina
            Inzien inzien = new Inzien();
        });

        //panes toevoegen aan de gridpane
        squares.add(square,1,0);
        squares.add(square2,2,0);

    //hbox aanmaken
    HBox hbox = new HBox();



    //gridpanes toevoegen aan de hbox
    hbox.getChildren().addAll(leftPane, squares);
    //gridpane en hbox toevoegen aan de hoofdlayout
    root.add(topPane,1,0);
    root.add(hbox,1,1);
    //scene aanmaken
    Scene scene2 = new Scene(root,1200,600);
        scene2.getStylesheets().add(getClass().getResource("/com/example/r6tracker/stylesheets/Home.css").toString());
    stage2.setScene(scene2);
    stage2.setTitle("R6TRACKER");
    stage2.show();

    }






}
