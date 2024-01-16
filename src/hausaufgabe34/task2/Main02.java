package hausaufgabe34.task2;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the planet number:");
        int planetNumber = scanner.nextInt();

        SolarSystemPlanets selectedPlanet = SolarSystemPlanets.values()[planetNumber - 1];

        System.out.println("You selected the planet " + selectedPlanet.getName());
        classifyPlanet(selectedPlanet);
    }

    public static void classifyPlanet(SolarSystemPlanets planet) {
        System.out.println("Class: " + determineClass(planet));
        System.out.println("Radius: " + planet.getRadius() + " meters");
        System.out.println("Mass: " + planet.getMass() + " kg");
        System.out.println("Gravity acceleration g: " + planet.calculateGravity() + " m/s^2");
    }

    public static String determineClass(SolarSystemPlanets planet) {
        double planetRadius = planet.getRadius();
        double planetMass = planet.getMass();

        if (planetRadius < 10000e3 && planetMass < 1e24) {
            return "Lifeless rock";
        } else if (planetRadius > 10000e3 && planetMass > 1e24) {
            return "Gas giant";
        } else {
            return "Habitable planet";
        }
    }
}
