package recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 112;
        int sum = sumOfDigits(n);
        System.out.println("sum is " + sum);

    }

    public static int sumOfDigits(int number) {
        if (number == 0 || number<0)
            return 0;
        return number % 10 + sumOfDigits(number / 10);
    }
}
