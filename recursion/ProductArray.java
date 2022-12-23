package recursion;

public class ProductArray {
    public static void main(String[] args) {
        int arr[]= new int []{1,2,3,4,5};
        int result = productofAnArray(arr, arr.length);
        System.out.println(result);

    }
    public static int productofAnArray(int arr[], int n)
    {
        if(n==0)
            return 1;
        return productofAnArray(arr,n-1)*arr[n-1];

    }
}




