package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int a[] = new int[]{1,9,0,2};
        System.out.println("arr is"+ Arrays.toString(sortArray(a)));

    }

    public static int[] sortArray(int[] a) {
        int n = a.length;

        for (int i = 0; i < n-1 ; i++) {
            int min_index =i;

            for (int j = i+1 ; j<n; j++ )
            {
                if(a[j]<a[min_index])
                    min_index = j;
            }
            int temp = a[min_index];
            a[min_index]=a[i];
            a[i]=temp;
        }
        return a;
    }
}
