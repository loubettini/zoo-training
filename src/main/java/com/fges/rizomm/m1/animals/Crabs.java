package com.fges.rizomm.m1.animals;

public class Crabs extends Animal implements Invertebre{

    @Override
    public String toString() {
        return "Crabs : " + super.getName();
    }

    @Override
    String scream() {
        return "";
    }

    @Override
    public String crawl() {
    return "move";
    }
}
