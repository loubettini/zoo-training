package com.fges.rizomm.m1.animals;

public class Octopus extends Animal implements Invertebre {
    @Override
    String scream() {
        return "bloublou";

    }

    @Override
    public String crawl() {
        return "swim";
    }

    @Override
    public void setFamily(Family family) {
        super.setFamily(Family.Aquatic);
    }
}
