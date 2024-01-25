package com.example.r6tracker.classes;

public class OpperatorIdOpslaan {
    // Attribuut om de operator-ID op te slaan
    private int id;

    // Constructor voor het initialiseren van een OpperatorIdOpslaan-object met een gegeven operator-ID
    public OpperatorIdOpslaan(int id) {
        this.id = id;
    }

    // Getter-methode voor het ophalen van de operator-ID
    public int getId() {
        return id;
    }

    // Setter-methode voor het instellen van de operator-ID
    public void setId(int id) {
        this.id = id;
    }
}