package com.example.r6tracker.classes;

public class WeaponResult {
    // Attributen voor het opslaan van gegevens over een wapenresultaat
    private String naam;       // Naam van het wapen
    private int damage;        // Schade van het wapen
    private int capacity;      // Capaciteit van het wapen
    private int firerate;      // Vuursnelheid van het wapen
    private int mobility;      // Mobiliteit van het wapen
    private int id;            // Unieke identificatie van het wapenresultaat
    private int oppid;         // ID van de operator waartoe het wapen behoort

    // Getter-methode voor het ophalen van de ID van het wapenresultaat
    public int getId() {
        return id;
    }

    // Setter-methode voor het instellen van de ID van het wapenresultaat
    public void setId(int id) {
        this.id = id;
    }

    // Getter-methode voor het ophalen van de operator ID waartoe het wapen behoort
    public int getOppid() {
        return oppid;
    }

    // Setter-methode voor het instellen van de operator ID waartoe het wapen behoort
    public void setOppid(int oppid) {
        this.oppid = oppid;
    }

    // Getter-methode voor het ophalen van de naam van het wapen
    public String getNaam() {
        return naam;
    }

    // Setter-methode voor het instellen van de naam van het wapen
    public void setNaam(String naam) {
        this.naam = naam;
    }

    // Getter-methode voor het ophalen van de schade van het wapen
    public int getDamage() {
        return damage;
    }

    // Setter-methode voor het instellen van de schade van het wapen
    public void setDamage(int damage) {
        this.damage = damage;
    }

    // Getter-methode voor het ophalen van de capaciteit van het wapen
    public int getCapacity() {
        return capacity;
    }

    // Setter-methode voor het instellen van de capaciteit van het wapen
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    // Getter-methode voor het ophalen van de vuursnelheid van het wapen
    public int getFirerate() {
        return firerate;
    }

    // Setter-methode voor het instellen van de vuursnelheid van het wapen
    public void setFirerate(int firerate) {
        this.firerate = firerate;
    }

    // Getter-methode voor het ophalen van de mobiliteit van het wapen
    public int getMobility() {
        return mobility;
    }

    // Setter-methode voor het instellen van de mobiliteit van het wapen
    public void setMobility(int mobility) {
        this.mobility = mobility;
    }

    // Constructor voor het initialiseren van een WeaponResult-object met opgegeven waarden
    public WeaponResult(int id, String naam, int damage, int capacity, int firerate, int mobility, int oppid) {
        this.id = id;
        this.naam = naam;
        this.damage = damage;
        this.capacity = capacity;
        this.firerate = firerate;
        this.mobility = mobility;
        this.oppid = oppid;
    }
}
