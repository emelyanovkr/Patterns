package creational.singleton;

public class ClientSingleThread {
    public static void main(String[] args) {
        System.out.println("Getting Singleton Instance");

        Singleton main = Singleton.getInstance("Main");
        Singleton additional = Singleton.getInstance("Additional");

        System.out.println(main.value);         // Main
        System.out.println(additional.value);   // Still prints Main (instance already created)
    }
}
