package com.zoo.species;

import com.zoo.animals.Mammal;
import com.zoo.interfaces.IPlayable;

public class Lion extends Mammal implements IPlayable {

    public Lion(String name, int energyLevel) {
        super(name, energyLevel);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " голосно ричить!");
    }

    @Override
    public void eat() {
        System.out.println(name + " їсть м'яско.");
        changeEnergy(+20);
    }

    @Override
    public void sleep() {
        System.out.println(name + " спить на спинці.");
        changeEnergy(+30);
    }

    @Override
    public void move() {
        System.out.println("Біжить дуже швидко.");
        changeEnergy(-50);
    }

    @Override
    public void play() {
        System.out.println(name + " грає з друзями.");
        changeEnergy(-55);
    }
}