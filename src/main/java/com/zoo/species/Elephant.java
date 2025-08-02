package com.zoo.species;

import com.zoo.animals.Mammal;

public class Elephant extends Mammal {
    public Elephant (String name, int age, double weight, int energyLevel, String furColor) {
        super(name, age, weight, energyLevel, furColor);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " Труба-ба-ба!");
    }

    public void spraySelf() {
        System.out.println(name + " робить водний пшиик.");
    }
}
