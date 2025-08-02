package com.zoo.species;
import com.zoo.animals.Bird;

public class Eagle extends Bird {
    public Eagle(String name, int age, double weight, int energyLevel, double wingSpan) {
        super(name, age, weight, energyLevel, wingSpan);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " каже: Кріі-кріі!");
    }

    @Override
    public void fly() {
        decreaseEnergy(20);
        System.out.println(name + " :Я багато літав над лісом. Моя енергія: " + getEnergyLevel());
    }
}
