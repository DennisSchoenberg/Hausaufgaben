package hausaufgabe34.task02;

public enum SolarPlanets {
    MERCURY(" Mercury"),
    VENUS("Venus"),
    EARTH("Earth"),
    MARS("Mars"),
    JUPITER("Jupiter"),
    SATURN("Saturn"),
    URANUS("Uranus"),
    NEPTUNE("Neptune");

    private String name;

    SolarPlanets(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
