package recursion;

public class RecursiveRange {
    public static void main(String[] args) {
        int rangeSum = recursiveRange(5);
        System.out.println("range sum " + rangeSum);
    }

    public static int recursiveRange(int n) {
        if (n == 0)
            return 0;
        else
            return n + recursiveRange(n - 1);

    }
}
