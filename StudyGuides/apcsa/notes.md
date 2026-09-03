---
title: AP CSA Notes
---

# AP CSA Notes

## Setup

```java
public class Main {
    public static void main(String [] args) {
        System.out.println("Hello World!");
        System.out.println("Leo");
    }
}
```

`ln` places a `\n` after the end of the string.


## Importing

Use `import package.subpackage.ClassName;` to import packages.
Use `import package.subpackage.*` to import all classes and interfaces inside the sub package (DOES NOT) import any deeper subpackage classes.

---

```java
import static package.subpackage.ClassName.staticMember;
import static package.subpackage.ClassName.*;
```
With this, no need to type prefixes like `Math.PI`.

## Karel/Library Syntax

```java

    Robot karel = new Robot(5,1,East,9);
    \\"karel" is at (5,1), facing East, 9 px.
    World.setVisible(true);
    World.setSize(10,10);
    World.setDelay(100);

```

`()` denote **methods** or **functions**. `karel` is an **object**.

## Methods

To make new methods, make sure that they are related outside of a method and inside of the class. Use the format `______methodName____(____Parameter/input___){}`.

```java

public static void turnRight(robot r){
\\ the data type should be specified to prevent crashing.
    
}

```


## Data Types

Used to tell the computer what classification the variable is.

### Primitive Data Types

Simple data types

- int
- double (decimals)
- boolean
- char (character)

### Objects

Objects can perform methods.

- string

Use 

```java
int num;
```
to declare a variable called "num" that has data type 'int'.

Use **camelCase** when naming a variable.

### Formatting

```java
system.out.println("The temperature is " + temperature)
```

## Math

### Remainder vs. Mod

Remainder truncates toward zero. Modulo truncates toward negative infinity.

### Math and Notes

```java

public class MathNReturns {
    public static void calculateSlope(double x1, double y1, double x2, double y2) {
        System.out.println((y2-y1)+"/"+(x2-x1));
    }
    public static void findY (double m, double x, double yint) {
        System.out.println("The y value is: " + (yint+m*x));
    }
    public static void distanceForm (int x1, int y1, int x2, int y2) {
        System.out.println("The distance between (" + x1 + "," + y1 + ") and (" + x1 + "," + y1 + ") is " + Math.pow((Math.pow((y2-y1),2)+Math.pow((x2-x1),2)),0.5)+".");
    }
    public static void main(String [] args) {
        
        //Write a method called calculateSlope, that will print out the slope based on coordinates. Format it so the slope prints out "7.0/3.3" in that format.
        //Using (10,3)(5,2) -> -1.0/-5.0 is what should be printed.

        calculateSlope(10,3,5,2); //uncomment to check

        //Write a method called findY that will take in a slope, y-intercept, and x coordinate that will print out the y value. "The y value is : _____"
        //If the slope was 2,x was 3, and yintercept was 5  -> y should print out 11.0
        findY(2,3,5); //uncomment to check


        //Write a method name distanceForm() that will  calculate the distance of 2 points as a double. It will print out a message that says " The distance between _____"
        //distnace between (10,3) (5,2) ->5.0991

        distanceForm(10,3,5,2); //uncomment to check.

        //Use Math.pow(base,exp) and Math.sqrt(value) to help you with your answer.
    }
    

}
```