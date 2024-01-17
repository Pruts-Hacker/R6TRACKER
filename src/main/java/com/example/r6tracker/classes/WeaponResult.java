package com.example.r6tracker.classes;

public class WeaponResult {
    private String naam;
    private int damage;
    private int capacity;
    private int firerate;
    private int mobility;

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getFirerate() {
        return firerate;
    }

    public void setFirerate(int firerate) {
        this.firerate = firerate;
    }

    public int getMobility() {
        return mobility;
    }

    public void setMobility(int mobility) {
        this.mobility = mobility;
    }

    public WeaponResult(String naam, int damage, int capacity, int firerate, int mobility) {
        this.naam = naam;
        this.damage = damage;
        this.capacity = capacity;
        this.firerate = firerate;
        this.mobility = mobility;
    }
}
