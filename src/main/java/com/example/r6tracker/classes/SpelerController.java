package com.example.r6tracker.classes;

import java.util.ArrayList;

public class SpelerController {

    private ArrayList<Speler> spelers;
    private Speler speler;
    public SpelerController() {spelers = new ArrayList<>();
    }

    public void addSpeler(String ranking, String name, String gamertag, int level){
    speler = new Speler(ranking, name, gamertag, level);
    spelers.add(speler);

    }
}
