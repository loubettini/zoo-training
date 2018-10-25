package com.fges.rizomm.m1.persons;

import com.fges.rizomm.m1.local.Cage;
import com.fges.rizomm.m1.local.Locals;
import org.junit.Test;

import static org.junit.Assert.*;

public class CleanerTest {

    @Test
    public void clean() {
        Locals locals = new Cage();
        Cleaner cleaner = new Cleaner();
        locals.setOccupied(false);
        locals.setClean(false);
        cleaner.clean(locals);
        assertEquals(true, locals.getClean());

    }

}