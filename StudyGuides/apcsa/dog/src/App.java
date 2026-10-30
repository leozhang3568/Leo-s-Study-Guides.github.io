public class App {
    public static void main(String[] args) throws Exception {
        Dog Leo = new Dog();
        Dog Joshua = new Dog("Joshua", "phone");
        Joshua.getHungerLevel();
        Leo.favoriteToy("BunnyRabbit");
        Leo.eat();
        Leo.eat("steak");
        for (int i = 0; i < 5; i++) {
            Leo.walk();
        }
    }
}
