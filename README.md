# R6TRACKER

Deze applicatie is bedoeld om te helpen bij het bijhouden van de statistieken van de game Rainbow Six Siege. Hiermee kun je jezelf of anderen zien wie het meest kills heeft gemaakt, en met welke opperators je het beste bent.

## Installatie

De installatie van deze applicatie is eenvoudig. je koppieert de url van de laatste versie van de applicatie van de Github van de ontwikkelaar: https://github.com/Pruts-Hacker/R6TRACKER. Deze heb je nodig voor Github Desktop, want in GitHub Desktop klik je op add repository dan op clone repository en dan op url. Je plakt de gekoppieerde url in de textbalk en klikt op clone, daarna kun je hem openen via Github Desktop in intelleJ en dan ga je naar de HelloApplication file en klik je rechts bovenin op het groene pijltje (Run).

## Configuratie
Om de applicatie te kunnen gebruiken zul je Xampp moeten instaleren om een database connectie te kunnen leggen. eerst instaleer je xampp via internet en open je deze, zodra xampp open is klik je bij apache en mysql op run als deze runnen ga je terug naar je internet browser. als je weer in je browser bent vul je in je url balk localhost/phpmyamin in, daarna krijg je mysql te zien hier staan databases in, hierin klik je op nieuw en dan op importeren bij importeren geef je de database bestand in die te downloaden is in de discord en dan is je database connectie gelegd. Nu kun je de applicatie gaan gebruiken.

## Gebruik

Wanneer je de applicatie voor het eerst opent, zie je een scherm met verschillende invoer velden. Hier vul je Gebruikersnaam, Gamertag, Level en Rank in, als je dan vervolgens klikt op opslaan wordt je doorgestuurd naar de home pagina waar je een keuze kunt maken uit de paginas Statistieken Invullen of Statistieken Bekijken.
````
// Tekstvelden aanmaken voor gebruikersnaam, gamertag, level
        TextField Naam = new TextField();
        Naam.setPromptText("Gebruikersnaam");
        Naam.setId("gebruikersnaam");
        Naam.setPrefSize(175, 25);

        TextField gamertag = new TextField();
        gamertag.setPromptText("Gamertag");
        gamertag.setId("gamertag");
        gamertag.setPrefSize(175, 25);

        TextField level = new TextField();
        level.setPromptText("Level");
        level.setId("level");
        level.setPrefSize(175, 25);

        TextFormatter<Integer> textFormatter = new TextFormatter<>(new IntegerStringConverter(), null, c ->
                (c.getControlNewText().matches("\\d*") ? c : null));

        // Voeg de TextFormatter toe aan de TextField
        level.setTextFormatter(textFormatter);

        // ComboBox aanmaken voor rang gegevens
        ComboBox rank = new ComboBox();
        rank.setPromptText("Rank");
        rank.setId("rank");
        rank.setPrefSize(175,25);
        rank.getItems().add("Koper 5");
        rank.getItems().add("Koper 4");
        rank.getItems().add("Koper 3");
        rank.getItems().add("Koper 2");
        rank.getItems().add("Koper 1");
        rank.getItems().add("Brons 5");
        rank.getItems().add("Brons 4");
        rank.getItems().add("Brons 3");
        rank.getItems().add("Brons 2");
        rank.getItems().add("Brons 1");
        rank.getItems().add("Silver 5");
        rank.getItems().add("Silver 4");
        rank.getItems().add("Silver 3");
        rank.getItems().add("Silver 2");
        rank.getItems().add("Silver 1");
        rank.getItems().add("Gold 5");
        rank.getItems().add("Gold 4");
        rank.getItems().add("Gold 3");
        rank.getItems().add("Gold 2");
        rank.getItems().add("Gold 1");
        rank.getItems().add("Platinum 5");
        rank.getItems().add("Platinum 4");
        rank.getItems().add("Platinum 3");
        rank.getItems().add("Platinum 2");
        rank.getItems().add("Platinum 1");
        rank.getItems().add("Emerald 5");
        rank.getItems().add("Emerald 4");
        rank.getItems().add("Emerald 3");
        rank.getItems().add("Emerald 2");
        rank.getItems().add("Emerald 1");
        rank.getItems().add("Daimond 5");
        rank.getItems().add("Daimond 4");
        rank.getItems().add("Daimond 3");
        rank.getItems().add("Daimond 2");
        rank.getItems().add("Daimond 1");
        rank.getItems().add("Champion");

````
Als je voor Statiestieken Invullen kiest kom je op een pagina waar je een keuze kunt maken tussen Opperator type, na aanleiding van het gekozen type kun je een opperator kiezen en zijn of haar abillity kiezen en de move speed van de opperator kiezen.

En er is een knop om je door te verwijzen naar de Weapon pagina waar je je wapen in kunt voeren waar je het beste mee speelt, je voert de wapen naam, je wapen damage, je wapen capacity, je wapen fire rate en je wapen mobility.

Als alle gegevens zijn ingevoerd en opgeslagen hoef je deze stappen straks niet nog eens te herhalen behalve als je je opgeslagen statistieken hebt verwijdert anders hoef je ze alleen aan te passen in Statistieken Bekijken. Hieronder volgt een voorbeeld van de invoer velden en de beste wapen button code.
````
 //combobox aanmaken voor opperator types
        ComboBox Name = new ComboBox();
        //id geven aan de combobox
        Name.setId("box");
        //een width en een height geven aan de combobox
        Name.setPrefSize(175, 35);
        //items toevoegen aan de combobox
        Name.getItems().add("Attacker");
        Name.getItems().add("Defender");
        //een info text geven aan de combobox
        Name.setPromptText("Opperator Type");


            //comboboc aanmaken voor de name types
            ComboBox Name2 = new ComboBox<>();
            //id geven aan de combobox
            Name2.setId("box2");
            //een width en een height geven aan de combobox
            Name2.setPrefSize(175, 35);
            //een info text geven aan de combobox
            Name2.setPromptText("Operator Name");

        //comboboc aanmaken voor Ability types
        ComboBox Name3 = new ComboBox<>();
        //id geven aan de combobox
        Name3.setId("box3");
        //een width en een height geven aan de combobox
        Name3.setPrefSize(175, 35);
        //een info text geven aan de combobox
        Name3.setPromptText("Ability");

        //een combobox aanmaken voor de MoveSpeed types
        ComboBox Name4 = new ComboBox<>();
        //een id geven aan de combobox
        Name4.setId("box4");
        //een width en een height geven aan de combobox
        Name4.setPrefSize(175, 35);
        //een info text geven aan de combobox
        Name4.setPromptText("Move Speed");
        //items toevoegen aan de combobox
        Name4.getItems().addAll("1", "2", "3");

        //combobox Name een setonaction geven voor invoer mogelijkheden
        Name.setOnAction(e -> {
            //if statement aan maken voor name2 en name3 zodat de juiste namen en abilitys bij de juiste types hooren
                if ("Attacker".equals(Name.getValue())) {
                    Name2.getItems().clear();
                    Name2.getItems().addAll("Ace", "Amaru", "Ash", "Blackbeard","Blitz", "Brava", "Buck", "Capitão", "Dokkaebi", "Finka", "Flores", "Fuze", "Glaz",
                            "Gridlock", "Grim", "Hibana", "Iana", "IQ", "Jackal", "Kali", "Lion", "Maverick", "Montagne", "Nomad", "Nøkk", "Osa", "Ram", "Recruit", "Sens",
                            "Sledge", "Thatcher", "Thermite", "Twitch", "Ying", "Zero", "Zofia");

                    Name3.getItems().clear();
                    Name3.getItems().addAll("Sniper Eye", "Cluster Charge", "Electronics Scan", "Flash Shield","Shock Drone", "Extendable Shield", "Hardbreach Charge", "M120 Crem", "Emp Grenades", "Hammer", "Side Shotgun", "Gun Shield", "Crossbow",
                            "Hardbreach Charges", "Footprint Scanner", "Cluster Flashbangs", "  Side Grenadelauncher", "Logic Bomb", "Healing Charge", "Orbital Scan", "Breaching Tool", "Repulsion Grenades", "Spike Mats", "Camera Invisibility", "Instant Rappel", "Demolition shots", "Clone Drone", "Spy Camera", "Bomb Drones",
                            "Thorn", "Thunderbird", "Tubarão", "Valkyrie", "Vigil", "Wamai", "Warden");



                } else if ("Defender".equals(Name.getValue())) {
                    Name2.getItems().clear();
                    Name2.getItems().addAll("Alibi", "Aruni", "Azami", "Bandit","Castle", "Caviera", "Clash", "Doc", "Echo", "Ela", "Fenrir", "Frost", "Goyo",
                            "Jäger", "Kaid", "Kapkan", "Lesion", "Maestro", "Melusi", "Mira", "Mozzie", "Mute", "Oryx", "Pulse", "Recruit", "Rook", "Smoke", "Solis", "Tachanka",
                            "Clear Shield", "Smoke Wall", "Scan Pest", "Hacking Drone", "Demolition Drone");

                    Name3.getItems().clear();
                    Name3.getItems().addAll("Signal Jammers", "Toxic Gas", "Cardiac Sensor", "Bulletproof Barricades","Stim pistol", "Ceramic Plates", "Shockwire Batteries", "ADS Devices", "Explosive Traps", "Fire Grenades", "Welcome Mat", "Sticky Cameras", "Special Pistol",
                            "Yokai Drones", "Bulletproof Windows", "Poison Mines", "Concussion Mines", "Cloaking Device", "Evil Eye", "Holograms", "Shock Shield", "Electroclaw", "Pest Robots", "Smart Glasses", "Fire Cannisters", "Wall Dash", "Laser Barrier", "Healing Station", "Spike Trap",
                            "Kabi Barrier", "Smoke Screen", "Mag-Net", "Banshee", "Spec-IO", "Zoto Cannister");


                }
            });



        // Aanmaken van TextFields voor kills gegevens
        TextField Name5 = new TextField();
        //id geven aan de textfield
        Name5.setId("box5");
        //een width en een height geven aan de textfield
        Name5.setPrefSize(175, 35);
        //info text geven aan de textfield
        Name5.setPromptText("Kills");

        //een textformatter aanmaken zodat er geen letters kunnen worden ingevuld
        TextFormatter<Integer> textFormatter = new TextFormatter<>(new IntegerStringConverter(), null, c ->
                (c.getControlNewText().matches("\\d*") ? c : null));

        // Voeg de TextFormatter toe aan de TextField
        Name5.setTextFormatter(textFormatter);

        TextField Name6 = new TextField();
        Name6.setId("box6");
        Name6.setPrefSize(175, 35);
        Name6.setPromptText("Deaths");
        //een textformatter aanmaken zodat er geen letters kunnen worden ingevuld
        TextFormatter<Integer> textFormatter2 = new TextFormatter<>(new IntegerStringConverter(), null, c ->
                (c.getControlNewText().matches("\\d*") ? c : null));

        // Voeg de TextFormatter toe aan de TextField
        Name6.setTextFormatter(textFormatter2);

        TextField Name7 = new TextField();
        Name7.setId("box7");
        Name7.setPrefSize(175, 35);
        Name7.setPromptText("Wins");

        //een textformatter aanmaken zodat er geen letters kunnen worden ingevuld
        TextFormatter<Integer> textFormatter3 = new TextFormatter<>(new IntegerStringConverter(), null, c ->
                (c.getControlNewText().matches("\\d*") ? c : null));
        // Voeg de TextFormatter toe aan de TextField
        Name7.setTextFormatter(textFormatter3);

        TextField Name8 = new TextField();
        Name8.setId("box8");
        Name8.setPrefSize(175, 35);
        Name8.setPromptText("Losses");
        //een textformatter aanmaken zodat er geen letters kunnen worden ingevuld
        TextFormatter<Integer> textFormatter4 = new TextFormatter<>(new IntegerStringConverter(), null, c ->
                (c.getControlNewText().matches("\\d*") ? c : null));
        // Voeg de TextFormatter toe aan de TextField
        Name8.setTextFormatter(textFormatter4);

        //button aanmaken voor weapon page
        Button Name9 = new Button("Best Weapon");
        //id geven aan button
        Name9.setId("box9");
        //een width en een height geven aan de button
        Name9.setPrefSize(175, 35);

        //setonaction geven aan de button om door te gaan naar andere pagina
        Name9.setOnAction(e->{
            //doorverwijzing andere pagina
            Weapon weapon = new Weapon();
        });
````
Als je voor Statistieken Bekijken kiest kom je op een pagina waar je 4 tabellen ziet in deze tabellen zie je de door jou ingevoerde statistieken staan die aan elkaar gelinked zijn door verschillende ids waardoor je precies weet welke statistieken bij elkaar horen.

Je kan ook je statistieken aanpassen en verwijderen als je in een van de 4 tabellen op een regel klikt waarin je gegevens wilt aanpassen dan krijg je een scherm te zien met invoer velden hier vul je je nieuwe gegevens in en klikt op wijzig, je wordt daarna terug geleid naar de Statistieken Bekijken pagina je krijgt niet gelijk je statistieken te zien je zult eerst op refresh moeten drukken voor ze worden geladen.

En als je op delete drukt worden alle opgeslagen gegevens verwijdert zodat je nieuwe kunt invoeren. Hieronder volgt een voorbeeld van de tabellen en butoon codes.
````
  //---------------------------------------------------------------------Speler table view--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        TableView<Speler> tv1 = new TableView<>();
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

        // setonmouseclicked om gegevens te wijzigen
        tv1.setOnMouseClicked(e -> {
            Speler s = tv1.getSelectionModel().getSelectedItem();
            modifyView mod = new modifyView(s);
        });

        //---------------------------------------------------------------------Opperator table view--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        TableView<Opperator> tv2 = new TableView<>();
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

        // setonmouseclicked om gegevens te wijzigen
        tv2.setOnMouseClicked(e -> {
            Opperator o = tv2.getSelectionModel().getSelectedItem();
            modifyView2 mod2 = new modifyView2(o);
        });

        //---------------------------------------------------------------------MatchResult table view--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        TableView<MatchResult> tv3 = new TableView<>();
        tv3.setPrefWidth(425);
        tv3.setPrefHeight(225);

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

        tv3.getColumns().addAll(col13, col14, col15, col16, col17);
        tv3.getItems().addAll(db.geefMatchResult());

        // setonmouseclicked om gegevens te wijzigen
        tv3.setOnMouseClicked(e -> {
            MatchResult mr = tv3.getSelectionModel().getSelectedItem();
            modifyView3 mod3 = new modifyView3(mr);
        });

        //---------------------------------------------------------------------Weapon table view--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

        TableView<WeaponResult> tv4 = new TableView<>();
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

        // setonmouseclicked om gegevens te wijzigen
        tv4.setOnMouseClicked(e -> {
            WeaponResult wr = tv4.getSelectionModel().getSelectedItem();
            modifyView4 mod4 = new modifyView4(wr);
        });

        //Button aanmaken voor het refreshen van de pagina
        Button btnRefresh = new Button("Refresh");
        //een setonaction geven aan de refresh button en hier de tablecolumns ingeven
        btnRefresh.setOnAction(e -> {
            tv1.getItems().setAll(db.geefSpeler());
            tv2.getItems().setAll(db.geefOpperator());
            tv3.getItems().setAll(db.geefMatchResult());
            tv4.getItems().setAll(db.geefWeaponResult());
        });

        //Button aanmaken voor het deleten van de gegevens in de database
        Button btnDelete = new Button("Delete");
        //een setonaction geven aan de delete button en hier de verwijder objecten en tablecolumns ingeven
        btnDelete.setOnAction(e -> {
            db.verwijderSpeler();
            db.verwijderOpperator();
            db.verwijderMatchResult();
            db.verwijderWeapon();

            tv1.getItems().setAll(db.geefSpeler());
            tv2.getItems().setAll(db.geefOpperator());
            tv3.getItems().setAll(db.geefMatchResult());
            tv4.getItems().setAll(db.geefWeaponResult());
        });
````

## Roadmap
De huidige roadmap is als volgt, de applicatie wordt inplaats van een persoonlijke invoer systeem een online invoer systeem. Er komt een Leaderboard pagina waar de gebruikers met de beste statistieken op komen te staan en een search pagina zodat je andere spelers kunt opzoeken en hun statistieken kunt bekijken.
## Samenwerking
Als je wilt meewerken aan dit project, kun je een pull-verzoek sturen. Alle hulp bij het verbeteren van deze applicatie wordt zeer op prijs gesteld. Als je tegen problemen aanloopt, kun je dit laten weten op de Discord-server die je kunt bereiken via de volgende link: https://discord.gg/H7YfcAus.
## Java Versie
De java versie die is gebruikt is openJDK 21.0.2 deze is benodigd om de applicatie te runnen.

## Licentie

Deze applicatie is beschikbaar onder de MIT-licentie. Dit betekent dat iedereen mag kopiëren, distribueren, veranderen en openen voor elke doel die niet bedoeld is om de applicatie commercieel te gebruiken of te verkopen.

Dit is de volledige licentieovereenkomst:

Copyright (c) 2024 R6Tracker

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.