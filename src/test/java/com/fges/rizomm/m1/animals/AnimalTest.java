package com.fges.rizomm.m1.animals;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertTrue;

@RunWith(JUnit4.class)
 public class AnimalTest {

    @Test
    public void when_animal_scream_then_string() {
        Animal dog = new Dog();

        assertTrue(dog.scream().matches(".*"));
        assertTrue(dog.scream().equals("Woof"));
        assertTrue(!dog.scream().isEmpty());


    }



    @Test
    public void eat() {
        Animal dog = new Dog();
        dog.eat("steak");
    assertTrue(dog.getEatCount()==1);

    }


}