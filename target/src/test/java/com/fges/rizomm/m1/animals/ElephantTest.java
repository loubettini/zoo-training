package com.fges.rizomm.m1.animals;

import org.junit.Test;

import static org.junit.Assert.*;

public class ElephantTest {

    @Test
    public void when_animal_scream_then_string() {
        Animal elephant = new Elephant();

        assertTrue(elephant.scream().matches(".*"));
        assertTrue(elephant.scream().equals("braaammmm"));
        assertTrue(!elephant.scream().isEmpty());


    }

    @Test
    public void eat() {
        Animal elephant = new Elephant();
        elephant.eat("weed");
        assertTrue(elephant.getEatCount() == 1);

    }

    @Test
    public void setfamily(){
        Animal elephant = new Elephant();
        elephant.setFamily(Family.Mamifere);
        assertSame(Family.Mamifere,elephant.getFamily());
    }
}