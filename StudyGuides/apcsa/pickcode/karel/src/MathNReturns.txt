import java.util.Scanner;
import java.util.Arrays;

public class MathNReturns {
    public static void calculateSlope(double x1, double y1, double x2, double y2) {
        System.out.println("The slope between these points is " + ((y2-y1)+"/"+(x2-x1))+".");
    }
    public static void findY (double m, double x, double yint) {
        System.out.println("The y value is: " + (yint+m*x));
    }
    public static void distanceForm (int x1, int y1, int x2, int y2) {
        System.out.print("The distance between (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") is ");
        System.out.printf("%.2f.%n",(Math.hypot((y2-y1),(x2-x1))));
    }
    public static void main(String [] args) {
        
        //Write a method called calculateSlope, that will print out the slope based on coordinates. Format it so the slope prints out "7.0/3.3" in that format.
        //Using (10,3)(5,2) -> -1.0/-5.0 is what should be printed.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x1: ");
        int x1 = scanner.nextInt();
        System.out.print("Enter y1: ");
        int y1 = scanner.nextInt();
        System.out.print("Enter x2: ");
        int x2 = scanner.nextInt();
        System.out.print("Enter y2: ");
        int y2 = scanner.nextInt();


        calculateSlope(x1,y1,x2,y2); //uncomment to check

        //Write a method called findY that will take in a slope, y-intercept, and x coordinate that will print out the y value. "The y value is : _____"
        //If the slope was 2,x was 3, and yintercept was 5  -> y should print out 11.0
        findY(2,3,5); //uncomment to check


        //Write a method name distanceForm() that will  calculate the distance of 2 points as a double. It will print out a message that says " The distance between _____"
        //distnace between (10,3) (5,2) ->5.0991

        distanceForm(10,3,5,2); //uncomment to check.

        //Use Math.pow(base,exp) and Math.sqrt(value) to help you with your answer.
    }
    

}
