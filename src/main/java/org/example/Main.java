package org.example;

public class Main {
    public static void main(String[] args) {
        Employee employee0 = new Employee("Muss Ilya Dmitrievich", "QA-engineer", "ilya_muss@mail.ru", "+7777777777", 50000, 28);
        employee0.printEmployeeInfo();

        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@emailbox.com", "892312312", 30000, 30);
        employees[1] = new Employee("Petrov Petr", "Developer", "petrini@mail.com", "79876543221", 70000, 29);
        employees[2] = new Employee("Morgenshtern Alisher", "Designer", "alisher.morgen@mail.com", "+3752334455", 60000, 25);
        employees[3] = new Employee("Dostoevskaya Maria", "HR", "maria.dosta@mail.com", "+7988776655", 45000, 22);
        employees[4] = new Employee("Burim Andrey", "Analyst", "bur_andry@mail.com", "8433221100", 55000, 23);

        for (Employee employee : employees) {
            employee.printEmployeeInfo();
        }

        Park park = new Park("Green Island", "Omsk City");

        park.printParkInfo();

        Park.Attraction attraction1 = park.new Attraction("Roller Coaster", "09:00 - 18:00", 1500.00);
        Park.Attraction attraction2 = park.new Attraction("Ferris Wheel", "08:00 - 20:00", 350.00);
        Park.Attraction attraction3 = park.new Attraction("Water Slide", "10:00 - 17:00", 500.00);

        attraction1.printAttractionInfo();
        attraction2.printAttractionInfo();
        attraction3.printAttractionInfo();

        Park park2 = new Park("HorrorStory", "Omsk City");

        park2.printParkInfo();

        Park.Attraction attraction4 = park2.new Attraction("Crooked Mirror", "18:00 - 09:00", 2500.00);
        Park.Attraction attraction5 = park2.new Attraction("Panic Room", "20:00 - 10:00", 1000.00);
        Park.Attraction attraction6 = park2.new Attraction("Bloody Party", "19:00 - 11:00", 3600.00);

        attraction4.printAttractionInfo();
        attraction5.printAttractionInfo();
        attraction6.printAttractionInfo();
    }
}


