package org.example;

public interface Shape {
    double getArea();
    double getPerimeter();

    void setFillColor(String color);
    void setBorderColor(String color);
    String getFillColor();
    String getBorderColor();

    default void printDetails() {
        System.out.println("Площадь: " + getArea());
        System.out.println("Периметр: " + getPerimeter());
        System.out.println("Цвет заливки: " + getFillColor());
        System.out.println("Цвет границы: " + getBorderColor());
    }
}

