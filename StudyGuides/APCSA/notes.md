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

Use **camelCase** when naming a variable.S
