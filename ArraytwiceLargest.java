public class ArraytwiceLargest {

    public static void main(String[] args) {
        System.out.println("arrys index is"+dominantIndex(new int[]{3,6,1,12}));
        System.out.println("arrys sum is"+plusOne(new int[]{9}));
    }

    public static int[] plusOne(int[] digits) {

        for(int i=digits.length-1;i>=0;i--)
        {
            if(digits[i]<9)
            {
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;

    }
    public static int dominantIndex(int[] nums) {

        int largest=nums[0];
        int dominatingIndex=-1;

        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>largest) {
                largest = nums[i];
                dominatingIndex=i;
            }

        }

        for(int i=0;i<nums.length;i++)
        {

            if(largest/nums[i]>=2)
            {
                return dominatingIndex;
            }
        }


        return -1;

    }
}







