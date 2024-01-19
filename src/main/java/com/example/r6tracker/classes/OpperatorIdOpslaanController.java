package com.example.r6tracker.classes;

import java.util.ArrayList;

public class OpperatorIdOpslaanController {

    private ArrayList<OpperatorIdOpslaan>opperatorid;

    private OpperatorIdOpslaan oio;


    public OpperatorIdOpslaanController(){opperatorid = new ArrayList<>();}


    public void addId(int i){
        oio = new OpperatorIdOpslaan(i);
        opperatorid.add(oio);
    }
}
