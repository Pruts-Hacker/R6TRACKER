package com.example.r6tracker.classes;

import java.util.ArrayList;

public class SpelerIdOpslaanController {

    private ArrayList<SpelerIdOpslaan> spelerid;

    private SpelerIdOpslaan sio;

    public SpelerIdOpslaanController(){spelerid = new ArrayList<>();}

    public void addId(int i){
        sio = new SpelerIdOpslaan(i);
        spelerid.add(sio);
    }
}
