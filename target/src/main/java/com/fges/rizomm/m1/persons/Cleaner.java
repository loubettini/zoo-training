package com.fges.rizomm.m1.persons;

import com.fges.rizomm.m1.local.Locals;

public class Cleaner extends Employee {

    public void clean(Locals local) {
        if (!local.getOccupied()) {
            local.setClean(true);
        }
    }


}
