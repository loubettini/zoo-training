package com.fges.rizomm.m1.persons;

import com.fges.rizomm.m1.animals.Animal;
import com.fges.rizomm.m1.animals.Cat;
import org.junit.Assert;
import org.junit.Test;

public class VetTest {

    @Test
    public void cure() {
        Animal cat = new Cat();
        Vet<Animal> vet = new Vet<>();
        cat.setHealth(false);
        vet.cure(cat);
        Assert.assertTrue(cat.getHealth());

    }
}