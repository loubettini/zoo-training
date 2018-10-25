package com.fges.rizomm.m1.animals;

public class Snake extends Animal implements Invertebre {
    @Override
    String scream() {
        return "sssss";
    }

    @Override
    public String crawl() {
        return "move";
    }

    @Override
    public void setFamily(Family family) {
        super.setFamily(Family.Reptile);
    }
}
