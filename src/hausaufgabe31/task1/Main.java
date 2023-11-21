package hausaufgabe31.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите значение переменной a: ");
        double a = scanner.nextDouble();

        System.out.print("Введите значение переменной b: ");
        double b = scanner.nextDouble();

        System.out.print("Введите значение переменной c: ");
        double c = scanner.nextDouble();

        System.out.print("Введите значение переменной d: ");
        double d = scanner.nextDouble();

        double result = a * (b - d) + c * a / d;

        System.out.println("Результат: " + result);

    }
}
