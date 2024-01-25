package com.example.r6tracker.classes;

import java.util.ArrayList;

public class OpperatorIdOpslaanController {

    // Lijst om OpperatorIdOpslaan-objecten op te slaan
    private ArrayList<OpperatorIdOpslaan> opperatorid;

    // Huidig OpperatorIdOpslaan-object
    private OpperatorIdOpslaan oio;

    // Constructor voor OpperatorIdOpslaanController, initialiseert de ArrayList
    public OpperatorIdOpslaanController() {
        opperatorid = new ArrayList<>();
    }

    // Methode om een nieuw OpperatorIdOpslaan-object toe te voegen aan de lijst
    public void addId(int i) {
        // Aanmaken van een nieuw OpperatorIdOpslaan-object en toevoegen aan de lijst
        oio = new OpperatorIdOpslaan(i);
        opperatorid.add(oio);
    }
}
