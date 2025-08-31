package com.zoo.animals;

import com.zoo.interfaces.IEatable;
import com.zoo.interfaces.ISleepable;

public abstract class Animal implements IEatable, ISleepable {
    protected String name;
    protected int energyLevel;

    public Animal(String name, int energyLevel) {
        this.name = name;
        this.energyLevel = energyLevel;
    }

    public String getName() {
        return name;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public void changeEnergy(int value) {
        energyLevel += value;
        if (energyLevel < 0) energyLevel = 0;
    }

    public abstract void makeSound();
    public abstract void eat();
    public abstract void sleep();
}