package com.example.r6tracker.classes;

import java.util.ArrayList;

public class OpperatorController {
    private ArrayList<Opperator>opp;

    private Opperator opperator;

    public OpperatorController(){opp = new ArrayList<>();}

    public void addOpperator(String naam, String type, String ability, int movespeed){
        opperator = new Opperator(naam, type, ability, movespeed);
        opp.add(opperator);
    }
}
