package cormen;

import java.util.Arrays;

public class BinaryAddition {
    public static void main(String[] args) {
        int[] arr = addBinaryNumbers(new int[]{1, 0, 1}, new int[]{0, 0, 1});
        System.out.println(Arrays.toString(arr));
    }

    public static int[] addBinaryNumbers(int a[], int b[]) {
        int n = Integer.max(a.length, b.length);
        int c[] = new int[n + 1];
        int j = n;
        int carry = 0;
        for (int i = n-1; i >=0; i--) {
            c[j] = (a[i] + b[i] + carry) % 2;
            carry = (a[i] + b[i] + carry) / 2;
            j--;
        }
            c[j] = carry;
        return c;
    }
}
