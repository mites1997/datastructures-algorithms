public class Gcd {
    public static void main(String[] args) {
        System.out.println("gcd is " + calculateGcd(20, 44));
    }

    public static int calculateGcd(int a, int b) {
        if (a < 0 || b < 0)
            return -1;
        if (b == 0)
            return a;

        return calculateGcd(a, a % b);
    }

}
