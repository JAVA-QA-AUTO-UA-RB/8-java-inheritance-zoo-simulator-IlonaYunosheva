package com.zoo.species;

import com.zoo.animals.Mammal;
import com.zoo.interfaces.IPlayable;

public class Elephant extends Mammal implements IPlayable {

    public Elephant(String name, int energyLevel) {
        super(name, energyLevel);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " тру-тутуту!");
    }

    @Override
    public void eat() {
        System.out.println(name + " жує травку.");
        changeEnergy(+25);
    }

    @Override
    public void sleep() {
        System.out.println(name + " солодко спить.");
        changeEnergy(+40);
    }

    @Override
    public void move() {
        System.out.println("Важко топає.");
        changeEnergy(-55);
    }

    @Override
    public void play() {
        System.out.println(name + " булькає водою через хобот.");
        changeEnergy(-50);
    }
}
