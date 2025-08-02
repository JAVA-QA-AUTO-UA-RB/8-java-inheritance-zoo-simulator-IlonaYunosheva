package com.zoo;

import com.zoo.species.*;
import com.zoo.zookeper.ZooKeeper;

public class ZooSimulator {

    public static void main(String[] args) {
        Lion King = new Lion("Левчик", 7, 100, 50, "рудий");
        Elephant Elephant = new Elephant("Слоненятко", 2, 500.0, 70, "сірий");
        Eagle eagle = new Eagle("Орел", 3, 6.0, 80, 2.5);
        Penguin penguin = new Penguin("Кіндер_Пінгві", 1, 10.0, 50, 1.0);

        ZooKeeper keeper = new ZooKeeper("Петрівна");

        System.out.println("Веселий день у зоопарку");

        keeper.feedAnimal(King);
        keeper.feedAnimal(Elephant);
        keeper.feedAnimal(eagle);
        keeper.feedAnimal(penguin);

        System.out.println("\nВесела гра з тваринами\n");

        keeper.playWithAnimal(King);
        keeper.playWithAnimal(Elephant);
        keeper.playWithAnimal(eagle);
        keeper.playWithAnimal(penguin);

        System.out.println("\nЗабави тварин\n");

        King.hunt();
        Elephant.spraySelf();
        eagle.fly();
        penguin.fly();

        System.out.println("\nРівень енергії\n");

        keeper.checkAnimalEnergyLevel(King);
        keeper.checkAnimalEnergyLevel(Elephant);
        keeper.checkAnimalEnergyLevel(eagle);
        keeper.checkAnimalEnergyLevel(penguin);

        System.out.println("\nСтан наприкінці дня:\n");

        King.displayInfo();
        Elephant.displayInfo();
        eagle.displayInfo();
        penguin.displayInfo();

        System.out.println("\nЗавершено зоо день");
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

