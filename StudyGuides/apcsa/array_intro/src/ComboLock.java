import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;
public class ComboLock {
    private String name;
    private int[] code;
    private boolean locked = true;
    private int attempts = 10;
    private boolean attemptable = true;
    private int digits = 0;
    private String input;
    private boolean ok = true;
    private int secondsLeft = 60;
    Timer timer = new Timer();
    Timer timer2 = new Timer();
    TimerTask task = new TimerTask() {
        @Override 
        public void run() {
            System.out.println("You can now try unlocking.");
            attemptable = true;
            attempts = 10;
            secondsLeft = 60;
            unlock();
        }
    };
    TimerTask count = new TimerTask() {
        @Override 
        public void run() {
            if (secondsLeft == -1) {
                System.out.println("End of timer. Canceling Task.");
                this.cancel();
            }
            secondsLeft -= 1;
            System.out.println(secondsLeft);
        }
    };
    Scanner scan = new Scanner(System.in);

    public ComboLock (String n) {
        name = n;
        while (digits == 0)
            try {
                System.out.println("Enter number of digits: ");
                digits = Integer.parseInt(scan.nextLine());
            } catch (Exception e) {
                System.out.println("You've entered an invalid input. Enter an integer! ");
                // TODO: handle exception
            }
            code = new int[digits];
            assign();
    }
    public void assign() {
        System.out.println("Enter new code . . . ");
        for (int i = 0; i < digits; i++) {
            System.out.println("Enter number " + (i+1) + ". (Up to 10 digits)");
            input = scan.nextLine();
            code[i] = Integer.parseInt(input);
        }
        for (int i = 0; i < digits; i++) {
            System.out.print(code[i]);
        }
        System.out.println("\nLock code assigned. \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    public void unlock () {
        if (attemptable && locked) {
            System.out.println("Unlocking . . . \n\n\n");
            for (int i = 0; i < digits; i ++) {
                System.out.println("Enter " + (i+1) + "st number: ");
                input = scan.nextLine();
                if (code[i] != (Integer.parseInt(input))) {
                    ok = false;
                    System.out.println("Wrong!!!!");
                    if (attempts > 0){
                        attempts--;
                    } else {
                        attemptable = false;
                        System.out.println("Try again after 1 min.\n\n\n");
                        timer.schedule(task,60000);
                        timer2.schedule(count,0,1000);
                    }
                    ok = true;
                    unlock();
                    return;
                }
            }
            if (ok) {
                locked = false;
                System.out.println("Yay! You unlocked it!");
                System.exit(0);
            }
        }
        else {
            System.out.println("You can't try anymore, or the lock is already unlocked.");
            return;
        }
    }

}