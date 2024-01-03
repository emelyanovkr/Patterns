package behavioral.command;

import java.util.Map;

public class RepairCommand implements Command
{
    Map<String, Integer> transportData;

    RepairCommand(Map<String, Integer> transportData)
    {
        this.transportData = transportData;
    }

    @Override
    public void execute()
    {
        for(String entry : transportData.keySet())
        {
            if(transportData.get(entry) == 0)
            {
                System.out.println("Fixing transport");
                transportData.put(entry, 1);
            }
        }
    }
}
