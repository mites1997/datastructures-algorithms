package sorting;

public class InsertionSortNonIncreasing {
    public static void main(String[] args) {
        int arr[]=new int []{8,9,2,3,4};
        int sortedArr[] = doNonIncreasingInsertionSort(arr);
        for (int i = 0; i < sortedArr.length; i++) {
            System.out.println("sorted arr" + sortedArr[i]);
        }

    }

    private static int[] doNonIncreasingInsertionSort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int key = arr[i];
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

}
