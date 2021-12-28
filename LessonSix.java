package ru.geekbrains.homework;

/**
 * Java 1. HomeWork # 6
 *
 * @author Anton Krylov
 * @version 28.12.2021
 */

/**
 * 1. Создать классы Собака и Кот с наследованием от класса Животное.
 *
 * 2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
 * Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
 *
 * 3. У каждого животного есть ограничения на действия
 * (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
 *
 * 4. * Добавить подсчет созданных котов, собак и животных.
 */


class LessonSix {
    public static void main(String[] args) {
        Cat cat = new Cat("Murzik", 200, 0);
        Dog dog = new Dog("Bobik", 500, 10);
        IAnimal[] animals = {cat, dog};
        for (IAnimal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.run(150));
            System.out.println(animal.run(300));
            System.out.println(animal.run(600));
            System.out.println(animal.swim(5));
            System.out.println(animal.swim(15));
        }
        System.out.println(" How many animals: " + Animal.getCountOfAnimals());
    }
}

interface IAnimal {
    String run(int distance);
    String swim(int distance);
}

abstract class Animal implements IAnimal {
    protected int runDistance;
    protected int swimDistance;
    protected String className;
    protected String name;
    protected static int countOfAnimals = 0;

    Animal(String name, int runDistance, int swimDistance) {
        this.name = name;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
        className = getClass().getSimpleName();
        countOfAnimals++;
    }

    public String getClassName() {
        return className;
    }

    public static int getCountOfAnimals() {
        return countOfAnimals;
    }

    @Override
    public String run(int distance) {
        if (distance > runDistance) {
            return className + name + " Bad Run. OH NOO. " + distance;
        } else {
            return className + name + " Good Run !! Congratulations !! " + distance;
        }
    }

    @Override
    public String swim(int distance) {
        if (distance > swimDistance) {
            return className + name + " Bad Swim. OH NOO. " + distance;
        } else {
            return className + name + " Good Swim !! Congratulations !! " + distance;
        }
    }

    @Override
    public String toString() {
        return className + name + " runDistance: " + runDistance + " swimDistance: " + swimDistance;
    }
}

class Cat extends Animal {
    Cat(String name, int runDistance, int swimDistance) {
        super(name, runDistance, swimDistance);
    }

    @Override
    public String swim(int distance) {
        return getClassName() + name + " NO NO NO NO I don't swim ";
    }


}

class Dog extends Animal {
    Dog(String name, int runDistance, int swimDistance) {
        super(name, runDistance, swimDistance);
    }
}
