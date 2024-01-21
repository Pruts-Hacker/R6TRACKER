package com.example.r6tracker.classes;

import java.util.ArrayList;

public class SpelerController {

    private ArrayList<Speler> spelers;
    private Speler speler;
    public SpelerController() {spelers = new ArrayList<>();
    }

    public void addSpeler(int i, String ranking, String name, String gamertag, int level){
    speler = new Speler(i, ranking, name, gamertag, level);
    spelers.add(speler);

    }



}
