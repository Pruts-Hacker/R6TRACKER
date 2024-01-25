package com.example.r6tracker.classes;

import java.util.ArrayList;

public class SpelerController {

    // Lijst om Speler-objecten op te slaan
    private ArrayList<Speler> spelers;

    // Huidig Speler-object
    private Speler speler;

    // Constructor voor SpelerController, initialiseert de ArrayList
    public SpelerController() {
        spelers = new ArrayList<>();
    }

    // Methode om een nieuw Speler-object toe te voegen aan de lijst
    public void addSpeler(int i, String ranking, String name, String gamertag, int level) {
        // Aanmaken van een nieuw Speler-object en toevoegen aan de lijst
        speler = new Speler(i, ranking, name, gamertag, level);
        spelers.add(speler);
    }
}
