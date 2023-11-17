package hausaufgabe26.task1;

public class Main {

    public static void printHumanInfo(Human human) {
        System.out.println("Name: " + human.name);
        System.out.println("Age: " + human.age);
        System.out.println("Haircolor: " + human.hairColor);

    }

    public static void main(String[] args) {
        Human human = new Human("Eva", 25, "red");
        printHumanInfo(human);
        Human human1 = new Human();
        printHumanInfo(human1);
    }

}
