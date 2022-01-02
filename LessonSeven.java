package ru.geekbrains.homework;

/**
 *
 * Java 1. HomeWork # 7
 *
 * @author Anton Krylov
 *
 * @version 02.01.2022
 *
 */

/**
 *
 * 1. Расширить задачу про котов и тарелки с едой.
 *
 * 2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
 * (например, в миске 10 еды, а кот пытается покушать 15-20).
 *
 * 3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
 * Если коту удалось покушать (хватило еды), сытость = true.
 *
 * 4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает,
 * то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
 *
 * 5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки
 * и потом вывести информацию о сытости котов в консоль.
 *
 * 6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
 *
 */


public class LessonSeven {
    public static void main(String[] args) {
        int action;
        Kitten[] allKittens = new Kitten[4];
        allKittens[0] = new Kitten("Sosiska", 20);
        allKittens[1] = new Kitten("Murzik", 10);
        allKittens[2] = new Kitten("Chunya", 15);
        allKittens[3] = new Kitten("Borzoi", 25);
        Plate plate = new Plate(60, 40);
        System.out.println(plate);
        for (Kitten kitten : allKittens) {
            kitten.eat(plate);
            System.out.println(kitten);
        }
        System.out.println(plate);
        plate.add(45);
        System.out.println(plate);
        for (Kitten kitten : allKittens) {
            kitten.setFullness(false);
            kitten.eat(plate);
            System.out.println(kitten);
        }
        System.out.println(plate);
    }
}

class Kitten {
    private String name;
    private int appetite;
    private boolean fullness;

    Kitten(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        fullness = false;
    }

    void eat(Plate plate) {
        if (!fullness) {
            fullness = plate.eatenFood(appetite);
        }
    }

    void setFullness(boolean status) {
        fullness = status;
    }

    @Override
    public String toString() {
        return "{Kitten-" + name + ", appetite: " + appetite + ", fullness-" + fullness + "}";
    }
}

class Plate {
    private int food;
    private int volume;

    Plate(int food, int volume) {
        this.food = food;
        this.volume = volume;
    }

    boolean eatenFood(int portion) {
        if (food < portion) {
            return false;
        }
        food -= portion;
        return true;
    }

    void add(int food) {
        if (this.food + food <= volume) {
            this.food += food;
        }
    }


    @Override
    public String toString() {
        return "plate: " + food;
    }
}
