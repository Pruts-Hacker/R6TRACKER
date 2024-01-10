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


    public Invullen(){
        Stage stage3 = new Stage();

        GridPane root = new GridPane();
        root.setId("Root");

        Label titleLabel = new Label("Statistieken Invullen");
        titleLabel.setId("title");
        titleLabel.setPrefSize(1050,55);
        TranslateTransition tt = new TranslateTransition(Duration.seconds(2), titleLabel);
        tt.setFromX(0);
        tt.setToX(312);
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
        leftPane.setPadding(new Insets(20,0,0,10));/* top right bottom left */
        leftPane.setPrefSize(150,550);
        leftPane.add(menu1,1,0);
        leftPane.add(menu2,1,1);
        leftPane.add(menu3,1,2);
        leftPane.add(menu4,1,3);



        GridPane squares = new GridPane();
        squares.setAlignment(Pos.CENTER);
        squares.setPadding(new Insets(0,0,0,250));
        squares.setHgap(35);
        squares.setVgap(35);

        ComboBox Name = new ComboBox();
        Name.setId("box");
        Name.setPrefSize(175,35);
        Name.getItems().add("Attacker");
        Name.getItems().add("Defender");

        TextField Name2 = new TextField();
        Name2.setId("box2");
        Name2.setPrefSize(175,35);

        TextField Name3 = new TextField();
        Name3.setId("box3");
        Name3.setPrefSize(175,35);

        TextField Name4 = new TextField();
        Name4.setId("box4");
        Name4.setPrefSize(175,35);

        TextField Name5 = new TextField();
        Name5.setId("box5");
        Name5.setPrefSize(175,35);

        TextField Name6 = new TextField();
        Name6.setId("box6");
        Name6.setPrefSize(175,35);

        ComboBox Name7 = new ComboBox();
        Name7.setId("box7");
        Name7.setPrefSize(175,35);
        Name7.getItems().add(".44 Mag Semi-Auto");
        Name7.getItems().add("1911 TACOPS");
        Name7.getItems().add("416-C Carbine");
        Name7.getItems().add("417");
        Name7.getItems().add("552 Commando");
        Name7.getItems().add("556xi");
        Name7.getItems().add("6P41");
        Name7.getItems().add("9mm C1");
        Name7.getItems().add("9x19VSN");
        Name7.getItems().add("ACS12");
        Name7.getItems().add("AK-12");
        Name7.getItems().add("AK-47");
        Name7.getItems().add("AK-74");
        Name7.getItems().add("ALDA 5.56");
        Name7.getItems().add("AR-15.50");
        Name7.getItems().add("AR33");
        Name7.getItems().add("ARX200");
        Name7.getItems().add("AUG");
        Name7.getItems().add("AUG Para");
        Name7.getItems().add("Bailiff 410");
        Name7.getItems().add("Ballistic Shield");
        Name7.getItems().add("Bearing 9");
        Name7.getItems().add("Benelli M3");
        Name7.getItems().add("BOSG.12.2");
        Name7.getItems().add("C75 Auto");
        Name7.getItems().add("C7E");
        Name7.getItems().add("C8-SFW");
        Name7.getItems().add("Commando 9");
        Name7.getItems().add("CSRX 300");
        Name7.getItems().add("Desert Eagle");
        Name7.getItems().add( "DP27");
        Name7.getItems().add("F90");
        Name7.getItems().add("FAMAS");
        Name7.getItems().add("Five-seven");
        Name7.getItems().add("FMG-9");
        Name7.getItems().add("FO-12");
        Name7.getItems().add("G36C");
        Name7.getItems().add("GSh-18");
        Name7.getItems().add("HK21");
        Name7.getItems().add("ITA12L");
        Name7.getItems().add("ITA12S");
        Name7.getItems().add("K1A");
        Name7.getItems().add("Keratos");
        Name7.getItems().add("L1A1");
        Name7.getItems().add("L85");
        Name7.getItems().add("LFP586");
        Name7.getItems().add("LMG-E");
        Name7.getItems().add("M1014");
        Name7.getItems().add("M12");
        Name7.getItems().add("M249");
        Name7.getItems().add("M4");
        Name7.getItems().add("M45 MEUSOC");
        Name7.getItems().add("M500");
        Name7.getItems().add("M60");
        Name7.getItems().add("M762");
        Name7.getItems().add("M870");
        Name7.getItems().add("MAC-11");
        Name7.getItems().add("Mk 14 EBR");
        Name7.getItems().add("Mk1 9mm");
        Name7.getItems().add("MP5");
        Name7.getItems().add("MP5K");
        Name7.getItems().add("MP5SD");
        Name7.getItems().add("MP7");
        Name7.getItems().add("MP9");
        Name7.getItems().add("MPX");
        Name7.getItems().add("Mx4 Storm");
        Name7.getItems().add("OTs-03");
        Name7.getItems().add("P-10C");
        Name7.getItems().add("P10 RONI");
        Name7.getItems().add("P12");
        Name7.getItems().add("P226");
        Name7.getItems().add("P229");
        Name7.getItems().add("P9");
        Name7.getItems().add("P90");
        Name7.getItems().add("PARA-308");
        Name7.getItems().add("PDW9");
        Name7.getItems().add("PMM");
        Name7.getItems().add("POF-9");
        Name7.getItems().add("PP-19 Bizon");
        Name7.getItems().add("PRB92");
        Name7.getItems().add("Q-929");
        Name7.getItems().add("R4-C");
        Name7.getItems().add("RG15");
        Name7.getItems().add("RPG-7");
        Name7.getItems().add("SASG-12");
        Name7.getItems().add("SC3000K");
        Name7.getItems().add("SCAR-H CQC");
        Name7.getItems().add("Scorpion EVO 3 A1");
        Name7.getItems().add("SDP 9mm");
        Name7.getItems().add("SG-CQB");
        Name7.getItems().add("SIX12");
        Name7.getItems().add("SMG-12");
        Name7.getItems().add("SPAS-12");
        Name7.getItems().add("SPAS-15");
        Name7.getItems().add("Spear .308");
        Name7.getItems().add("SR-25");
        Name7.getItems().add("Super Shorty");
        Name7.getItems().add("SuperNova");
        Name7.getItems().add("T-5 SMG");
        Name7.getItems().add("T-95 LSW");
        Name7.getItems().add("TCSG12");
        Name7.getItems().add("Type 89-F");
        Name7.getItems().add("UMP");
        Name7.getItems().add("USP");
        Name7.getItems().add("Uzi");
        Name7.getItems().add("V308");
        Name7.getItems().add("Vector .45 ACP");


        squares.add(Name,1,0);
        squares.add(Name2,2,0);
        squares.add(Name3,1,1);
        squares.add(Name4,2,1);
        squares.add(Name5,1,2);
        squares.add(Name6,2,2);
        squares.add(Name7,1,3);

        HBox hbox = new HBox();




        hbox.getChildren().addAll(leftPane, squares);
        root.add(topPane,1,0);
        root.add(hbox,1,1);
        Scene scene3 = new Scene(root,1200,600);
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
        Leaderboard leaderboard = new Leaderboard();
        System.out.println("Switched to the new page");
    }

    private void switchToNewPage5() {
        Search search = new Search();
        System.out.println("Switched to the new page");
    }
}


