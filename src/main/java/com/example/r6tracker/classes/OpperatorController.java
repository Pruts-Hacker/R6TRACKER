package com.example.r6tracker.classes;

import java.util.ArrayList;

public class OpperatorController {
    private ArrayList<Opperator>opp;

    private Opperator opperator;

    public OpperatorController(){opp = new ArrayList<>();}

    public void addOpperator(int i, String naam, String type, String ability, int movespeed, int geefOppSpelerId){
        opperator = new Opperator(i, naam, type, ability, movespeed, geefOppSpelerId);
        opp.add(opperator);
    }
}
