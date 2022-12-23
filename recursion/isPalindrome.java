package recursion;

public class isPalindrome {
    public static void main(String[] args) {
        String string = "oyo";
        boolean result = checkPalindrome(string);
        System.out.println("the string is palindrome" + result);
    }

    private static boolean checkPalindrome(String string) {
        if (string.length() == 0 || string.length() == 1)
            return true;
        if (string.charAt(0) == string.charAt(string.length() - 1))
            return checkPalindrome(string.substring(1,string.length()-1));
        else
            return false;
    }

}
