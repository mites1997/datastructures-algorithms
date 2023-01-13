package searching;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5};
        int key = 5;
        int index = performLinerSearch(arr, key);
        if (index == -1) {
            System.out.println("The key is not found");
        }
        System.out.println("The key is found at index " + index);

    }

    private static int performLinerSearch(int[] arr, int key) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                index = i;
            else
                index = -1;

        }
        return index;
    }





}
