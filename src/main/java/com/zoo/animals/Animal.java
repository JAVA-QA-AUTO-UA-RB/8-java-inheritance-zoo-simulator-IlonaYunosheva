package com.zoo.animals;

public class Animal {
    protected String name;
    protected int age;
    protected double weight;
    private int energyLevel;

    public Animal (String name, int age, double weight, int energyLevel){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.energyLevel = energyLevel;
    }

    public void eat() {
        energyLevel = Math.min(100, energyLevel + 20);
        System.out.println(name + " хрумає і його енергія: " + energyLevel);
    }

    public void sleep() {
        energyLevel = Math.min(100, energyLevel + 30);
        System.out.println(name + " солодко спить і його енергія: " + energyLevel);
    }

    public void makeSound() {
        System.out.println(name + " звучить по-звірячому");
    }

    public void displayInfo() {
        System.out.println("Ім'я тваринки: " + name + ", Вік: " + age + ", Вага: " + weight + ", Енергія: " + energyLevel);
    }

    protected void decreaseEnergy(int amount) {
        energyLevel = Math.max(0, energyLevel - amount);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }
}
