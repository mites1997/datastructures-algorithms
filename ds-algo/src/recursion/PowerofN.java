package recursion;

public class PowerofN {

	public static void main(String[] args) {
		PowerofN pow=new PowerofN();
		System.out.println(pow.power(2, 4));

	}

	public int power(int base, int exp) {

		if (exp == 0)
			return 1;
		if (exp == 1)
			return base;

		return base * power(base, exp - 1);
	}

}
