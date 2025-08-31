package com.zoo.zookeeper;

import com.zoo.animals.Animal;
import com.zoo.interfaces.IEatable;
import com.zoo.interfaces.IPlayable;

public class ZooKeeper {

    private final String name;

    public ZooKeeper(String name) {
        this.name = name;
    }

    public void feedAnimal(IEatable animal) {
        System.out.println(name + " годує тварин...");
        animal.eat();
    }

    public void playWithAnimal(IPlayable animal) {
        System.out.println(name + " грає з тваринами...");
        animal.play();
    }

    public void checkAnimalEnergyLevel(Animal animal) {
        System.out.println(animal.getName() + "'енергія: " + animal.getEnergyLevel());
    }
}
