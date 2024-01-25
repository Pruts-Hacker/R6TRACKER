package com.example.r6tracker.classes;

public class Opperator {
    // Attributen om gegevens over een operator op te slaan
    private String type;       // Type van de operator
    private String naam;       // Naam van de operator
    private String ability;    // Speciale vaardigheid van de operator
    private int movespeed;     // Bewegingssnelheid van de operator
    private int oppsid;        // ID van de speler waartoe de operator behoort
    private int id;            // Unieke identificatie van de operator

    // Getter-methode voor het ophalen van de speler-ID waartoe de operator behoort
    public int getOppsid() {
        return oppsid;
    }

    // Setter-methode voor het instellen van de speler-ID waartoe de operator behoort
    public void setOppsid(int oppsid) {
        this.oppsid = oppsid;
    }

    // Getter-methode voor het ophalen van de ID van de operator
    public int getId() {
        return id;
    }

    // Setter-methode voor het instellen van de ID van de operator
    public void setId(int id) {
        this.id = id;
    }

    // Getter-methode voor het ophalen van het type van de operator
    public String getType() {
        return type;
    }

    // Setter-methode voor het instellen van het type van de operator
    public void setType(String type) {
        this.type = type;
    }

    // Getter-methode voor het ophalen van de naam van de operator
    public String getNaam() {
        return naam;
    }

    // Setter-methode voor het instellen van de naam van de operator
    public void setNaam(String naam) {
        this.naam = naam;
    }

    // Getter-methode voor het ophalen van de speciale vaardigheid van de operator
    public String getAbility() {
        return ability;
    }

    // Setter-methode voor het instellen van de speciale vaardigheid van de operator
    public void setAbility(String ability) {
        this.ability = ability;
    }

    // Getter-methode voor het ophalen van de bewegingssnelheid van de operator
    public int getMovespeed() {
        return movespeed;
    }

    // Setter-methode voor het instellen van de bewegingssnelheid van de operator
    public void setMovespeed(int movespeed) {
        this.movespeed = movespeed;
    }

    // Constructor voor het initialiseren van een Opperator-object met opgegeven waarden
    public Opperator(int id, String type, String naam, String ability, int movespeed, int oppsid) {
        this.oppsid = oppsid;
        this.id = id;
        this.type = type;
        this.naam = naam;
        this.ability = ability;
        this.movespeed = movespeed;
    }
}