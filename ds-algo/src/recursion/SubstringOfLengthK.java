package recursion;

public class SubstringOfLengthK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSubstring(new char[] { 'a', 'b', 'c' }, 2);
		
	}

	public static void findSubstring(char[] set, String prefix, int k, int n) {
		if (k == 0) {
			System.out.println(prefix);
			return;

		}
		for (int i = 0; i < n; i++) {
			String newpref = prefix + set[i];
			findSubstring(set, newpref, k - 1, n);

		}

	}

	public static void printSubstring(char[] set, int k) {
		int n = set.length;
		findSubstring(set, "", k, n);

	}

}