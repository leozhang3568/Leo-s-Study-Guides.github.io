public class App {
    public static void main(String[] args) throws Exception {
        ComboLock myLock = new ComboLock("My Lock");
        myLock.unlock();
    }
}
