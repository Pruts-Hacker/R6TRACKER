package com.example.r6tracker.classes;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MatchResultController {
    private ArrayList<MatchResult> mr;

    private MatchResult matchr;

    public MatchResultController(){mr = new ArrayList<>();}

    public void addMatchResult(String kills, String deaths, String wins, String losses){
        matchr = new MatchResult(kills, deaths, wins, losses);
        mr.add(matchr);

    }
}
