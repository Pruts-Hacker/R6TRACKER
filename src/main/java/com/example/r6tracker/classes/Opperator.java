package com.example.r6tracker.classes;

public class Opperator {
private String type;
private String naam;
private String ability;
private int movespeed;
private int oppsid;
private int id;

    public int getOppsid() {
        return oppsid;
    }

    public void setOppsid(int oppsid) {
        this.oppsid = oppsid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public int getMovespeed() {
        return movespeed;
    }

    public void setMovespeed(int movespeed) {
        this.movespeed = movespeed;
    }

    public Opperator(int id, String type, String naam, String ability, int movespeed, int oppsid) {
        this.oppsid = oppsid;
        this.id = id;
        this.type = type;
        this.naam = naam;
        this.ability = ability;
        this.movespeed = movespeed;
    }


}
