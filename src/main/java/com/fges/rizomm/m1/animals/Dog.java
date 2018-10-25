package com.fges.rizomm.m1.animals;

public class Dog extends Animal implements vertebre{

    @Override
    public String toString() {
        return "Dog : " + super.toString();
    }

    @Override
    public String scream() {
        return "Woof";
    }

    @Override
    public void setFamily(Family family) {
        super.setFamily(Family.Mamifere);
    }
}
