package com.fges.rizomm.m1.persons;

import com.fges.rizomm.m1.animals.Animal;

public class Vet<T extends Animal> extends Employee {

    public void cure(T animal) {
       if(animal.getHealth());
        animal.setHealth(true);
    }

}
