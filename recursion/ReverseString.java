package recursion;

public class ReverseString {
    public static void main(String[] args) {
        String string = "hello";
        String reversedString = reverseString(string);
        System.out.println("reversed string"+reversedString);
    }

    private static String reverseString(String string) {
        if(string.isEmpty())
            return string;
        else
            return reverseString(string.substring(1))+string.charAt(0);
    }
}
