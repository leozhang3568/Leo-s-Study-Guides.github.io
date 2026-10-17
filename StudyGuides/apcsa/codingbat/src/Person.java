public class Person {

    private int hunger;
    private String hairStyle;
    private boolean hasBrain = true;
    private int legs = 2;
    private String name;
    private double height;
    private int age;
    private String ethnicity;

    public Person() {
        System.out.println("This person has been created.");
    }
    
    public Person(String n, int a) {
        name = n;
        age = a;

        System.out.println("Hi, my name is " + name + ", and I am " + age + " years old.");
    }
}
