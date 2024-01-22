package com.example.r6tracker.classes;

public class MatchResult {
    private int kills;
    private int deaths;
    private int wins;
    private int losses;
    private int id;
    private int msid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMsid() {
        return msid;
    }

    public void setMsid(int msid) {
        this.msid = msid;
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public int getDeaths() {
        return deaths;
    }

    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public MatchResult(int id, int kills, int deaths, int wins, int losses, int msid) {
        this.id = id;
        this.msid = msid;
        this.kills = kills;
        this.deaths = deaths;
        this.wins = wins;
        this.losses = losses;
    }
}
