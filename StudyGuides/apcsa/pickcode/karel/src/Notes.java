import java.util.*;
public class Notes {
    public static void main(String [] args){
    // You will be creating the methods below. You will call them here to test them to make sure they work properly. Try to get these ideas down on paper before typing out their code.

    //Testing #1
    System.out.print(numLetOccur("happy", "a"));
    System.out.println(numLetOccur("happy", "p"));
    System.out.print(numOccurs("happy too", "to"));
    System.out.print(numOccurs("happy too", "th"));
    System.out.println(numOccurs("happy too", "o"));
    System.out.println(findIncreaseStart("ZZYYYYYRMPLLCCA"));
    System.out.println(countVowels("tttteeeteeaoui"));
    System.out.println(eliminateVowels("eeeeeeeetototototototototototototototpppppotpwoapotaspdroausjdpkfalsdflz"));
    }

    //#1
    // #1: returns the number of occurrences of let, which is a one-character letter String
    // ex.  numLetOccur("happy", "a") returns 1
    // ex.  numLetOccur("happy", "p") returns 2
    // ex.  numLetOccur("happy", "A") returns 0
    public static int numLetOccur(String str, String let){
        int count = 0;
        int length = let.length();
        for (int i = 0; i <= str.length()-length; i++) {
            if (str.substring(i,i+length).equals(let)) {
                count += 1;
            }
        }
        return count;
    }

    // #2
    //This is a more advanced version of the previous method. The previous method looks for only a letter. This new one will look for a word. You may have an issues with out of bounds, so come up with a solution with your table to remedy this.

    // #2: returns the number of occurrences of word, which may have many characters
    // ex.  numOccurs("happy too", "to") returns 1
    // ex.  numOccurs("happy too", "th") returns 0
    // ex.  numOccurs("happy too", "o") returns 2
    // ex.  numOccurs("happy too", "Happy") returns 0

    public static int numOccurs(String str, String word){
        int count = 0;
        int length = word.length();
        for (int i = 0; i <= str.length()-length; i++) {
            if (str.substring(i,i+length).equals(word)) {
                count += 1;
            }
        }
        return count;
    }


    //#3
    // #3: returns the index where the characters in the String begin to increase (the ASCII Value increase)
    // ex.  findIncreaseStart("ZZYYYYYRMPLLCCA")  return 9 because that is the index of the first increasing char
    // ex.  findIncreaseStart("ZZYYYYYRM")  return -1 because there is no increasing char
    // ex.  findIncreaseStart("ABC")  return 1 because that is the index of the first increasing char
    // In answering this, you MUST use compareTo
    public static int findIncreaseStart(String str){
        for (int i = 1; i < str.length(); i++) {
            if (str.substring(i,i+1).compareTo(str.substring(i-1,i)) > 0) {
                return i;
            }
        }
        return -1;
    }

    //#4
    // #4: returns the number of vowels in str.  In solving this problem, you MUST use numOccur.
    // assume all lowercase letters
    public static int countVowels(String str){
        ArrayList<String> vowels = new ArrayList<>();
        int count = 0;
        vowels.add("a"); vowels.add("e"); vowels.add("i"); vowels.add("o"); vowels.add("u");
        for (int i = 0; i < 5; i++) {
            String vowel = vowels.get(i);
            int occur = numOccurs(str,vowel);
            count += occur;
        }
        return count;
    }

    //#5
    // #5: returns a String that consists of all the characters in str except the vowels
    //assume all lowercase letters 
    // #Hint you will need to create ,an empty string to add all the non-vowels to!
    // eliminateVowels("happiness")   returns "hppnss"
    public static String eliminateVowels(String str){
        ArrayList<String> vowels = new ArrayList<>();
        vowels.add("a"); vowels.add("e"); vowels.add("i"); vowels.add("o"); vowels.add("u");
        String returnstring = new String("");
        for (int i = 0; i < str.length(); i++) {
            if (!vowels.contains(str.substring(i,i+1))) {
                returnstring += str.substring(i,i+1);
            }
        }
        return returnstring;
    }

}
