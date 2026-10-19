public class HiddenWord {
    private String answer;
    private int len;
    private String check = "";
    private boolean yes;
    public HiddenWord(String n) {
        answer = n;
        len = n.length();
    }    
    public boolean getHint(String n) {
        for (int i = 0; i < len; i++) {
            if (n.substring(i,i+1).equals(answer.substring(i,i+1))) {
                check += answer.substring(i,i+1);
            }
            else if (answer.indexOf(n.substring(i,i+1)) != -1) {
                check += "+";
            }
            else {
                check += "*";
            }
        }

        System.out.println(check);
        if (check == answer) {
            yes = true;
        }
        check = "";
        if (yes) {
            return true;
        }
        return false;

    }
}