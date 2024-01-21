package com.example.r6tracker.Screens;

import com.example.r6tracker.classes.Database;
import com.example.r6tracker.classes.Speler;
import javafx.animation.TranslateTransition;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
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
            Invullen inv = new Invullen();
        });


        Button menu2 = new Button("Statistieken Bekijken");
        menu2.setId("menu2");
        menu2.setOnAction(e -> {
            Inzien inz = new Inzien();
        });



        GridPane leftPane = new GridPane();
        leftPane.setId("leftpane");
        leftPane.setVgap(15);
        leftPane.setPadding(new Insets(20, 0, 0, 10));/* top right bottom left */
        leftPane.setPrefSize(150, 550);
        leftPane.add(menu1, 1, 0);
        leftPane.add(menu2, 1, 1);

        Database db = new Database();

        TableView tv1 = new TableView<>();
        tv1.setId("spelerTV");

        TableColumn<Speler, Integer> col1 = new TableColumn<>("Speler_id");
        col1.setCellValueFactory(new PropertyValueFactory<>("id"));

        TableColumn<Speler, String> col2 = new TableColumn<>("Naam");
        col2.setCellValueFactory(new PropertyValueFactory<>("naam"));

        TableColumn<Speler, String> col3 = new TableColumn<>("Gamertag");
        col3.setCellValueFactory(new PropertyValueFactory<>("gamertag"));

        TableColumn<Speler, Integer> col4 = new TableColumn<>("Level");
        col4.setCellValueFactory(new PropertyValueFactory<>("level"));

        TableColumn<Speler, String> col5 = new TableColumn<>("Rank");
        col5.setCellValueFactory(new PropertyValueFactory<>("rank"));

        tv1.getColumns().addAll(col1, col2, col3, col4, col5);
        tv1.getItems().setAll(db.geefSpeler());

        TableView tv2 = new TableView<>();
        tv2.setId("opperatorTV");
        TableView tv3 = new TableView<>();
        tv3.setId("matchresultTV");
        TableView tv4 = new TableView<>();
        tv4.setId("weaponresultTV");
        GridPane allTV = new GridPane();



        allTV.add(tv1,1,0);
        allTV.add(tv2,2,0);
        allTV.add(tv3,1,1);
        allTV.add(tv4,2,1);


        HBox hbox = new HBox();


        hbox.getChildren().addAll(leftPane, allTV);
        root.add(topPane, 1, 0);
        root.add(hbox, 1, 1);


        Scene scene4 = new Scene(root, 1200, 600);
        scene4.getStylesheets().add(getClass().getResource("/com/example/r6tracker/stylesheets/Inzien.css").toString());
        stage4.setScene(scene4);
        stage4.setTitle("R6TRACKER");
        stage4.show();

    }



}




