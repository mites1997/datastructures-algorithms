package recursion;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString rev=new ReverseString();
		System.out.println(rev.findReverse("Mites"));

	}
	
	public String findReverse(String str)
	{
		if(str.isEmpty())
			return str;
		return findReverse(str.substring(1))+str.charAt(0);
		
	}

}
