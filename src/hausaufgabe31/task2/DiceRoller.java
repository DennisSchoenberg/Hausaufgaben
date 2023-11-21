package hausaufgabe31.task2;

import java.util.Random;
import java.util.Scanner;

public class DiceRoller {

    public static void main(String[] args) {
        // Создаем объект Scanner для считывания ввода пользователя
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя количество костей
        System.out.print("Сколько костей вы хотите выкинуть? ");
        int numberOfDice = scanner.nextInt();

        // Закрываем Scanner после использования
        scanner.close();

        // Проверяем количество костей и выполняем соответствующее действие
        if (numberOfDice == 1 || numberOfDice == 2) {
            // Кидаем кости
            rollDice(numberOfDice);
        } else {
            // Выводим сообщение, что такого количества костей нет
            System.out.println("Извините, у нас нет такого количества костей.");
        }
    }

    // Метод для "выкидывания" костей
    private static void rollDice(int numberOfDice) {
        Random random = new Random();

        // Выводим результаты броска
        System.out.print("Результаты броска: ");
        for (int i = 0; i < numberOfDice; i++) {
            int diceValue = random.nextInt(6) + 1; // Генерируем случайное число от 1 до 6
            System.out.print(diceValue + " ");
        }
    }
}

