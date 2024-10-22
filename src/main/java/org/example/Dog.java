package org.example;

public class Dog extends Animal {
    private static int dogCount = 0;
    private final int maxRunDistance = 500;
    private final int maxSwimDistance = 10;

    public Dog(String name) {
        super(name);
        dogCount++;
    }
    @Override
    public void run(int distance) {
        if (distance > maxRunDistance) {
            System.out.println(name + " не может пробежать больше " + maxRunDistance + " м.");
        } else {
            super.run(distance);
        }
    }
    @Override
    public void swim(int distance) {
        if (distance > maxSwimDistance) {
            System.out.println(name + " не может проплыть больше " + maxSwimDistance + " м.");
        } else {
            super.swim(distance);
        }
    }
    public static int getDogCount() {
        return dogCount;
    }
}
