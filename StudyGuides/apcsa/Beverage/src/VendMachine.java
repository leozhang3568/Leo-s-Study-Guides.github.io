public class VendMachine {
    private String[] drinkNames;
    private Beverage[] inventory;
    private double cashOnHand;

    public VendMachine () {
        drinkNames = new String[] {"Coke", "Sprite", "water", "juice"};
        cashOnHand = 0;
        inventory = new Beverage[12];
        System.out.print("Drink names: ");
        for (String x: drinkNames) {
            System.out.println(x + " ");
        }
        System.out.println("\n");
        System.out.print("Inventory: ");
        for (int i = 0; i < inventory.length; i++) {
            System.out.print(inventory[i] + " ");
        }
        System.out.println("\n");
        System.out.println("Cash on hand: " + cashOnHand + ".");

    }
    public VendMachine (String[] names, double cash) {
        this.drinkNames = names;
        this.cashOnHand = cash;
        inventory = new Beverage[12];
        System.out.print("Drink names: ");
        for (int i = 0; i < drinkNames.length; i++) {
            System.out.print(drinkNames[i] + " ");
        }
        System.out.println("\n");
        System.out.print("Inventory: ");
        for (int i = 0; i < inventory.length; i++) {
            System.out.print(inventory[i] + " ");
        }
        System.out.println("\n");
        System.out.println("Cash on hand: " + cashOnHand + ".");
    }
    public void printInventory() {
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] != null) {
                System.out.println("For slot " + i + ", there is " + inventory[i].getName() + ".");
            }
            else {
                System.out.println("You have nothing in slot " + i + ".");
            }
        }
    }
    public void refill() {
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] == null) {
                inventory[i] = new Beverage(randName(drinkNames),5);
            }
        }
    }
    public void refill(String str) {
        for (int i = 0; i < inventory.length; i++) {
            if (inventory[i] == null) {
                inventory[i] = new Beverage(str,5);
            }
        } 
    }
	public String[] getDrinkNames() {
		return drinkNames;
	}
	public Beverage[] getInventory() {
		return inventory;
	}
	public double getCashOnHand() {
		return cashOnHand;
	}
	public void setDrinkNames(String[] drinkNames) {
		this.drinkNames = drinkNames;
	}
	public void setInventory(Beverage[] inventory) {
		this.inventory = inventory;
	}
	public void setCashOnHand(double cashOnHand) {
		this.cashOnHand = cashOnHand;
	}
    public static String randName(String[] str) {
        int randomIndex = (int) (Math.random() * str.length);
        return str[randomIndex];
    }
    public Beverage purchase (int slot, double money) {
        if (inventory[slot] == null) {
            return null;
        }
        if (money >= inventory[slot].getPrice()) {
            cashOnHand += inventory[slot].getPrice();
            System.out.println("Here's change" + (money - inventory[slot].getPrice()));
            System.out.println("Beverage dispensed.");
            return inventory[slot];
        }
        else {
            System.out.println("Not enough money.");
            return null;
        }
    }
    public void changePrice (String name, double price) {
        for (int i = 0; i < inventory.length; i++) {
            if ((inventory[i].getName()).equals(name)) {
                inventory[i].setPrice(price);
                System.out.println(inventory[i].getName() + " changed to " + inventory[i].getPrice());
            }
        }
    }
    
}