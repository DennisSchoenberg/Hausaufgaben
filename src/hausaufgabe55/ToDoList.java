package hausaufgabe55;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> tasks = new HashMap<>();

        while (true) {
            System.out.print("Введите дело (или 'конец' для завершения ввода): ");
            String task = scanner.nextLine();

            if (task.equalsIgnoreCase("конец") || task.equalsIgnoreCase("end")) {
                break;
            }

            System.out.print("Введите время на выполнение (в минутах): ");
            int time = scanner.nextInt();
            scanner.nextLine(); // Чтобы считать символ новой строки после числа

            tasks.put(task, time);
        }

        System.out.println("\nСписок дел:");

        for (Map.Entry<String, Integer> entry : tasks.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " минут");
        }

        int totalTime = tasks.values().stream().mapToInt(Integer::intValue).sum();
        System.out.println("\nВсего дел: " + tasks.size());
        System.out.println("Общее время на все дела: " + totalTime + " минут");
    }
}
