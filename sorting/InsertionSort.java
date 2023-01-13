package sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int arr[] = new int[]{6, 2, 4, 7};
        int[] sortedArr = insertionSort(arr);
        for (int i = 0; i < sortedArr.length; i++) {
            System.out.println("sorted arr" + sortedArr[i]);
        }
    }

    private static int[] insertionSort(int[] arr) {

        for (int i = 1; i < arr.length - 1; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j > 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[i + 1] = key;
        }
        return arr;
    }

}
