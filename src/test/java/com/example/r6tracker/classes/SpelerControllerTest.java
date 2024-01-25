package com.example.r6tracker.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpelerControllerTest {

    @Test
        //UnitTest test of de methode de gegeven data opslaat
    void addSpeler() {
        SpelerController sc = new SpelerController();
         sc.addSpeler(0, "goud 5", "Gert-Jan", "smonk", 55);

    }
}