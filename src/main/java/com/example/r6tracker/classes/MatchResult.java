package com.example.r6tracker.classes;

public class MatchResult {
    // Attributen om gegevens over een matchresultaat op te slaan
    private int kills;     // Aantal kills behaald in de match
    private int deaths;    // Aantal deaths in de match
    private int wins;      // Aantal gewonnen matches
    private int losses;    // Aantal verloren matches
    private int id;        // Unieke identificatie van het matchresultaat
    private int msid;      // ID van de speler waartoe het matchresultaat behoort

    // Getter-methode voor het ophalen van de ID van het matchresultaat
    public int getId() {
        return id;
    }

    // Setter-methode voor het instellen van de ID van het matchresultaat
    public void setId(int id) {
        this.id = id;
    }

    // Getter-methode voor het ophalen van de speler-ID waartoe het matchresultaat behoort
    public int getMsid() {
        return msid;
    }

    // Setter-methode voor het instellen van de speler-ID waartoe het matchresultaat behoort
    public void setMsid(int msid) {
        this.msid = msid;
    }

    // Getter-methode voor het ophalen van het aantal kills
    public int getKills() {
        return kills;
    }

    // Setter-methode voor het instellen van het aantal kills
    public void setKills(int kills) {
        this.kills = kills;
    }

    // Getter-methode voor het ophalen van het aantal deaths
    public int getDeaths() {
        return deaths;
    }

    // Setter-methode voor het instellen van het aantal deaths
    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    // Getter-methode voor het ophalen van het aantal gewonnen matches
    public int getWins() {
        return wins;
    }

    // Setter-methode voor het instellen van het aantal gewonnen matches
    public void setWins(int wins) {
        this.wins = wins;
    }

    // Getter-methode voor het ophalen van het aantal verloren matches
    public int getLosses() {
        return losses;
    }

    // Setter-methode voor het instellen van het aantal verloren matches
    public void setLosses(int losses) {
        this.losses = losses;
    }

    // Constructor voor het initialiseren van een MatchResult-object met opgegeven waarden
    public MatchResult(int id, int kills, int deaths, int wins, int losses, int msid) {
        this.id = id;
        this.msid = msid;
        this.kills = kills;
        this.deaths = deaths;
        this.wins = wins;
        this.losses = losses;
    }
}