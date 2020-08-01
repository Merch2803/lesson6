package ru.GeekBrains.lesson6;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Animal cat = new Cat("Cute", 200, 0, 2);
        Animal dog = new Dog("Jack", 500, 10, 0.5d);

        System.out.println(cat.name + " run: " + cat.run(600));
        System.out.println(cat.name + " swim: " + cat.swim(7));
        System.out.println(cat.name + " jump: " + cat.jump(1.9d ));

        System.out.println("##################");

        System.out.println(dog.name + " run: " + dog.run(400));
        System.out.println(dog.name + " swim: " + dog.swim(4));
        System.out.println(dog.name + " jump: " + dog.jump(2.2d));

        System.out.println("##################");

        Animal dog2 = new Dog("Black", randomizer(100, 700), randomizer(5, 15), randomizer(0, 2));
        System.out.println(dog2.name + " run: " + dog2.run(400));
        System.out.println(dog2.name + " swim: " + dog2.swim(4));
        System.out.println(dog2.name + " jump: " + dog2.jump(2.2d));

        System.out.println("##################");

        Animal dog3 = new Dog("White", randomizer(50, 900), randomizer(4, 18), randomizer(0, 5));
        System.out.println(dog3.name + " run: " + dog3.run(400));
        System.out.println(dog3.name + " swim: " + dog3.swim(4));
        System.out.println(dog3.name + " jump: " + dog3.jump(2.2d));

    }
    static int randomizer(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1);
    }
}
