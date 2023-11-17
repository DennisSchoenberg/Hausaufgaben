package hausaufgabe26.task1;

public class Human {
    String name;
    int age;
    String hairColor;

    public Human(String name, int age, String hairColor) {
        this.name = name;
        this.age = age;
        this.hairColor = hairColor;
    }

    public Human() {
        this("Johaness", 45, "Black");
    }
}
