package com.fges.rizomm.m1.animals;

public class Cat extends Animal implements vertebre {

    @Override
    public String toString() {
        return "Cat : " + super.getName();
    }

    @Override
    public String scream() {
        return "Miaou";
    }


    @Override
    public void setFamily(Family family) {
        super.setFamily(Family.Mamifere);
    }
}
