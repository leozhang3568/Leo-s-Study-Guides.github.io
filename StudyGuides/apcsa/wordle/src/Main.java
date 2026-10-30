import java.util.*;
public class Main {
    public static void main (String [] args) {
        int score1 = 0; int score2 = 0;
        System.out.println("Two player, guess word. Enter capital letters only. A + means your letter is in the word but in the wrong place, and a * means that your letter is not in the word at all. Happy playing!");
        int whichplayer = 1;
        Scanner player = new Scanner(System.in);
        String playagain = "YES";
        while (playagain.equals("YES")) {
            System.out.println("Player " + whichplayer + ", enter your word: ");

            String word = player.nextLine();
            for (int i = 0; i < 100; i++) {
                System.out.println("\n");
            }
            System.out.println("Player " + ((whichplayer) % 2+1) + ", start guessing.");
            if (((whichplayer) % 2 + 1) == 1) {
                score1 += guess(word);
            }
            else {
                score2 += guess(word);
            }
            whichplayer = (whichplayer) % 2+1;
            System.out.println("Keep playing? (YES/NO)");
            playagain = player.nextLine();
        }
        System.out.println("Player 1, your score was " + score1 + ".");
        System.out.println("Player 2, your score was " + score2 + ".");
        if (score1 > score2) {
            System.out.println("Player 1 wins!!!");
        }
        else if (score1 < score2) {
            System.out.println("Player 2 wins!!!");
        }
        else {
            System.out.println("TIE.");
        }
        player.close();

    }

    public static int guess (String word) {
        int guesses = 6;
        HiddenWord puzzle = new HiddenWord(word);
        Scanner s = new Scanner(System.in);
        System.out.println("Guess your word here. The word is " + word.length() + " letters long. Only type in capital letters.");
        String next = s.nextLine();
        boolean answer;
        while (next != "") {
            if (guesses <= 0) {
                System.out.println("You have run out of guesses. :(");
                return 0;
            }
            guesses --;
            answer = puzzle.getHint(next);
            if (answer) {
                System.out.println("You got it!");
                return 1;
            }
            else {
                System.out.println("");
                next = s.nextLine();
            }
        }
        s.close();
        return 1;

    }
}
