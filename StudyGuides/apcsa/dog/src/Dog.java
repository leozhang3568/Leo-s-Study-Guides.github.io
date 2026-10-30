import java.util.random.*;
public class Dog {
    private boolean hasPooped;
    private int hungerLevel;
    private String name;
    private String favoriteToy;
    private int walkCount = 0;
    public Dog () {
        hasPooped = false;
        hungerLevel = 100;
        name = "Spot";
        favoriteToy = "bone";
        System.out.println("Your dog's name is " + name + ", its favorite toy is a " + favoriteToy + ".");
    }
    public Dog (String n, String t) {
        name = n; favoriteToy = t;
        hasPooped = false;
        hungerLevel = 100;
        System.out.println("Your dog's name is " + name + ", its favorite toy is a " + favoriteToy + ".");
    }
    public void eat() {
        if (hungerLevel == 0) {System.out.println(name + " is not hungry.");return;}
        hungerLevel -= (int) (Math.random() * 16 + 10);
        System.out.println("Ate some random food.");
        if (hungerLevel < 0) {
            hungerLevel = 0;
        }
    }
    public void eat(String food) {
        if (hungerLevel == 0) {System.out.println(name + " is not hungry.");return;}
        if (food == "steak") {
            hungerLevel -= 40;
            System.out.println("Yum yum");
        }
        else if (food == "kibble") {
            hungerLevel -= 20;
            System.out.println("Yum yum");
        }
        else {
            System.out.println("Dog spits out. Too yucky!");
        }
    }
    public boolean isHasPooped() {
        return hasPooped;
    }
    public void walk () {
        if (hungerLevel == 100) {
            System.out.println("Can't walk");
            return;
        }
        walkCount += 1;
        System.out.println(name + " is going out for a walk.");
        double poop = Math.random();
        if ((poop >= 0) && (poop < 0.6)) {
            hasPooped = true;
            System.out.println("Dog pooped.");
        }
        else {
            System.out.println("Dog did not poop.");
        }
        if (walkCount % 3 == 0) {
            hungerLevel += 20;
            if (hungerLevel > 100) {
                hungerLevel = 100;
            }
            hasPooped = false;
        }

    }
    public int getHungerLevel() {
        return hungerLevel;
    }
    public String getName() {
        return name;
    }
    public String getFavoriteToy() {
        return favoriteToy;
    }
    public int getWalkCount() {
        return walkCount;
    }
    public void hasPooped(boolean h) {
        hasPooped = h;
        System.out.println("hasPooped = " + hasPooped + ".");
    }
    public void hungerLevel(int h) {
        hungerLevel = h;
        System.out.println("Hunger level set as " + hungerLevel + ".");
    }
    public void name (String n) {
        name = n;
        System.out.println("Say hi to " + name + "!");
    }
    public void favoriteToy (String f) {
        favoriteToy = f;
        System.out.println("The dog's favorite toy is now " + favoriteToy+ ".");
    }
    public void walkCount (int w) {
        walkCount = w;
        System.out.println("Walk count is now " + walkCount);
    }
}