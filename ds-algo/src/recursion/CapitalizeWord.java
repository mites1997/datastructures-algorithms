package recursion;

public class CapitalizeWord {

	public static void main(String[] args) {
		System.out.println(capitalizeWord("i am happy"));

	}
	public static String capitalizeWord(String word)
	{
		if(word.isEmpty())
			return word;
		char chr=word.charAt(word.length()-1);
		if(word.length()==1)
			return Character.toString(Character.toUpperCase(chr));
		if(word.substring(word.length()-2, word.length()-1).equals(" "))
			chr= Character.toUpperCase(chr);
		
		
		return capitalizeWord(word.substring(0, word.length()-1))+Character.toString(chr);
	}

}
