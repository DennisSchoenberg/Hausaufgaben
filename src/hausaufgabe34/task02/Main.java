package hausaufgabe34.task02;

import java.util.Scanner;

public class Main {
    public static String getPlanetClass(SolarPlanets planet) {
        switch (planet) {
            case EARTH :
                return "Habitable";
            case MERCURY:
            case VENUS:
            case MARS:
                return "Lifeless stone";
            case JUPITER:
            case SATURN:
                return "Gas giant";
            case URANUS:
            case NEPTUNE:
                return "Lifeless ice planet";
        }
        return"";
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        SolarPlanets[] planets = SolarPlanets.values();
        System.out.println("You choose planet: " + planets[n - 1].getName());
        System.out.println("Planet class: " + getPlanetClass(planets[n - 1]));
    }
}
