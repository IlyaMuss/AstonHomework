package org.example;

public class Main {
    public static void main(String[] args) {
        Dog dogBobik = new Dog("Бобик");
        Cat catLord = new Cat("Лорд");
        Cat catGraf = new Cat("Граф");

        dogBobik.run(500);
        dogBobik.swim(10);
        catLord.swim(0);
        catGraf.swim(0);

        Eda eda = new Eda(30);
        Cat[] cats = {catLord, catGraf};

        for (Cat cat : cats) {
            cat.eat(eda, 15);
        }
        for (Cat cat : cats) {
            System.out.println(cat.getName() + " сыт: " + cat.isFull());
        }
        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Всего собак: " + Dog.getDogCount());
        System.out.println("Всего котов: " + Cat.getCatCount());

    }
}