package com.example.r6tracker.classes;

public class MatchResult {
    private String kills;
    private String deaths;
    private String wins;
    private String losses;

    public String getKills() {
        return kills;
    }

    public void setKills(String kills) {
        this.kills = kills;
    }

    public String getDeaths() {
        return deaths;
    }

    public void setDeaths(String deaths) {
        this.deaths = deaths;
    }

    public String getWins() {
        return wins;
    }

    public void setWins(String wins) {
        this.wins = wins;
    }

    public String getLosses() {
        return losses;
    }

    public void setLosses(String losses) {
        this.losses = losses;
    }

    public MatchResult(String kills, String deaths, String wins, String losses) {
        this.kills = kills;
        this.deaths = deaths;
        this.wins = wins;
        this.losses = losses;
    }
}
