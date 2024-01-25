package com.example.r6tracker.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatchResultControllerTest {

    @Test
    //UnitTest test of de methode de gegeven data opslaat
    void addMatchResult() {
    MatchResultController mc =new MatchResultController();
    mc.addMatchResult(0, 1, 1, 1, 1, 0);
    }
}