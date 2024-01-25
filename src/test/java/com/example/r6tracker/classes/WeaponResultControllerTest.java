package com.example.r6tracker.classes;

import com.example.r6tracker.Screens.Weapon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeaponResultControllerTest {

    @Test
        //UnitTest test of de methode de gegeven data opslaat
    void addWeaponResult() {
        WeaponResultController wrc = new WeaponResultController();
        wrc.addWeaponResult(0, "john", 1, 1, 1,1 , 1);
    }
}