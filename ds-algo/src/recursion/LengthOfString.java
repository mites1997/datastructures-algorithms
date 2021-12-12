package recursion;

public class LengthOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Length of String is "+calculateLength("Mites"));
		
	}
	public static int calculateLength(String stringinp) {
		if(stringinp.length()==0)
			return 0;
		
		
		return 1+calculateLength(stringinp.substring(1));
		
	}

}
