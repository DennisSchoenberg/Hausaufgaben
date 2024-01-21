package hausaufgabe51.task07;

public class CamelCaseConverter {
    public static void main(String[] args) {
        String inputText = "What a f...g BEAUTIFUL day!";
        String camelCaseText = toCamelCase(inputText);

        System.out.println("Original Text: " + inputText);
        System.out.println("CamelCase Text: " + camelCaseText);
    }

    public static String toCamelCase(String text) {
        // Убираем знаки препинания и лишние пробелы
        String cleanText = text.replaceAll("[^a-zA-Z0-9]+", " ").trim();

        // Разделяем слова по пробелам
        String[] words = cleanText.split("\\s+");

        // Преобразуем в lowerCamelCase
        StringBuilder camelCaseText = new StringBuilder(words[0].toLowerCase());
        for (int i = 1; i < words.length; i++) {
            String word = words[i];
            camelCaseText.append(word.substring(0, 1).toUpperCase())
                    .append(word.substring(1).toLowerCase());
        }

        return camelCaseText.toString();
    }
}
