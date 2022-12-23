package recursion;

public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println("binary is " + convertToBinary(25));
    }

    public static int convertToBinary(int n) {

        if (n == 0) {
            return 0;
        }
        return n % 2 + 10 * convertToBinary(n / 2);
    }

}

