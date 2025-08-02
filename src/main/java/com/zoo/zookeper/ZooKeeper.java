package com.zoo.zookeper;
import com.zoo.animals.Animal;

public class ZooKeeper {
    private String name;

    public ZooKeeper (String name) {
        this.name = name;
    }
    public void feedAnimal(Animal animal) {
        System.out.println(name + " годує " + animal.getName());
        animal.eat();
    }

    public void playWithAnimal(Animal animal) {
        System.out.println(name + " бавиться з " + animal.getName());
        animal.makeSound();
    }

    public void checkAnimalEnergyLevel(Animal animal) {
        int level = animal.getEnergyLevel();
        String status;

        if (level <= 30) {
            status = "Низький";
        } else if (level <= 70) {
            status = "Середній";
        } else {
            status = "Високий";
        }

        System.out.println("Рівень енергії " + animal.getName() + ": " + level + " (" + status + ")");
    }
}

