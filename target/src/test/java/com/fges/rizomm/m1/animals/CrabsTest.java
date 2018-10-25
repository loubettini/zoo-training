package com.fges.rizomm.m1.animals;

import org.junit.Test;

import static org.junit.Assert.*;

public class CrabsTest {

    @Test
    public void when_animal_scream_then_string() {
        Animal crab = new Crabs();

        assertTrue(crab.scream().matches(".*"));
        assertEquals("", crab.scream());


    }

    @Test
    public void name() {
        Animal crab = new Crabs();
        crab.setName("jacob");
        assertEquals("jacob", crab.getName());

    }

    @Test
    public void crawl(){
        Animal crab = new Crabs();

        assertEquals("move", ((Crabs) crab).crawl());

    }
    @Test
    public void eat() {
        Animal crab = new Crabs();
        crab.eat("steak");
        assertTrue(crab.getEatCount() == 1);

    }
    @Test
    public void setfamily(){
        Animal crab = new Crabs();
        crab.setFamily(Family.Aquatic);
        assertSame(Family.Aquatic,crab.getFamily());
    }
}