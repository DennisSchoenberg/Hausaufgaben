package hausaufgabe51;

public class StringsMethods {
    public static void main(String[] args) {
        // Примеры использования методов
        String palindromeWord = "tenet";
        String nonPalindromeWord = "hello";
        String pangram = "The quick brown fox jumps over the lazy dog";
        String nonPangram = "Hello, World!";

        // Проверка на палиндром
        System.out.println(isPalindrome(palindromeWord)); // true
        System.out.println(isPalindrome(nonPalindromeWord)); // false

        // Проверка на панграмму
        System.out.println(isPangram(pangram)); // true
        System.out.println(isPangram(nonPangram)); // false
    }

    // Метод для проверки на палиндром
    public static boolean isPalindrome(String word) {
        // Убираем пробелы и приводим к нижнему регистру
        String cleanWord = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

        int length = cleanWord.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanWord.charAt(i) != cleanWord.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    // Метод для проверки на панграммы
    public static boolean isPangram(String sentence) {
        // Приводим к нижнему регистру и убираем пробелы
        String cleanSentence = sentence.replaceAll("\\s", "").toLowerCase();

        // Создаем массив для подсчета встреченных букв
        boolean[] alphabet = new boolean[26];

        for (int i = 0; i < cleanSentence.length(); i++) {
            char currentChar = cleanSentence.charAt(i);
            if (Character.isLetter(currentChar)) {
                alphabet[currentChar - 'a'] = true;
            }
        }

        // Проверяем, встретили ли все буквы
        for (boolean letter : alphabet) {
            if (!letter) {
                return false;
            }
        }
        return true;
    }
}
