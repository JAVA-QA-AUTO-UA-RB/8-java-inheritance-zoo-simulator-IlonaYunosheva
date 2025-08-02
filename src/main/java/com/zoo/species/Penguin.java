package com.zoo.species;
import com.zoo.animals.Bird;

public class Penguin extends Bird {
    public Penguin(String name, int age, double weight, int energyLevel, double wingSpan) {
        super(name, age, weight, energyLevel, wingSpan);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " каже: Кря-кря!");
    }

    public void swim() {
        System.out.println(name + " обожнює плавати");
    }

    @Override
    public void fly() {
        System.out.println(name + " не літає,бо...  ");
        swim();
    }
}
