package creational.abstract_factory.banking;

import creational.abstract_factory.ProjectManager;

public class BankPM implements ProjectManager
{
    @Override
    public void manageProject()
    {
        System.out.println("Managing bank project");
    }
}
