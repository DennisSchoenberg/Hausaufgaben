package hausaufgabe26.task2;

import hausaufgabe26.task1.Human;

public class Main {
    public static void printDogInfo(Dog dog) {
        System.out.println("Расса: " + dog.dogBreed);
        System.out.println("Вес: " + dog.weight + "кг");
        System.out.println("Окрас: " + dog.hairColor);
        System.out.println("Рост: " + dog.growth + "см");
        System.out.println("Возраст: "  + dog.age + "года");

    }

    public static void main(String[] args) {
        Dog dog = new Dog("Чивава", 2, "белый", 9, 3);
        printDogInfo(dog);
        Dog dog1 = new Dog();
        printDogInfo(dog1);
    }
}
