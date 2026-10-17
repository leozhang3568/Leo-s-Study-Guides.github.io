public class Sandwich {
    public static String getSandwich(String str) {
        int start = -1; int end = -1;
        for (int i = 0; i < str.length()-4; i++) {
            if (str.substring(i,i+5).equals("bread")) {
            start = i;
            break;
            }
        }
        for (int i = str.length()-5; i >= 0; i-=1) {
            if ((str.substring(i,i+5).equals("bread")) & (start != -1)) {
            end = i;
            break;
            }
        }
        if (start > -1 & end > -1) {
            return str.substring(start+5,end);
        }
        return "";
    }
    public static void main (String[] args) {
        System.out.println(getSandwich("breadjambread"));
    }
}