package cormen;

import java.util.Arrays;

public class BinaryAddition {
    public static void main(String[] args) {
        int [] arr = addBinaryNumbers(new int[]{1,1,0},new int[]{1,1,0});
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


    }
    public static int [] addBinaryNumbers(int a[],int b[])
    {
        int n =Integer.max(a.length, b.length);
        int c[]=new int[n+1];
        int carry =0;
        for(int i=0;i<n;i++)
        {
            c[n-i-1]=(a[i]+b[i]+carry)%2;
            carry= (a[i]+b[i]+carry) /2;
        }
        c[n]=carry;
        return c;
    }
}
