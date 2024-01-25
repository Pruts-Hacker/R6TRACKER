package com.example.r6tracker.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OpperatorControllerTest {

    @Test
        //UnitTest test of de methode de gegeven data opslaat
    void addOpperator() {
        OpperatorController oc = new OpperatorController();
        oc.addOpperator(0, "Ace", "Attacker", "Hardbreach Charge", 1, 0);

    }
}