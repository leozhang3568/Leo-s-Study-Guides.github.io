public class traverse {
    public static void main(String [] args) {
        String myWord = "Animaniacs";
        System.out.println(countLet(myWord,"iacs"));
        System.out.println(revString(myWord));
    }

    public static int countLet(String str, String let){ //Header/Signature
    //What do you know from this method based on this signature???
        int ans = 0;
        for (int i = 0; i < str.length()-let.length()+1; i++) {
            if (str.substring(i,i+let.length()).equals(let)) {
                ans += 1;
            }
        }
        return ans;
    }


    public static String revString(String str){
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            newStr = newStr + str.substring(str.length() - i-1,str.length()-i);
        }


        return newStr; //Placeholder Returning null, is returning nothing
    }


}