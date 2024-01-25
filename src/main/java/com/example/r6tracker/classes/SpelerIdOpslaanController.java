package com.example.r6tracker.classes;

import java.util.ArrayList;

public class SpelerIdOpslaanController {

    // Lijst om SpelerIdOpslaan-objecten op te slaan
    private ArrayList<SpelerIdOpslaan> spelerid;

    // Huidig SpelerIdOpslaan-object
    private SpelerIdOpslaan sio;

    // Constructor voor SpelerIdOpslaanController, initialiseert de ArrayList
    public SpelerIdOpslaanController() {
        spelerid = new ArrayList<>();
    }

    // Methode om een nieuw SpelerIdOpslaan-object toe te voegen aan de lijst
    public void addId(int i) {
        // Aanmaken van een nieuw SpelerIdOpslaan-object en toevoegen aan de lijst
        sio = new SpelerIdOpslaan(i);
        spelerid.add(sio);
    }
}
