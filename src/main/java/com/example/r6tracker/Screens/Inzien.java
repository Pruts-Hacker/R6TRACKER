package com.example.r6tracker.Screens;

import com.example.r6tracker.classes.*;
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
        //---------------------------------------------------------------------Speler table view--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        TableView tv1 = new TableView<>();
        tv1.setPrefWidth(425);
        tv1.setPrefHeight(225);

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

        //setonmouseclicked om gegevens te wijzigen
        tv1.setOnMouseClicked(e->{
            Speler s = (Speler) tv1.getSelectionModel().getSelectedItem();
            modifyView mod = new modifyView(s);
        });

        //---------------------------------------------------------------------Opperator table view--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


        TableView tv2 = new TableView<>();
        tv2.setPrefWidth(425);
        tv2.setPrefHeight(225);

        TableColumn<Opperator, Integer> col6 = new TableColumn<>("Opperator_id");
        col6.setCellValueFactory(new PropertyValueFactory<>("id"));

        TableColumn<Opperator, String> col7 = new TableColumn<>("Naam");
        col7.setCellValueFactory(new PropertyValueFactory<>("naam"));

        TableColumn<Opperator, String> col8 = new TableColumn<>("Type");
        col8.setCellValueFactory(new PropertyValueFactory<>("type"));

        TableColumn<Opperator, String> col9 = new TableColumn<>("Ability");
        col9.setCellValueFactory(new PropertyValueFactory<>("ability"));

        TableColumn<Opperator, Integer> col10 = new TableColumn<>("Move_speed");
        col10.setCellValueFactory(new PropertyValueFactory<>("movespeed"));

        TableColumn<Opperator, Integer> col11 = new TableColumn<>("Speler_id");
        col11.setCellValueFactory(new PropertyValueFactory<>("oppsid"));

        tv2.getColumns().addAll(col6, col7, col8, col9, col10, col11);
        tv2.getItems().addAll(db.geefOpperator());

        //setonmouseclicked om gegevens te wijzigen
        tv2.setOnMouseClicked(e->{
            Opperator o = (Opperator) tv2.getSelectionModel().getSelectedItem();
            modifyView2 mod2 = new modifyView2(o);
        });


        //---------------------------------------------------------------------MatchResult table view--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        TableView tv3 = new TableView<>();
        tv3.setPrefWidth(425);
        tv3.setPrefHeight(225);

        TableColumn<MatchResult, Integer> col12 = new TableColumn<>("Match_id");
        col12.setCellValueFactory(new PropertyValueFactory<>("id"));

        TableColumn<MatchResult, Integer> col13 = new TableColumn<>("Kills");
        col13.setCellValueFactory(new PropertyValueFactory<>("kills"));

        TableColumn<MatchResult, Integer> col14 = new TableColumn<>("Deaths");
        col14.setCellValueFactory(new PropertyValueFactory<>("deaths"));

        TableColumn<MatchResult, Integer> col15 = new TableColumn<>("Wins");
        col15.setCellValueFactory(new PropertyValueFactory<>("wins"));

        TableColumn<MatchResult, Integer> col16 = new TableColumn<>("Losses");
        col16.setCellValueFactory(new PropertyValueFactory<>("losses"));

        TableColumn<MatchResult, Integer> col17 = new TableColumn<>("Speler_id");
        col17.setCellValueFactory(new PropertyValueFactory<>("msid"));

        tv3.getColumns().addAll(col12, col13, col14, col15, col16, col17);
        tv3.getItems().addAll(db.geefMatchResult());

        //setonmouseclicked om gegevens te wijzigen
        tv3.setOnMouseClicked(e->{
            MatchResult mr = (MatchResult) tv3.getSelectionModel().getSelectedItem();
            modifyView3 mod3 = new modifyView3(mr);
        });

        //---------------------------------------------------------------------Weapon table view--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        TableView tv4 = new TableView<>();
        tv4.setPrefWidth(425);
        tv4.setPrefHeight(225);

        TableColumn<WeaponResult, Integer> col18 = new TableColumn<>("Weapon_id");
        col18.setCellValueFactory(new PropertyValueFactory<>("id"));

        TableColumn<WeaponResult, String> col19 = new TableColumn<>("Naam");
        col19.setCellValueFactory(new PropertyValueFactory<>("naam"));

        TableColumn<WeaponResult, Integer> col20 = new TableColumn<>("Damage");
        col20.setCellValueFactory(new PropertyValueFactory<>("damage"));

        TableColumn<WeaponResult, Integer> col21 = new TableColumn<>("Capacity");
        col21.setCellValueFactory(new PropertyValueFactory<>("capacity"));

        TableColumn<WeaponResult, Integer> col22 = new TableColumn<>("Fire_rate");
        col22.setCellValueFactory(new PropertyValueFactory<>("firerate"));

        TableColumn<WeaponResult, Integer> col23 = new TableColumn<>("Mobility");
        col23.setCellValueFactory(new PropertyValueFactory<>("mobility"));

        TableColumn<WeaponResult, Integer> col24 = new TableColumn<>("Opperator_id");
        col24.setCellValueFactory(new PropertyValueFactory<>("oppid"));


        tv4.getColumns().addAll(col18, col19, col20, col21, col22, col23, col24);
        tv4.getItems().addAll(db.geefWeaponResult());

        //setonmouseclicked om gegevens te wijzigen
        tv4.setOnMouseClicked(e->{
            WeaponResult wr = (WeaponResult) tv4.getSelectionModel().getSelectedItem();
            modifyView4 mod4 = new modifyView4(wr);
        });


        Button btnRefresh = new Button("Refresh");
        btnRefresh.setOnAction(e->{
            tv1.getItems().setAll(db.geefSpeler());
            tv2.getItems().setAll(db.geefOpperator());
            tv3.getItems().setAll(db.geefMatchResult());
            tv4.getItems().setAll(db.geefWeaponResult());
        });

        Button btnDelete = new Button("Delete");
        btnDelete.setOnAction(e->{
            db.verwijderSpeler();
            db.verwijderOpperator();
            db.verwijderMatchResult();
            db.verwijderWeapon();

            tv1.getItems().setAll(db.geefSpeler());
            tv2.getItems().setAll(db.geefOpperator());
            tv3.getItems().setAll(db.geefMatchResult());
            tv4.getItems().setAll(db.geefWeaponResult());
        });



//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        GridPane allTV = new GridPane();
        allTV.setHgap(20);
        allTV.setVgap(20);
        allTV.setPadding(new Insets(10,0,0,60));



        allTV.add(tv1,1,0);
        allTV.add(tv2,2,0);
        allTV.add(tv3,1,1);
        allTV.add(tv4,2,1);
        allTV.add(btnRefresh,1,2);
        allTV.add(btnDelete,2,2);


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




