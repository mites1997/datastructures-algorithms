public class PowerOfNumber {
    public static void main(String[] args) {
        System.out.println("power is "+power(2,5));

    }
    public static int power(int number , int exponent)
    {
        if(exponent==0)
            return 1;
        if(exponent<0)
            return -1;
        return number*power(number,exponent-1);
    }
}
