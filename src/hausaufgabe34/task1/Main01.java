package hausaufgabe34.task1;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название месяца:");
        String month = scanner.nextLine();

        String season = getSeason(month);

        System.out.println("Сезон: " + season);
    }

    public static String getSeason(String month) {
        String season;

        switch (month) {
            case "январь":
            case "февраль":
            case "декабрь":
                season = "зима";
                break;
            case "март":
            case "апрель":
            case "май":
                season = "весна";
                break;
            case "июнь":
            case "июль":
            case "август":
                season = "лето";
                break;
            case "сентябрь":
            case "октябрь":
            case "ноябрь":
                season = "осень";
                break;
            default:
                season = "неверное название месяца";
        }

        return season;
    }
}
