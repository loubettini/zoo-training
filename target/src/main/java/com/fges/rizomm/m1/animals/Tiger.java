package com.fges.rizomm.m1.animals;

public class Tiger extends Animal implements vertebre {
    @Override
    String scream() {
        return "ROOAARR";
    }

    @Override
    public void setFamily(Family family) {
        super.setFamily(Family.Mamifere);
    }
}
