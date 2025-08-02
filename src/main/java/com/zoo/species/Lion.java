package com.zoo.species;

import com.zoo.animals.Mammal;

public class Lion extends Mammal {
    public Lion(String name, int age, double weight, int energyLevel, String furColor) {
        super(name, age, weight, energyLevel, furColor);
    }

    @Override
    public void makeSound() {
        System.out.println(name + "Рррр!");
    }

    public void hunt() {
        decreaseEnergy(25);
        System.out.println(name + ":Я багато полював та втомився. Моя енергія: " + getEnergyLevel());
    }
}

