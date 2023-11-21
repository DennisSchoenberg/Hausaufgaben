package hausaufgabe30.task1;

public class Main {
    public static void main(String[] args) {
        // Целочисленная переменная
        int integerVar = 15;
        System.out.println("Целочисленная: " + integerVar + ", " + Integer.BYTES + " байта");

        // Нецелая переменная (тип double)
        double doubleVar = 6.12;
        System.out.println("Нецелая: " + doubleVar + ", " + Double.BYTES + " байт");

        // Символьная переменная
        char charVar = 'A';
        System.out.println("Символьная: " + charVar + ", " + Character.BYTES + " байт");

        // Логическая переменная
        boolean booleanVar = true;
        System.out.println("Логическая: " + booleanVar + ", 1 байт");


    }
}



