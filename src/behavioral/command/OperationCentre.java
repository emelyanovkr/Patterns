package behavioral.command;

public class OperationCentre
{
    public static void main(String[] args)
    {
        Command transport = new TransportCommand();
        transport.execute();
    }
}
