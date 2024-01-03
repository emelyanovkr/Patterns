package behavioral.command;

import creational.factory_method.AirplaneFactory;
import creational.factory_method.Transporting;

public class TransportCommand implements Command
{
    @Override
    public void execute()
    {
        System.out.println("Initiating transport");
        Transporting airplane = new AirplaneFactory().createTransport();
        airplane.deliver();
    }
}
