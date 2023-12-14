package creational.singleton;

// Singleton is a creational design pattern that lets you
// ensure that a class has only one instance,
// while providing a global access point to this instance.

public final class Singleton
{
    private static Singleton instance;
    public String value;

    private Singleton(String value)
    {
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {

        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if(instance == null)
            return new Singleton(value);
        return instance;
    }
}