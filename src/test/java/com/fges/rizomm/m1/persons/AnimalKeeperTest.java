package com.fges.rizomm.m1.persons;

import com.fges.rizomm.m1.animals.Animal;
import com.fges.rizomm.m1.animals.Dog;
import com.fges.rizomm.m1.local.Cage;
import com.fges.rizomm.m1.local.Locals;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class AnimalKeeperTest {

    @Test
    public void when_animal_keeper_feed_then_count_increment() {
        Animal dog = new Dog();
        AnimalKeeper keeper = new AnimalKeeper();

        keeper.feed(dog, "steak");

        Assert.assertEquals(1, dog.getEatCount());
    }

    @Test
    public void when_animal_keeper_give_child_as_food_then_error() {
        Animal dog = new Dog();
        AnimalKeeper keeper = new AnimalKeeper();

        keeper.feed(dog, "child");

        Assert.assertTrue(dog.getEatCount() == 0);
    }

    @Test

    public void getAnimalOut(){
        Locals cage = new Cage();
        AnimalKeeper keeper = new AnimalKeeper();
        cage.setOccupied(true);
        keeper.getAnimalOut(cage);
        Assert.assertTrue(!cage.getOccupied());

    }
}