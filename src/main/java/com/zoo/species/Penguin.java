package com.zoo.species;

import com.zoo.animals.Bird;
import com.zoo.interfaces.IPlayable;

public class Penguin extends Bird implements IPlayable {

    public Penguin(String name, int energyLevel) {
        super(name, energyLevel);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " кряки!");
    }

    @Override
    public void eat() {
        System.out.println(name + " їсть рибку.");
        changeEnergy(+20);
    }

    @Override
    public void sleep() {
        System.out.println(name + " спить на льоду.");
        changeEnergy(+25);
    }

    @Override
    public void uniqueBirdAction() {
        surfOnIce();
    }

    private void surfOnIce() {
        System.out.println(name + " сьорфить по льоду!");
        changeEnergy(-55);
    }

    @Override
    public void play() {
        System.out.println(name + " грає з друзями на льоду.");
        changeEnergy(-50);
    }
}
