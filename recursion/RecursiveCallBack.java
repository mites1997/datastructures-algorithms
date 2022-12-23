package recursion;

import java.util.Arrays;

public class RecursiveCallBack {
    public static void main(String[] args) {
        OddFunction oddFunction = new OddFunction();
        System.out.println("result" + someRecursive(new int[]{1, 2, 3, 4, 5}, oddFunction));
    }

    public static boolean someRecursive(int[] arr, OddFunction odd) {
        if (arr.length == 0) {
            return false;
        } else if (odd.run(arr[0]) == false) {
            return someRecursive(Arrays.copyOfRange(arr, 1, arr.length), odd);
        } else {
            return true;
        }
    }
}
