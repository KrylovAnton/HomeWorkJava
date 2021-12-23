package ru.geekbrains.homework;


/**
 * Java 1. HomeWork # 5
 *
 * @author Anton Krylov
 * @version 22.12.2021
 */



/**
 * 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
 * 2. Конструктор класса должен заполнять эти поля при создании объекта.
 * 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
 * 4. Создать массив из 5 сотрудников.
 * 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
 */


class LessonFive {
    public static void main(String[] args) {
        Employee[] corporation = new Employee[5];
        corporation[0] = new Employee("Jon", "QA", "Jon@email", "89000000000", 5000, 41);
        corporation[1] = new Employee("Bill", "Dev", "Bill@email", "88000000000", 6000, 40);
        corporation[2] = new Employee("Sam", "Designer", "Sam@email", "87000000000", 7000, 43);
        corporation[3] = new Employee("Katy", "Gorgeous", "Katy@email", "86000000000", 5000, 18);
        corporation[4] = new Employee("Jessica", "Director's wife", "Jessica@email", "85000000000", 300000, 18);
        for (Employee employee : corporation)
            if (employee.getAge() > 40)
                System.out.println(employee);

    }
}


class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return (name + "\n-"
                + position + "\n-"
                + email + "\n-"
                + phone + "\n-"
                + salary + "\n-"
                + age);
    }
}