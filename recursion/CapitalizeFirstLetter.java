package recursion;

public class CapitalizeFirstLetter {
    public static void main(String[] args) {

        String capitalizedWord = capitalizeWord("i like java");
        System.out.println("capitalized word"+capitalizedWord);

    }

    private static String capitalizeWord(String word) {
        if(word.isEmpty()) {
            return word;
        }
        char chr = word.charAt(word.length()-1);
        if(word.length()==1) {
            return Character.toString(Character.toUpperCase(chr));
        }
        if((word.charAt(word.length() - 2) == ' ')) {
            chr = Character.toUpperCase(chr);
        }
        return capitalizeWord(word.substring(0,word.length()-1))+ chr;
    }

}
