package com.example.r6tracker.classes;

import java.util.ArrayList;

public class SpelerIdOpslaan {
    // Attribuut om de speler-ID op te slaan
    private int id;

    // Getter-methode om de speler-ID op te halen
    public int getId() {
        return id;
    }

    // Setter-methode om de speler-ID in te stellen
    public void setId(int id) {
        this.id = id;
    }

    // Constructor voor het initialiseren van een SpelerIdOpslaan-object met een gegeven speler-ID
    public SpelerIdOpslaan(int id) {
        this.id = id;
    }
}