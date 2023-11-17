package hausaufgabe26.task2;

public class Dog {
    String dogBreed;
    int weight;
    String hairColor;
    int growth;
    int age;

    public Dog(String dogBreed, int weight, String hairColor, int growth, int age) {
        this.dogBreed = dogBreed;
        this.weight = weight;
        this.hairColor = hairColor;
        this.growth = growth;
        this.age = age;
    }

    public Dog() {
        this("Пекинез", 15, "рыжий", 25, 3);
    }
}
