package hausaufgabe25.task1;

public class Main {
    public static void main(String[] args) {
        Human Johaness = new Human();
        Johaness.name = "Jochaness";
        Johaness.age = 43;

        Human Eva = new Human();
        Eva.name = "Eva";
        Eva.age = 25;

        Johaness.introduce();
        Eva.introduce();
        System.out.println("Das Programm wird beendet.");
    }
}
