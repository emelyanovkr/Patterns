package creational.abstract_factory.website;

import creational.abstract_factory.Developer;

public class PHPDeveloper implements Developer
{
    @Override
    public void writeCode()
    {
        System.out.println("PHP Developer writing");
    }
}
