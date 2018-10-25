package com.fges.rizomm.m1.animals;

import org.junit.Test;

import static org.junit.Assert.*;

public class TigerTest {

    @Test
    public void when_animal_scream_then_string() {
        Animal tiger = new Tiger();

        assertTrue(tiger.scream().matches(".*"));
        assertTrue(tiger.scream().equals("ROOAARR"));
        assertTrue(!tiger.scream().isEmpty());


    }
    @Test
    public void eat() {
        Animal tiger = new Tiger();
        tiger.eat("steak");
        assertTrue(tiger.getEatCount() == 1);

    }
    @Test
    public void setfamily(){
        Animal tiger = new Tiger();
        tiger.setFamily(Family.Mamifere);
        assertSame(Family.Mamifere,tiger.getFamily());
    }
}