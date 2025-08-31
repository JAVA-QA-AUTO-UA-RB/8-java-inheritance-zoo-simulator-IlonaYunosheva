package com.zoo.species;

import com.zoo.animals.Bird;
import com.zoo.interfaces.IPlayable;

public class Eagle extends Bird implements IPlayable {

    public Eagle(String name, int energyLevel) {
        super(name, energyLevel);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " каррр!");
    }

    @Override
    public void eat() {
        System.out.println(name + " їсть гризунів.");
        changeEnergy(+15);
    }

    @Override
    public void sleep() {
        System.out.println(name + " спить коло гнізда.");
        changeEnergy(+20);
    }

    @Override
    public void uniqueBirdAction() {
        buildNest();
    }

    private void buildNest() {
        System.out.println(name + " будує гніздо.");
        changeEnergy(-50);
    }

    @Override
    public void play() {
        System.out.println(name + " грає високо в небі.");
        changeEnergy(-55);
    }
}
