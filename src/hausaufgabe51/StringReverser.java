package hausaufgabe51;

public class StringReverser {
    public static void main(String[] args) {
        String text = "I love my Planet !!!";
        String reversedText = reverse(text);
        String wordReversedText = wordReverse(text);

        System.out.println("Original Text: " + text);
        System.out.println("Reversed Text: " + reversedText);
        System.out.println("Word-Reversed Text: " + wordReversedText);
    }

    // Метод для разворота всей строки
    public static String reverse(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    // Метод с использованием звездочки: разворот порядка слов
    public static String wordReverse(String text) {
        String[] words = text.split("\\s+");
        StringBuilder reversedText = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedText.append(words[i]).append(" ");
        }

        return reversedText.toString().trim(); // Убираем лишний пробел в конце
    }
}
