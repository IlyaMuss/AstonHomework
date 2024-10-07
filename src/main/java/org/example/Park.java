package org.example;

public class Park {
    private String name;
    private String location;

    public Park(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public class Attraction {
        private String attractionName;
        private String openingHours;
        private double price;

        public Attraction(String attractionName, String openingHours, double price) {
            this.attractionName = attractionName;
            this.openingHours = openingHours;
            this.price = price;
        }

        public void printAttractionInfo() {
            System.out.println("--------------------------");
            System.out.println("Attraction: " + attractionName);
            System.out.println("Opening Hours: " + openingHours);
            System.out.println("Price: ₽" + price);
        }
    }

    public void printParkInfo() {
        System.out.println("");
        System.out.println("Park: " + name);
        System.out.println("Location: " + location);
    }
}
