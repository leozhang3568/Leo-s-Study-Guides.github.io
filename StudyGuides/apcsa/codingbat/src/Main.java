public class Main {
    public static void main(String [] args) {
        System.out.println("rollDice: " + rollDice());
        System.out.print("takeDamage: ");
        takeDamage();
        System.out.print("openChest: ");
        openChest();
        System.out.print("encrypt: ");
        encrypt();
        // test the methods in the main. Use a for loop that runs 10 times for each method call to check that it works properly.
    }
    public static int rollDice() {
        return (int)(6*Math.random()) + 1;
    }

    public static int takeDamage() {
        int damage = (int) (21*Math.random() + 10);
        System.out.println("You took " + damage + " before returning.");
        return damage;
    }

    public static boolean openChest() {
        int chest = (int) (2*Math.random());
        if (chest == 1) { System.out.println("Success"); return true; } else { System.out.println("Unsuccessful"); return false; }
    }

    public static int encrypt() {
        int num = (int) (1000000*Math.random() + 1000000);
        System.out.println(num);
        return num;
    }

        
            //Write a method for each example.
        //#1 int rollDice() Prints a number 1-6 and returns it.
        // 1. Print a random roll of a 6-sided dice (i.e. numbers 1 - 6). 

        //#2 int takeDamage() returns number between 10-30 including 30. Prints a message saying you took ____ amount of damage before returning.
        // 2. Print a random integer between 10 - 30 (inclusive) that
        // represents the points deducted when hit in a video game

        // int openChest() will print a message saying if successful or not. then return the number.
        // 3. Print a random 0 or 1 that determines if a game character
        // successfully opens a treasure chest (1 = success)

        // int encrypt() prints and returns random num from 1,000,000 inclusive to 2,000,000 not including 2,000,000
        // 4. Print a random integer from 1,000,000 (inclusive) up to 
        // but not including 2,000,000 to use as an encryption key.   
}
