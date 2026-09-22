---
title: AP CSA Notes
---
<style>
    a {
        color: green;
    }
    a:hover {
        color: lightgreen;
    }
</style>

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

Methods can also have data types that the method returns.

## Methods + Variables Concepts

**scope**: The region of the program where a variable is accessable.

**instance variable**: An instance variable is a variable created as a non-static variable. It is created outside of any methods, but inside the class.

## Strings

string literal vs string class

### String Literal

```java
String state = "Maine";
```

### String Constructor

```java
String state = new String("Maine");
```

### Concatenation

appending a string to the end of another.

```java
mystring = mystring.concat("something else");
```

Strings are **immutable**, so they create a new one with String methods. This does not replace the original reference. Therefore, point it back to the original string so that the version from before is automatically discarded.

`+=` and `+` can be used to concatenate strings.

### String Methods

#### Comparators

```java
s1.compareTo(s2);
```

s2 after s1 returns negative

s2 before s1 returns positive

equal returns 0.

##### ASCLL Table for Comparing

<br />
<table class="mini-table" id="miniTable">
          <thead>
            <tr>
              <th>Dec</th><th>Chr</th>
              <th class="spacer-th"></th>
              <th>Dec</th><th>Chr</th>
              <th class="spacer-th"></th>
              <th>Dec</th><th>Chr</th>
              <th class="spacer-th"></th>
              <th>Dec</th><th>Chr</th>
              <th class="spacer-th"></th>
              <th>Dec</th><th>Chr</th>
            </tr>
          </thead>
          <tbody id="miniTableBody">
            <tr class="even-row">
              <td class="dec-col">0</td><td class="control-col">NUL</td><td class="spacer-col"></td>
              <td class="dec-col">26</td><td class="control-col">SUB</td><td class="spacer-col"></td>
              <td class="dec-col">52</td><td class="char-col">4</td><td class="spacer-col"></td>
              <td class="dec-col">78</td><td class="char-col">N</td><td class="spacer-col"></td>
              <td class="dec-col">104</td><td class="char-col">h</td>
            </tr>
            <tr class="odd-row">
              <td class="dec-col">1</td><td class="control-col">SOH</td><td class="spacer-col"></td>
              <td class="dec-col">27</td><td class="control-col">ESC</td><td class="spacer-col"></td>
              <td class="dec-col">53</td><td class="char-col">5</td><td class="spacer-col"></td>
              <td class="dec-col">79</td><td class="char-col">O</td><td class="spacer-col"></td>
              <td class="dec-col">105</td><td class="char-col">i</td>
            </tr>
            <tr class="even-row">
              <td class="dec-col">2</td><td class="control-col">STX</td><td class="spacer-col"></td>
              <td class="dec-col">28</td><td class="control-col">FS</td><td class="spacer-col"></td>
              <td class="dec-col">54</td><td class="char-col">6</td><td class="spacer-col"></td>
              <td class="dec-col">80</td><td class="char-col">P</td><td class="spacer-col"></td>
              <td class="dec-col">106</td><td class="char-col">j</td>
            </tr>
            <tr class="odd-row">
              <td class="dec-col">3</td><td class="control-col">ETX</td><td class="spacer-col"></td>
              <td class="dec-col">29</td><td class="control-col">GS</td><td class="spacer-col"></td>
              <td class="dec-col">55</td><td class="char-col">7</td><td class="spacer-col"></td>
              <td class="dec-col">81</td><td class="char-col">Q</td><td class="spacer-col"></td>
              <td class="dec-col">107</td><td class="char-col">k</td>
            </tr>
            <tr class="even-row">
              <td class="dec-col">4</td><td class="control-col">EOT</td><td class="spacer-col"></td>
              <td class="dec-col">30</td><td class="control-col">RS</td><td class="spacer-col"></td>
              <td class="dec-col">56</td><td class="char-col">8</td><td class="spacer-col"></td>
              <td class="dec-col">82</td><td class="char-col">R</td><td class="spacer-col"></td>
              <td class="dec-col">108</td><td class="char-col">l</td>
            </tr>
            <tr class="odd-row">
              <td class="dec-col">5</td><td class="control-col">ENQ</td><td class="spacer-col"></td>
              <td class="dec-col">31</td><td class="control-col">US</td><td class="spacer-col"></td>
              <td class="dec-col">57</td><td class="char-col">9</td><td class="spacer-col"></td>
              <td class="dec-col">83</td><td class="char-col">S</td><td class="spacer-col"></td>
              <td class="dec-col">109</td><td class="char-col">m</td>
            </tr>
            <tr class="even-row">
              <td class="dec-col">6</td><td class="control-col">ACK</td><td class="spacer-col"></td>
              <td class="dec-col">32</td><td class="char-col">&nbsp;</td><td class="spacer-col"></td>
              <td class="dec-col">58</td><td class="char-col">:</td><td class="spacer-col"></td>
              <td class="dec-col">84</td><td class="char-col">T</td><td class="spacer-col"></td>
              <td class="dec-col">110</td><td class="char-col">n</td>
            </tr>
            <tr class="odd-row">
              <td class="dec-col">7</td><td class="control-col">BEL</td><td class="spacer-col"></td>
              <td class="dec-col">33</td><td class="char-col">!</td><td class="spacer-col"></td>
              <td class="dec-col">59</td><td class="char-col">;</td><td class="spacer-col"></td>
              <td class="dec-col">85</td><td class="char-col">U</td><td class="spacer-col"></td>
              <td class="dec-col">111</td><td class="char-col">o</td>
            </tr>
            <tr class="even-row">
              <td class="dec-col">8</td><td class="control-col">BS</td><td class="spacer-col"></td>
              <td class="dec-col">34</td><td class="char-col">"</td><td class="spacer-col"></td>
              <td class="dec-col">60</td><td class="char-col">&lt;</td><td class="spacer-col"></td>
              <td class="dec-col">86</td><td class="char-col">V</td><td class="spacer-col"></td>
              <td class="dec-col">112</td><td class="char-col">p</td>
            </tr>
            <tr class="odd-row">
              <td class="dec-col">9</td><td class="control-col">HT</td><td class="spacer-col"></td>
              <td class="dec-col">35</td><td class="char-col">#</td><td class="spacer-col"></td>
              <td class="dec-col">61</td><td class="char-col">=</td><td class="spacer-col"></td>
              <td class="dec-col">87</td><td class="char-col">W</td><td class="spacer-col"></td>
              <td class="dec-col">113</td><td class="char-col">q</td>
            </tr>
            <tr class="even-row">
              <td class="dec-col">10</td><td class="control-col">LF</td><td class="spacer-col"></td>
              <td class="dec-col">36</td><td class="char-col">$</td><td class="spacer-col"></td>
              <td class="dec-col">62</td><td class="char-col">&gt;</td><td class="spacer-col"></td>
              <td class="dec-col">88</td><td class="char-col">X</td><td class="spacer-col"></td>
              <td class="dec-col">114</td><td class="char-col">r</td>
            </tr>
            <tr class="odd-row">
              <td class="dec-col">11</td><td class="control-col">VT</td><td class="spacer-col"></td>
              <td class="dec-col">37</td><td class="char-col">%</td><td class="spacer-col"></td>
              <td class="dec-col">63</td><td class="char-col">?</td><td class="spacer-col"></td>
              <td class="dec-col">89</td><td class="char-col">Y</td><td class="spacer-col"></td>
              <td class="dec-col">115</td><td class="char-col">s</td>
            </tr>
            <tr class="even-row">
              <td class="dec-col">12</td><td class="control-col">FF</td><td class="spacer-col"></td>
              <td class="dec-col">38</td><td class="char-col">&amp;</td><td class="spacer-col"></td>
              <td class="dec-col">64</td><td class="char-col">@</td><td class="spacer-col"></td>
              <td class="dec-col">90</td><td class="char-col">Z</td><td class="spacer-col"></td>
              <td class="dec-col">116</td><td class="char-col">t</td>
            </tr>
            <tr class="odd-row">
              <td class="dec-col">13</td><td class="control-col">CR</td><td class="spacer-col"></td>
              <td class="dec-col">39</td><td class="char-col">'</td><td class="spacer-col"></td>
              <td class="dec-col">65</td><td class="char-col">A</td><td class="spacer-col"></td>
              <td class="dec-col">91</td><td class="char-col">[</td><td class="spacer-col"></td>
              <td class="dec-col">117</td><td class="char-col">u</td>
            </tr>
            <tr class="even-row">
              <td class="dec-col">14</td><td class="control-col">SO</td><td class="spacer-col"></td>
              <td class="dec-col">40</td><td class="char-col">(</td><td class="spacer-col"></td>
              <td class="dec-col">66</td><td class="char-col">B</td><td class="spacer-col"></td>
              <td class="dec-col">92</td><td class="char-col">\</td><td class="spacer-col"></td>
              <td class="dec-col">118</td><td class="char-col">v</td>
            </tr>
            <tr class="odd-row">
              <td class="dec-col">15</td><td class="control-col">SI</td><td class="spacer-col"></td>
              <td class="dec-col">41</td><td class="char-col">)</td><td class="spacer-col"></td>
              <td class="dec-col">67</td><td class="char-col">C</td><td class="spacer-col"></td>
              <td class="dec-col">93</td><td class="char-col">]</td><td class="spacer-col"></td>
              <td class="dec-col">119</td><td class="char-col">w</td>
            </tr>
            <tr class="even-row">
              <td class="dec-col">16</td><td class="control-col">DLE</td><td class="spacer-col"></td>
              <td class="dec-col">42</td><td class="char-col">*</td><td class="spacer-col"></td>
              <td class="dec-col">68</td><td class="char-col">D</td><td class="spacer-col"></td>
              <td class="dec-col">94</td><td class="char-col">^</td><td class="spacer-col"></td>
              <td class="dec-col">120</td><td class="char-col">x</td>
            </tr>
            <tr class="odd-row">
              <td class="dec-col">17</td><td class="control-col">DC1</td><td class="spacer-col"></td>
              <td class="dec-col">43</td><td class="char-col">+</td><td class="spacer-col"></td>
              <td class="dec-col">69</td><td class="char-col">E</td><td class="spacer-col"></td>
              <td class="dec-col">95</td><td class="char-col">_</td><td class="spacer-col"></td>
              <td class="dec-col">121</td><td class="char-col">y</td>
            </tr>
            <tr class="even-row">
              <td class="dec-col">18</td><td class="control-col">DC2</td><td class="spacer-col"></td>
              <td class="dec-col">44</td><td class="char-col">,</td><td class="spacer-col"></td>
              <td class="dec-col">70</td><td class="char-col">F</td><td class="spacer-col"></td>
              <td class="dec-col">96</td><td class="char-col">`</td><td class="spacer-col"></td>
              <td class="dec-col">122</td><td class="char-col">z</td>
            </tr>
            <tr class="odd-row">
              <td class="dec-col">19</td><td class="control-col">DC3</td><td class="spacer-col"></td>
              <td class="dec-col">45</td><td class="char-col">-</td><td class="spacer-col"></td>
              <td class="dec-col">71</td><td class="char-col">G</td><td class="spacer-col"></td>
              <td class="dec-col">97</td><td class="char-col">a</td><td class="spacer-col"></td>
              <td class="dec-col">123</td><td class="char-col">{</td>
            </tr>
            <tr class="even-row">
              <td class="dec-col">20</td><td class="control-col">DC4</td><td class="spacer-col"></td>
              <td class="dec-col">46</td><td class="char-col">.</td><td class="spacer-col"></td>
              <td class="dec-col">72</td><td class="char-col">H</td><td class="spacer-col"></td>
              <td class="dec-col">98</td><td class="char-col">b</td><td class="spacer-col"></td>
              <td class="dec-col">124</td><td class="char-col">|</td>
            </tr>
            <tr class="odd-row">
              <td class="dec-col">21</td><td class="control-col">NAK</td><td class="spacer-col"></td>
              <td class="dec-col">47</td><td class="char-col">/</td><td class="spacer-col"></td>
              <td class="dec-col">73</td><td class="char-col">I</td><td class="spacer-col"></td>
              <td class="dec-col">99</td><td class="char-col">c</td><td class="spacer-col"></td>
              <td class="dec-col">125</td><td class="char-col">}</td>
            </tr>
            <tr class="even-row">
              <td class="dec-col">22</td><td class="control-col">SYN</td><td class="spacer-col"></td>
              <td class="dec-col">48</td><td class="char-col">0</td><td class="spacer-col"></td>
              <td class="dec-col">74</td><td class="char-col">J</td><td class="spacer-col"></td>
              <td class="dec-col">100</td><td class="char-col">d</td><td class="spacer-col"></td>
              <td class="dec-col">126</td><td class="char-col">~</td>
            </tr>
            <tr class="odd-row">
              <td class="dec-col">23</td><td class="control-col">ETB</td><td class="spacer-col"></td>
              <td class="dec-col">49</td><td class="char-col">1</td><td class="spacer-col"></td>
              <td class="dec-col">75</td><td class="char-col">K</td><td class="spacer-col"></td>
              <td class="dec-col">101</td><td class="char-col">e</td><td class="spacer-col"></td>
              <td class="dec-col">127</td><td class="control-col">DEL</td>
            </tr>
            <tr class="even-row">
              <td class="dec-col">24</td><td class="control-col">CAN</td><td class="spacer-col"></td>
              <td class="dec-col">50</td><td class="char-col">2</td><td class="spacer-col"></td>
              <td class="dec-col">76</td><td class="char-col">L</td><td class="spacer-col"></td>
              <td class="dec-col">102</td><td class="char-col">f</td><td class="spacer-col"></td>
              <td class="dec-col"></td><td class="char-col"></td>
            </tr>
            <tr class="odd-row">
              <td class="dec-col">25</td><td class="control-col">EM</td><td class="spacer-col"></td>
              <td class="dec-col">51</td><td class="char-col">3</td><td class="spacer-col"></td>
              <td class="dec-col">77</td><td class="char-col">M</td><td class="spacer-col"></td>
              <td class="dec-col">103</td><td class="char-col">g</td><td class="spacer-col"></td>
              <td class="dec-col"></td><td class="char-col"></td>
            </tr>
          </tbody>
        </table>

---

#### Length

```java
lengthOfS1 = s1.length();
```

#### Substring

```java
aSubstring = s1.substring(firstIndex,lastIndex);
```

#### indexOf

```java
int indexOf(String str);
```
Returns the index of the first occurence of `str`; returns `-1` if not found.

### Implicit Type Concatenation

a primitive type can be concatenated to a string. Ex. The int is implicitly converted to a string before the `+` operator is applied.

## API

[Java API Documentation](https://docs.oracle.com/javase/8/docs/api/)

