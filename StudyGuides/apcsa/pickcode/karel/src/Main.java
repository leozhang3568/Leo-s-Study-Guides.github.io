import java.util.Scanner;

public class Main {
    public static void main(String [] args) {

//Uncomment each of these print statements one at a time to test your code. Once you get it to work, recomment the print statement and move on to the next one.

        System.out.println("Problem #1: " + countByTens());
        System.out.println("Problem #2: " + divideByNine());
        System.out.println("Problem #3: " + twoStepsForward());
        System.out.println("Problem #4: " + halfPlusOne(52.10));
        System.out.println("Problem #5: " + lotsOfMath());
        specialSequence(1,20); //Change this to check your methods.
        System.out.print("Problem #7: "); negPosCheck(3); //Change that value to check for each case.
        System.out.println("Problem #8: " + slopeInt(2,3,10));
        System.out.println("Problem #9: " + myIntMathProblem(8));


    }
    //1. Create a method that counts by 10s that starts at an initial value of -5 and uses a loop to count by 10s 20 times. 
    public static int countByTens(){
        int val = -5;
        System.out.println(val);
        for (int i = 0; i < 20; i++) {
            val += 10;
            System.out.println(val);
        }
        return val;//note: this is a placeholder. You will have to make changes to this value in order to get the correct returned value!
    }
    //2. Create a method that makes an initial value of x=-20.5, divides this value by 9, and then adds it to the last value of x 5 times. For loop must be used 
    public static double divideByNine(){
        double val = -20.5;
        val /= 9;
        for (int i = 0; i < 5; i++) {
            val += val;
        }
        return val;
    }

    //3. Create a method that alternates adding 2 to an initial value of 0, but the next time subtracts 3. In other words, your individual outputs should be 2, -1, 1, -2, etc. Do this 100 times. (Hint: How can we use % to help us alternate between numbers)
    public static int twoStepsForward(){
        int val = 0;
        for (int i = 0; i < 50; i++) {
            val += 2;
            System.out.println(val);
            val -= 3;
            System.out.println(val);
        }
        return val;
    }

    //4. Create a method that takes a double parameter, divides by 2, and then adds 1 to the answer. Do this 4 times. You should get decimal values at the end of this problem (so, what kind of a variable should I create?)

    public static double halfPlusOne(double val){
        for (int i = 0; i < 4; i++) {
            val /= 2;
            val += 1;
        }
        return val;
    }

    //5. Create a method that takes an initial value of -10; squares the value; adds half of the answer to the total; then takes the square root of the answer and adds it to the last value of x (hint: Google how to find the square root of a value in Java! "Hint" Use the MATH Class!)

    public static double lotsOfMath(){
        double val = -10;
        val *= val;
        val += val/2;
        val += Math.sqrt(val);
        return val;
    }

    //6. Write a method called specialSequence. This method should have 2 int parameters, start and end. Write a for loop that will print out every number not divisible by 3 from start and end, including end. (If they don't give you a valid range, print the message "Invalid range" )
    //The message should look like "Here are numbers not divisble by 3: _____ ______ _____ ____" //space must be added after each number

    public static void specialSequence(int s, int e){
        if (e < s) {
            System.out.println("Invalid Range");
            return;
        }
        System.out.print("Here are numbers not divisible by 3: ");
        for (int i = s; i <= e; i ++) {
            if ((i % 3)!= 0) {
                System.out.print(i + " ");
            }
        }

    }

    //7.
    //Write a method called negPosCheck() that will take in 1 int parameter n
    //If n is positive, your code will run a for loop prints numbers from 0 to n
    //If n is negative. Your code will will print n/2
    //If n is 0. it will print "zero!";
    public static void negPosCheck(int n){
        if (n > 0) {
            for (int i = 0; i <= n; i ++) {
                System.out.println(i);
            }
        }
        if (n < 0) {
            System.out.println((double) n / 2);
        }
        else {
            System.out.println("Zero!");
        }
    }

    //8. Given the the equation y= mx+b, write an equation that will take in 3 double parameters: an m, x, and yIntercept value. It will then print out "Your equation is ______________" (example y=4x+5.3) depending on what is put in. Then it will print out "If x = ____, y =_____" and have it calculate the value of y and return it.
    public static double slopeInt(double m, double x, double yIntercept){
        System.out.println("Your equation is y = " + m + "x + " + yIntercept);
        System.out.println("If x = " + x + ", y = " + (m*x + yIntercept));
        return (m*x + yIntercept);
    }


    //9. Create your own scenario for a method that takes an int parameter, uses a loop to do some math, and then returns the value. 
    //State what your method does, be creative.
    // Instructions for writing this method: 

    public static int myIntMathProblem(int p){
        int ans = 1;
        for (int i = 1; i < p; i++) {
            ans *= i;
        }
        return ans;  
    }



}
