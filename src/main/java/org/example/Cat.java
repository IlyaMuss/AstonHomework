package org.example;

public class Cat extends Animal {
    private static int catCount = 0;
    private final int maxRunDistance = 200;
    private boolean isFull = false;

    public Cat(String name) {
        super(name);
        catCount++;
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
        System.out.println(name + " не умеет плавать.");
    }
    public boolean isFull() {
        return isFull;
    }
    public void eat(Eda eda, int amount) {
        if (eda.decreaseFood(amount)) {
            isFull = true;
            System.out.println(name + " покушал и теперь сыт.");
        } else {
            System.out.println(name + " еды недостаточно.");
        }
    }
    public static int getCatCount() {
        return catCount;
    }
}
