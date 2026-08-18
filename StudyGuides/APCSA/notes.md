---
title: AP CSA Notes
---

# AP CSA Notes - 8/17/2026

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

    Robot karel = new Robot(5,1,East,9); \\"karel" is at (5,1), facing East, 9 px.
    World.setVisible(true);
    World.setSize(10,10);
    World.setDelay(100);

```

`()` denote **methods** or **functions**. `karel` is an **object**.
