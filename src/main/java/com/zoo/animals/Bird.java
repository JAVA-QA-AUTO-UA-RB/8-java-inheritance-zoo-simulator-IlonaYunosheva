package com.zoo.animals;

public class Bird extends Animal {
    protected Double wingSpan;

    public Bird (String name, int age, double weight, int energyLevel, Double wingSpan) {
        super(name, age, weight, energyLevel);
        this.wingSpan = wingSpan;
    }
    @Override
    public void makeSound() {
        System.out.println(name + " :Я птах і я чудово літаю..вжуух.");
    }
    public void fly() {
        decreaseEnergy(15);
        System.out.println(name + " :Я налітався та втомився. Моя енергія: " + getEnergyLevel());
    }
}
