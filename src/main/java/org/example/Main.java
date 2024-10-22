package org.example;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(2.2);
        circle.setFillColor("Black");
        circle.setBorderColor("Red");
        System.out.println("\nХарактеристики круга:");
        circle.printDetails();

        Rectangle rectangle = new Rectangle(4.1, 5.9);
        rectangle.setFillColor("Blue");
        rectangle.setBorderColor("Green");
        System.out.println("\nХарактеристики прямоугольника:");
        rectangle.printDetails();

        Triangle triangle = new Triangle(3, 4, 5);
        triangle.setFillColor("Orange");
        triangle.setBorderColor("Yellow");
        System.out.println("\nХарактеристики треугольника:");
        triangle.printDetails();
    }
}
