package com.example.r6tracker.classes;

public class Speler {
    private String naam;
    private String gamertag;
    private int level;
    private String rank;




    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getGamertag() {
        return gamertag;
    }

    public void setGamertag(String gamertag) {
        this.gamertag = gamertag;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Speler(String rank, String naam, String gamertag, int level) {
        this.naam = naam;
        this.gamertag = gamertag;
        this.level = level;
        this.rank = rank;



    }
}
