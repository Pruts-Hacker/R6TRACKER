package com.example.r6tracker.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {

    @Test
    void geefMaxPlayerID() {
        Database db = new Database();
       int iUitkomst = db.geefMaxPlayerID();
       assertEquals(157, iUitkomst);
    }
}