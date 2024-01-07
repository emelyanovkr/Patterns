package creational.abstract_factory;

/*
Абстрактная фабрика — это порождающий паттерн проектирования,
который позволяет создавать семейства связанных объектов,
не привязываясь к конкретным классам создаваемых объектов.
*/

public interface ProjectTeamFactory
{
    Developer getDeveloper();
    Tester getTester();
    ProjectManager getProjectManager();
}
