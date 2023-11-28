package hausaufgabe32;

import java.util.Random;
import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = scanner.nextInt();
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }

        boolean isSorted = true;
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                isSorted = false;
                break;
            }
        }

        if (isSorted) {
            System.out.println("\nМассив отсортирован по возрастанию.");
        } else {
            System.out.println("\nМассив не отсортирован по возрастанию.");
        }

    }
}
