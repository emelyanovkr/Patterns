package creational.factory_method;

public class ShipFactory extends TransportFactory
{
    @Override
    public Transporting createTransport()
    {
        return new Ship();
    }
}
