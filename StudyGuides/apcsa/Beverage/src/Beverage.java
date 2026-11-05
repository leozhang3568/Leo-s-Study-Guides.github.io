//Create a Beverage class here. Very Simple.
public class Beverage {
    private String name;
    private int size;
    private int percentFull;
    private double price;
    public Beverage() {
        this.name = "water";
        this.size = 20;
        this.percentFull = 100;
        this.price = 2;
    }
    public Beverage(String name, int size) {
        this.name = name;
        this.size = size;
        this.percentFull = 100;
    }
    public Beverage(String name, double price) {
        this.name = name;
        this.price = price;
        System.out.println(name + " created with price of $" + price + ".");
    }
    public String getName() {
        return name;
    }
    public int getSize() {
        return size;
    }
    public int getPercentFull() {
        return percentFull;
    }
    public double getPrice() {
        return price;
    }
    public void setName(String name) {
		this.name = name;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void setPercentFull(int percentFull) {
		this.percentFull = percentFull;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void drink () {
        System.out.println("You drank " + name + ".");
        this.percentFull -= (int) (Math.random() *21 + 10);
        if (percentFull < 0) {
            percentFull = 0;
        }
    }
    public void drink (int decrease) {
        this.percentFull -= decrease;        
        if (percentFull < 0) {
            percentFull = 0;
        }
    }



}
//Instance variables
    //name, size in ounces(int),percentFull(int), 


//2 Constructors: 
    //No argument constructor makes the Beverage water, 20oz, and 100% percentFull

    //2 Argument constructor that has a parameter for name andd size. Should default percentFull to a 100


//Getters for each. //No setters needed.




//Two methods called drink() OVERLOADED( means same method with different parameters). 
//Print "You drank _______";
//Make sure% full can't go under 0 and print a message out when that happens.
// Parameterless : one that will randomly reduce percent by anywhere from 10-30. 
// Int Parameter: One that will reduce percent by the int parameter.