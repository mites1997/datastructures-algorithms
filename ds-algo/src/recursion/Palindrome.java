package recursion;

public class Palindrome {

	public static void main(String[] args) {
		Palindrome palindrome=new Palindrome();
		System.out.println(palindrome.isPalindrome("112"));

	}
	
	public boolean isPalindrome(String input)
	{
		if(input.length()==0||input.length()==1)
			return true;
		
		if(input.charAt(0)==input.charAt(input.length()-1))
			return isPalindrome(input.substring(1,input.length()-1));
		return false;
		
	}

}
