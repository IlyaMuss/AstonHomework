package org.example;

public class Eda {
    private int foodAmount;
    public Eda(int foodAmount) {
        this.foodAmount = foodAmount;
    }
    public boolean decreaseFood(int amount) {
        if (foodAmount >= amount) {
            foodAmount -= amount;
            return true;
        } else {
            return false;
        }
    }
    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount;
        }
    }
    public int getFoodAmount() {
        return foodAmount;
    }
}
