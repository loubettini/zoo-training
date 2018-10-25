package com.fges.rizomm.m1.persons;

import com.fges.rizomm.m1.animals.Animal;
import com.fges.rizomm.m1.local.Locals;

public class AnimalKeeper extends Employee {

    public void feed(Animal animal, String food) {

        if (food != null && !food.equals("child")) {
            animal.eat(food);
        }

    }

    public void getAnimalOut(Locals local){

        if (local.getOccupied()) {
            local.setOccupied(false);
        }
    }
}
