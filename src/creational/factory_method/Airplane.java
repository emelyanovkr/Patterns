package creational.factory_method;

public class Airplane implements Transporting
{

    @Override
    public void announce()
    {
        System.out.println("Airplane");
    }

    @Override
    public void deliver()
    {
        System.out.println("Plane is delivering...");
    }
}
