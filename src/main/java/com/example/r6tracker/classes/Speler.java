package com.example.r6tracker.classes;

public class Speler {
    private String naam;
    private String gamertag;
    private int level;
    private String rank;
    private int id;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public Speler(int id, String rank, String naam, String gamertag, int level) {
        this.id = id;
        this.rank = rank;
        this.naam = naam;
        this.gamertag = gamertag;
        this.level = level;




    }
}
