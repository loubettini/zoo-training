package com.fges.rizomm.m1.animals;

import org.junit.Test;

import static org.junit.Assert.*;

public class SnakeTest {

    @Test
    public void when_animal_scream_then_string() {
        Animal snake = new Snake();

        assertTrue(snake.scream().matches(".*"));
        assertEquals("sssss", snake.scream());
        assertTrue(!snake.scream().isEmpty());


    }

    @Test
    public void name() {
        Animal snake = new Snake();
        snake.setName("jack");
        assertEquals("jack", snake.getName());

    }

    @Test
    public void crawl(){
        Animal snake = new Snake();

        assertEquals("move", ((Snake) snake).crawl());

    }
    @Test
    public void eat() {
        Animal snake = new Snake();
        snake.eat("steak");
        assertTrue(snake.getEatCount() == 1);

    }
    @Test
    public void setfamily(){
        Animal sanke = new Snake();
        sanke.setFamily(Family.Reptile);
        assertSame(Family.Reptile,sanke.getFamily());
    }
}