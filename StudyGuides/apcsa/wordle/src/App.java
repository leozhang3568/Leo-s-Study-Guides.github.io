import java.util.Scanner;
import java.io.IOException;
import java.nio.file.*;
import java.util.stream.*;
import java.util.random.*;

public class App {
    public static void main(String[] args) throws Exception {
        String filepath = "src/words.txt";
        System.out.println("Welcome to the word guessing game!");
        int line = ((int) ((5757) * (Math.random()))) + 1;
        String word = "";
        try (Stream<String> lines = Files.lines(Paths.get(filepath))) {
            word = lines.skip(line)
                        .findFirst()
                        .orElse("Line does not exist.");
        } catch (IOException e) {
            e.printStackTrace();
        }
        word = word.toUpperCase();
        guess(word);
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
                System.out.println(word);
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
