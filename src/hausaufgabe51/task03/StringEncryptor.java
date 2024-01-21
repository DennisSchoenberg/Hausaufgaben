package hausaufgabe51.task03;

public class StringEncryptor {
    public static void main(String[] args) {
        String originalText = "Hello, World!";
        String encryptedText = encrypt(originalText);
        String decryptedText = decrypt(encryptedText);

        System.out.println("Original Text: " + originalText);
        System.out.println("Encrypted Text: " + encryptedText);
        System.out.println("Decrypted Text: " + decryptedText);
    }

    public static String encrypt(String text) {
        char[] chars = text.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char currentChar = chars[i];

            if (Character.isLetter(currentChar)) {
                // Определение верхнего или нижнего регистра
                boolean isUpperCase = Character.isUpperCase(currentChar);

                // Сдвиг на 3 вперед по алфавиту
                int shiftedChar = (currentChar - 'A' + 3) % 26 + 'A';

                if (!isUpperCase) {
                    shiftedChar += 32; // Если буква в нижнем регистре, добавляем 32
                }

                chars[i] = (char) shiftedChar;
            }
        }

        return new String(chars);
    }

    public static String decrypt(String data) {
        char[] chars = data.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char currentChar = chars[i];

            if (Character.isLetter(currentChar)) {
                // Определение верхнего или нижнего регистра
                boolean isUpperCase = Character.isUpperCase(currentChar);

                // Сдвиг на 3 назад по алфавиту для расшифровки
                int shiftedChar = (currentChar - 'A' - 3 + 26) % 26 + 'A';

                if (!isUpperCase) {
                    shiftedChar += 32; // Если буква в нижнем регистре, добавляем 32
                }

                chars[i] = (char) shiftedChar;
            }
        }

        return new String(chars);
    }
}