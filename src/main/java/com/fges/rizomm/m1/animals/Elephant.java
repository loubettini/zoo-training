package com.fges.rizomm.m1.animals;

public class Elephant extends Animal implements vertebre {

    @Override
    public String toString() {
        return "Elephant : " + super.getName();
    }

    @Override
    String scream() {
        return "braaammmm";
    }

    @Override
    public void setFamily(Family family) {
        super.setFamily(Family.Mamifere);
    }
}
