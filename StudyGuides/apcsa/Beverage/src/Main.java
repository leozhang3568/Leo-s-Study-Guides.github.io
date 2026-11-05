public class Main {
    public static void main(String [] args) {
        Beverage[] myInventory = new Beverage[4];
        myInventory[0] = new Beverage("water",5.0);
        myInventory[1] = new Beverage("smoothie",8.0);
        myInventory[3] = new Beverage("sluice",8.0);
        VendMachine myMachine = new VendMachine();
        String[] myDrinks = {"water", "smoothie"};
        VendMachine hisMachine = new VendMachine(myDrinks, 12);
        myMachine.setCashOnHand(100);
        System.out.println(myMachine.getCashOnHand());
        myMachine.setInventory(myInventory);
        myMachine.printInventory();
        myMachine.refill("COLAAAAAAA");
        myMachine.printInventory();
        myMachine.purchase(1,10);
        myMachine.changePrice("water", 100);
    }



    //Write a new method called randName that will take a String Array Parameter and return a random string from there.

}
