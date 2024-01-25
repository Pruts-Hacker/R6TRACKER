package com.example.r6tracker.classes;

import java.util.ArrayList;

public class MatchResultController {
    // Lijst om MatchResult-objecten op te slaan
    private ArrayList<MatchResult> mr;

    // Huidig MatchResult-object
    private MatchResult matchr;

    // Constructor voor MatchResultController, initialiseert de ArrayList
    public MatchResultController() {
        mr = new ArrayList<>();
    }

    // Methode om een nieuw MatchResult-object toe te voegen aan de lijst
    public void addMatchResult(int i, int kills, int deaths, int wins, int losses, int geefMatchSpelerId) {
        // Aanmaken van een nieuw MatchResult-object en toevoegen aan de lijst
        matchr = new MatchResult(i, kills, deaths, wins, losses, geefMatchSpelerId);
        mr.add(matchr);
    }
}