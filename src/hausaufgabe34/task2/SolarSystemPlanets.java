package hausaufgabe34.task2;

enum SolarSystemPlanets {
    MERCURY("Mercury", 2439.7e3, 3.3011e23),
    VENUS("Venus", 6051.8e3, 4.8675e24),
    EARTH("Earth", 6371.0e3, 5.97219e24),
    MARS("Mars", 3389.5e3, 6.4171e23),
    JUPITER("Jupiter", 69911e3, 1.8982e27),
    SATURN("Saturn", 58232e3, 5.6834e26),
    URANUS("Uranus", 25362e3, 8.6810e25),
    NEPTUNE("Neptune", 24622e3, 1.02413e26);

    private final String name;
    private final double radius;
    private final double mass;

    // Constructor
    SolarSystemPlanets(String name, double radius, double mass) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
    }

    // Method to calculate gravity acceleration g
    public double calculateGravity() {
        double G = 6.6743e-11;
        return G * mass / (radius * radius);
    }

    // Getters for fields
    public String getName() {
        return name;
    }

    public double getRadius() {
        return radius;
    }

    public double getMass() {
        return mass;
    }
}
