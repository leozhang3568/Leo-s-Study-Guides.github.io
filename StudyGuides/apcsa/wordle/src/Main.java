import java.util.*;
public class Main {
    public static void main (String [] args) {
        HiddenWord puzzle = new HiddenWord("PLANE");
        Scanner s = new Scanner(System.in);
        String next = s.nextLine();
        while (next != "") {
            if (puzzle.getHint(next)) {
                System.out.println("You got it!");
                break;
            }
            else {
                next = s.nextLine();
            }
        }
        s.close();

    }
}
