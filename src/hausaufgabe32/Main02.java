package hausaufgabe32;

import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число, которое будет перемножено от 1 до 10: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(n + " * " + i + " = " + (i * n));

        }
    }
}
