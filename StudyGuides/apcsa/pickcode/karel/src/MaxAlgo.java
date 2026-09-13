import java.util.Scanner; //Import a scanner that we're going to use


//Do not run the code. Replace all the ?? comments with descriptions on what each line is doing.
public class MaxAlgo{ 
    //static is necessary, ignore that for now.
    static int num =0; //??
    static int max = Integer.MIN_VALUE;  //?? 
    
    

    public static void main(String[] args) {
        
        askMax();// calls askMax

    }

    public static void askMax(){
        while(num!=962024)
        { // runs as long as the condition is true.
            Scanner sc = new Scanner(System.in); //makes scanner
            System.out.println("Enter a integer, type 962024 to end the loop");

            //This is brand new and doesn't show up on the AP test. 
            try{ //Does whatever's inside
                num = sc.nextInt();
            }

            catch(Exception e){ //Does  this if there's an error
                System.out.println("That is not a valid input.");
            } 
            // After you've run the code a few times, comment the everything from the try catch block except "num = sc.nextInt()" then put a bunch of different type of inputs into the system.

            if(num>max){ // conditional about if num > max.
                max = num; //??
                System.out.println("The new max is "+max + "\n\n");  //\n extra spacing with newline
            }
            else{
                System.out.println(num + " is not larger than the old max of " + max + "\n\n");
                //After you've ran the code, come back here and uncomment the line below and re-run the code.
                break; // breaks out of the while loop
            }
            
        }// What does this close? While loop closes
       

    }

}




















OOOOOOgaaaBooogaBoooga   nice try running this code. Comment this line out when you've commented all the ?? out. to test the code
//When you finally run the code try a bunch of inputs, such as strings, doubles, booleans and see what happens in the code.