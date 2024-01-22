package com.example.r6tracker.classes;

import java.util.ArrayList;

public class MatchResultController {
    private ArrayList<MatchResult> mr;

    private MatchResult matchr;

    public MatchResultController(){mr = new ArrayList<>();}

    public void addMatchResult(int i, int kills, int deaths, int wins, int losses, int geefMatchSpelerId){
        matchr = new MatchResult(i, kills, deaths, wins, losses, geefMatchSpelerId);
        mr.add(matchr);

    }
}
