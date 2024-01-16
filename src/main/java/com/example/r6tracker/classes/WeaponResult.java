package com.example.r6tracker.classes;

public class WeaponResult {
    private String naam;
    private String damage;
    private String capacity;
    private String firerate;
    private String mobility;

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getFirerate() {
        return firerate;
    }

    public void setFirerate(String firerate) {
        this.firerate = firerate;
    }

    public String getMobility() {
        return mobility;
    }

    public void setMobility(String mobility) {
        this.mobility = mobility;
    }

    public WeaponResult(String naam, String damage, String capacity, String firerate, String mobility) {
        this.naam = naam;
        this.damage = damage;
        this.capacity = capacity;
        this.firerate = firerate;
        this.mobility = mobility;
    }
}
