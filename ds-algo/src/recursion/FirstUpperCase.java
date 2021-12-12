package recursion;

public class FirstUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(FirstUpperCase.first("Mites"));
	}
	
	public static char first(String str)
	{
		if(str.length()==0)
			return ' ';
		else if(Character.isUpperCase(str.charAt(0)))
			return str.charAt(0);
		
		return first(str.substring(1, str.length()));
		
	}

}
