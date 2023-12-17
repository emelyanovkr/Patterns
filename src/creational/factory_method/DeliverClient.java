package creational.factory_method;

public class DeliverClient
{
    private static TransportFactory factory;
    public static void main(String[] args)
    {
        String deliveryMethod = generateDeliveryMethod();

        if(deliveryMethod.equals("airplane"))
        {
            factory = new AirplaneFactory();
        } else if (deliveryMethod.equals("ship"))
        {
            factory = new ShipFactory();
        }

        factory.createFactory();
    }

    public static String generateDeliveryMethod()
    {
        // some logic defining delivery method
        return "ship";
    }
}
