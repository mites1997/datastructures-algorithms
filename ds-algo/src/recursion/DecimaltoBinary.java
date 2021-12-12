package recursion;

public class DecimaltoBinary {

	public static void main(String[] args) {
		DecimaltoBinary dbinary = new DecimaltoBinary();
		System.out.println(dbinary.calculatebinary(13));

	}

	public int calculatebinary(int n) {
		if (n == 0)
			return 0;

		return n % 2 + 10 * calculatebinary(n / 2);

	}

}