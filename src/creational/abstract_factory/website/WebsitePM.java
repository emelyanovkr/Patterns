package creational.abstract_factory.website;

import creational.abstract_factory.ProjectManager;

public class WebsitePM implements ProjectManager
{
    @Override
    public void manageProject()
    {
        System.out.println("Managing WebSite");
    }
}
