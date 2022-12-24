package recursion;

public class FirstUpperCase {
    public static void main(String[] args) {
        char convertedUpperCase = firstUpperCase("heLlo");
        System.out.println("Converted upper case letter"+convertedUpperCase);
    }

    private static char firstUpperCase(String string) {
        if (string.length() == 0)
            return ' ';
        else if (Character.isUpperCase(string.charAt(0))) {
            return string.charAt(0);
        }
        else {
            return firstUpperCase(string.substring(1));
        }

    }
}
