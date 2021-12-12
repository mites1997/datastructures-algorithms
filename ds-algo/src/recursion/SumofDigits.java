package recursion;

public class SumofDigits {

	public static void main(String[] args) {
		SumofDigits sum = new SumofDigits();
		System.out.println("sum is----" + sum.sumDigits(12344));

	}

	public int sumDigits(int n) {
		if (n <= 0)
			return 0;

		return n % 10 + sumDigits(n / 10);

	}

}
