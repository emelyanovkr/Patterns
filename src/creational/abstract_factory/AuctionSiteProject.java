package creational.abstract_factory;

import creational.abstract_factory.website.WebsiteTeamFactory;

public class AuctionSiteProject
{
    public static void main(String[] args)
    {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
