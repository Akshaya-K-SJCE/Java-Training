package chatApp.util;


public class Validator {

    public static boolean isValidName(String name) {
        return name != null && !name.trim().isEmpty();
    }

    public static boolean isValidEmail(String email) {
        return email != null && email.contains("@") && email.contains(".");
    }

    public static boolean isValidText(String text) {
        return text != null && !text.trim().isEmpty();
    }

    public static boolean isValidImagePath(String path) {
        return path != null && !path.trim().isEmpty();
    }
}
