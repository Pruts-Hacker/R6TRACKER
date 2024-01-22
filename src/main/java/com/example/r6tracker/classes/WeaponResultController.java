package com.example.r6tracker.classes;

import java.util.ArrayList;

public class WeaponResultController {

    private ArrayList<WeaponResult>wr;

    private WeaponResult weaponr;

    public WeaponResultController(){wr = new ArrayList<>();}

    public void addWeaponResult(int i, String name, int damage, int capacity, int firerate, int mobility, int geefWeaponOpperatorId){
        weaponr = new WeaponResult(i, name, damage, capacity, firerate, mobility, geefWeaponOpperatorId);
        wr.add(weaponr);

    }

}
