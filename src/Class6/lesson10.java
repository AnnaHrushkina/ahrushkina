package Class6;
import java.util.Arrays;

public class lesson10 {
    public static void main(String[] args){
        //findNumOfWords("My name is Anna");
        String word = "badab";
        String second_word = "d  ede  dc23f 2f";
        String phone = "+38067334ff33";
        //isAnagram(word, second_word);
        //System.out.println( isPalindrome(word));
        //System.out.println(removeDigits(second_word));
        //System.out.println(removeSpaces(second_word));
        //checkPhone(phone);
    }


    public static int findNumOfWords(String sentense){
        String[] countWords= sentense.split(" ");
        System.out.println("number of word is "+ countWords.length);
        return 0;
    }

    public static boolean isPalindrome(String word){
        return word.equals(new StringBuilder(word).reverse().toString());
    }


    public static boolean isAnagram(String firstWord, String secondWord) {
        char[] word1 = firstWord.replaceAll("[\\s]", "").toCharArray();
        char[] word2 = secondWord.replaceAll("[\\s]", "").toCharArray();
        Arrays.sort(word1);
        Arrays.sort(word2);
        return Arrays.equals(word1, word2);
    }


    public static String removeDigits(String word){
        return word.replaceAll("\\d","");
    }


    public static String removeSpaces(String word){
        return word.replaceAll("\\s", "");
    }


    public static boolean checkPhone(String phone){
        String regex = "\\+380[0-9]{9}";
        if (phone.matches(regex)) {
            System.out.println("Phone is valid");
            return true;
        }
        else {
            System.out.println("Phone isn't valid");
            return false;
        }
    }

}
