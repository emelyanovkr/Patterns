package creational.factory_method;

/*
Фабричный метод — это порождающий паттерн проектирования, который определяет общий интерфейс
для создания объектов в суперклассе, позволяя подклассам изменять тип создаваемых объектов.
*/

public abstract class TransportFactory
{
    public void createFactory()
    {
        System.out.println("Init factory");
        Transporting transport = createTransport();
        transport.announce();
        transport.deliver();
    }

    public abstract Transporting createTransport();

}
