package com.example.r6tracker.classes;

import java.util.ArrayList;

public class WeaponResultController {

    private ArrayList<WeaponResult>wr;

    private WeaponResult weaponr;

    public WeaponResultController(){wr = new ArrayList<>();}

    public void addWeaponResult(String name, String damage, String capacity, String firerate, String mobility){
        weaponr = new WeaponResult(name, damage, capacity, firerate, mobility);
        wr.add(weaponr);

    }

}
