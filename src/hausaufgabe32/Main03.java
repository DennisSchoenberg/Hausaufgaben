package hausaufgabe32;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 10.");
        int input = scanner.nextInt();

        if (input >= 1 && input <= 10) {
            System.out.println("Вы ввели число " + input + ". Спасибо!");
        } else {
            System.out.println("Неподходящее число. Пожалуйста, введите число от 1 до 10.");
        }
    }
}
