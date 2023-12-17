package creational.factory_method;

public class Ship implements Transporting
{
    @Override
    public void announce()
    {
        System.out.println("Ship");
    }

    @Override
    public void deliver()
    {
        System.out.println("Ship is delivering...");
    }
}
