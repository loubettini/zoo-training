package com.fges.rizomm.m1.animals;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
public class CatTest {

    @Test
    public void when_animal_scream_then_string() {
        Animal cat = new Cat();

        assertTrue(cat.scream().matches(".*"));
        assertTrue(cat.scream().equals("Miaou"));
        assertTrue(!cat.scream().isEmpty());


    }


    @Test
    public void eat() {
        Animal cat = new Cat();
        cat.eat("steak");
        assertTrue(cat.getEatCount() == 1);

    }

    @Test
    public void setfamily(){
        Animal cat = new Cat();
        cat.setFamily(Family.Mamifere);
        assertSame(Family.Mamifere,cat.getFamily());
    }
}