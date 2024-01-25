package com.example.r6tracker.classes;

import java.util.ArrayList;

public class WeaponResultController {

    // Lijst om WeaponResult-objecten op te slaan
    private ArrayList<WeaponResult> wr;

    // Huidig WeaponResult-object
    private WeaponResult weaponr;

    // Constructor voor WeaponResultController, initialiseert de ArrayList
    public WeaponResultController() {
        wr = new ArrayList<>();
    }

    // Methode om een nieuw WeaponResult-object toe te voegen aan de lijst
    public void addWeaponResult(int i, String name, int damage, int capacity, int firerate, int mobility, int geefWeaponOpperatorId) {
        // Aanmaken van een nieuw WeaponResult-object en toevoegen aan de lijst
        weaponr = new WeaponResult(i, name, damage, capacity, firerate, mobility, geefWeaponOpperatorId);
        wr.add(weaponr);
    }
}
