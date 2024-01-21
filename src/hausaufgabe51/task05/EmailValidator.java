package hausaufgabe51.task05;

import java.util.regex.Pattern;

public class EmailValidator {
    public static void main(String[] args) {
        String email1 = "user@example.com";
        String email2 = "invalid.email";
        String email3 = "Johnson.B@gmx.de";
        String email4 = "Yosh.KarAjLa.Bu_l-dozer@yahoo.de";

        System.out.println("Is email1 a valid email? " + isEmail(email1)); // true
        System.out.println("Is email2 a valid email? " + isEmail(email2)); // false
        System.out.println("Is email3 a valid email? " + isEmail(email3)); // true
        System.out.println("Is email4 a valid email? " + isEmail(email4)); // true
    }

    public static boolean isEmail(String text) {
        if (text == null || text.isEmpty()) {
            return false;
        }

        // Регулярное выражение для проверки формата email
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);

        return pattern.matcher(text).matches();
    }
}
