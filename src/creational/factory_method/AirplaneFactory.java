package creational.factory_method;

public class AirplaneFactory extends TransportFactory
{
    @Override
    public Transporting createTransport()
    {
        return new Airplane();
    }
}
