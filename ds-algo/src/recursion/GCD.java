package recursion;

public class GCD {

	public static void main(String[] args) {
		GCD gcd=new GCD();
		System.out.println(gcd.calculategcd(3, 36));

	}

	public int calculategcd(int a, int b) {

		if (a == 0)
			return b;
		if (b == 0)
			return a;
		if(a<0||b<0)
			return -1;
		
		return calculategcd(b, a % b);
	}

}
