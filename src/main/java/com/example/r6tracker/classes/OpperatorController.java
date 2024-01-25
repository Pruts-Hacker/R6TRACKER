package com.example.r6tracker.classes;

import java.util.ArrayList;

public class OpperatorController {
    // Lijst om Opperator-objecten op te slaan
    private ArrayList<Opperator> opp;

    // Huidig Opperator-object
    private Opperator opperator;

    // Constructor voor OpperatorController, initialiseert de ArrayList
    public OpperatorController() {
        opp = new ArrayList<>();
    }

    // Methode om een nieuw Opperator-object toe te voegen aan de lijst
    public void addOpperator(int i, String naam, String type, String ability, int movespeed, int geefOppSpelerId) {
        // Aanmaken van een nieuw Opperator-object en toevoegen aan de lijst
        opperator = new Opperator(i, naam, type, ability, movespeed, geefOppSpelerId);
        opp.add(opperator);
    }
}