package behavioral.command;

import java.util.HashMap;
import java.util.Map;

public class DestroyCommand implements Command
{
    Map<String, Integer> transportData;

    DestroyCommand(Map<String, Integer> transportData)
    {
        this.transportData = transportData;
    }

    @Override
    public void execute()
    {
        System.out.println("Destroying all transport");
        if(!transportData.isEmpty())
        {
            transportData.keySet().forEach(entry -> transportData.remove(entry));
        }
        else
        {
            System.out.println("No transport left");
        }
    }
}
