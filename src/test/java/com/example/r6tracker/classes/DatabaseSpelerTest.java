package com.example.r6tracker.classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseSpelerTest {

    @Test
    void geefMaxPlayerID() {
    DatabaseSpeler dbs = new DatabaseSpeler();
    int iUitkomst = dbs.geefMaxPlayerID();
    assertEquals(171, iUitkomst);
    }
}

