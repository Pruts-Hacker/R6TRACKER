package com.example.r6tracker.classes;

public class Speler {
    // Attributen om spelergegevens op te slaan
    private String naam;       // Naam van de speler
    private String gamertag;   // Gamertag van de speler
    private int level;         // Level van de speler
    private String rank;       // Rank van de speler
    private int id;            // Unieke identificatie van de speler

    // Getter-methode voor het ophalen van de ID van de speler
    public int getId() {
        return id;
    }

    // Setter-methode voor het instellen van de ID van de speler
    public void setId(int id) {
        this.id = id;
    }

    // Getter-methode voor het ophalen van de naam van de speler
    public String getNaam() {
        return naam;
    }

    // Setter-methode voor het instellen van de naam van de speler
    public void setNaam(String naam) {
        this.naam = naam;
    }

    // Getter-methode voor het ophalen van de gamertag van de speler
    public String getGamertag() {
        return gamertag;
    }

    // Setter-methode voor het instellen van de gamertag van de speler
    public void setGamertag(String gamertag) {
        this.gamertag = gamertag;
    }

    // Getter-methode voor het ophalen van het level van de speler
    public int getLevel() {
        return level;
    }

    // Setter-methode voor het instellen van het level van de speler
    public void setLevel(int level) {
        this.level = level;
    }

    // Getter-methode voor het ophalen van de rank van de speler
    public String getRank() {
        return rank;
    }

    // Setter-methode voor het instellen van de rank van de speler
    public void setRank(String rank) {
        this.rank = rank;
    }

    // Constructor voor het initialiseren van een Speler-object met opgegeven waarden
    public Speler(int id, String rank, String naam, String gamertag, int level) {
        this.id = id;
        this.rank = rank;
        this.naam = naam;
        this.gamertag = gamertag;
        this.level = level;
    }
}