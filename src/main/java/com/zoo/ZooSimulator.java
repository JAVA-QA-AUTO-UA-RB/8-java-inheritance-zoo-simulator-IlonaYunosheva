package com.zoo;

import com.zoo.animals.Animal;
import com.zoo.interfaces.IPlayable;
import com.zoo.species.*;
import com.zoo.zookeeper.ZooKeeper;

import java.util.ArrayList;
import java.util.List;

public class ZooSimulator {

    public static void main(String[] args) {
        Lion king = new Lion("Левчик", 100);
        Elephant dumbo = new Elephant("Слоненятко", 100);
        Eagle eagle = new Eagle("Орлик", 100);
        Penguin pingu = new Penguin("Кіндер", 100);

        ZooKeeper keeper = new ZooKeeper("Петрівна");

        System.out.println(" Веселий день у зоопарку!\n");

        List<Animal> animals = new ArrayList<>();
        animals.add(king);
        animals.add(dumbo);
        animals.add(eagle);
        animals.add(pingu);

        List<IPlayable> playableAnimals = new ArrayList<>();
        playableAnimals.add(king);
        playableAnimals.add(dumbo);
        playableAnimals.add(eagle);
        playableAnimals.add(pingu);

        System.out.println("\nГраємося з усіма тваринами:");
        for (IPlayable animal : playableAnimals) {
            animal.play();
        }

        keeper.playWithAnimal(king);
        keeper.playWithAnimal(dumbo);
        keeper.playWithAnimal(eagle);
        keeper.playWithAnimal(pingu);

        System.out.println("\n Унікальні забави:");
        king.makeSound();
        dumbo.move();
        eagle.uniqueBirdAction();
        pingu.uniqueBirdAction();

        System.out.println("\nГодуємо і вкладаємо спати всіх тварин:");
        for (Animal animal : animals) {
            animal.eat();
            animal.sleep();

        }

        System.out.println("\n Перевірка енергії:");
        keeper.checkAnimalEnergyLevel(king);
        keeper.checkAnimalEnergyLevel(dumbo);
        keeper.checkAnimalEnergyLevel(eagle);
        keeper.checkAnimalEnergyLevel(pingu);


        System.out.println("\n✅ День у зоопарку завершено!");
    }
}

        // +Створіть кілька об'єктів різних тварин (лев, орел, пінгвін, слон), задавши їх унікальні параметри.

        //+ Створіть об'єкт ZooKeeper і прив'яжіть його до зоопарку.

        // +Додайте логіку, яка представляє типові події дня в зоопарку:
        // -+ Годування тварин: використання методу feedAnimal().
        // - +Гра з тваринами: використання методу playWithAnimal().
        // - +Перевірка рівня енергії тварин: використання методу checkAnimalEnergyLevel().

        // Симулюйте зміну стану тварин (наприклад, втома після грається, зростання енергії після їжі).

        // Виведіть фінальні результати та стани тварин наприкінці дня.

