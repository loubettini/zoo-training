package com.fges.rizomm.m1.animals;

import org.junit.Test;

import static org.junit.Assert.*;

public class OctopusTest {

    @Test
    public void when_animal_scream_then_string() {
        Animal octopus = new Octopus();

        assertTrue(octopus.scream().matches(".*"));
        assertTrue(octopus.scream().equals("bloublou"));
        assertTrue(!octopus.scream().isEmpty());


    }


    @Test
    public void name() {
        Animal octopus = new Octopus();
        octopus.setName("jack");
        assertEquals("jack", octopus.getName());

    }

    @Test
    public void crawl(){
        Animal octopus = new Octopus();

        assertEquals("swim", ((Octopus) octopus).crawl());

    }
    @Test
    public void eat() {
        Animal octopus = new Octopus();
        octopus.eat("steak");
        assertTrue(octopus.getEatCount() == 1);

    }
    @Test
    public void setfamily(){
        Animal octopus = new Octopus();
        octopus.setFamily(Family.Aquatic);
        assertSame(Family.Aquatic,octopus.getFamily());
    }
}