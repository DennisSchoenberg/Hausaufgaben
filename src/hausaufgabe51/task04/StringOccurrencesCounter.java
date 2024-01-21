package hausaufgabe51.task04;

public class StringOccurrencesCounter {
    public static void main(String[] args) {
        String text = "Welcome to my World!";
        char letterToCount = 'W';

        int occurrences = countOccurrences(text, letterToCount);

        System.out.println("Occurrences of '" + letterToCount + "' in the text: " + occurrences);
    }

    public static int countOccurrences(String text, char letter) {
        // Проверка на null или пустую строку
        if (text == null || text.isEmpty()) {
            return 0;
        }

        int count = 0;
        for (char currentChar : text.toCharArray()) {
            if (currentChar == letter) {
                count++;
            }
        }

        return count;
    }
}
