package creational.singleton;

// Singleton is a creational design pattern that lets you
// ensure that a class has only one instance,
// while providing a global access point to this instance.

// Single-Multi thread Singleton
/*
public final class Singleton
{
    private static Singleton instance;
    public String value;

    private Singleton(String value)
    {
        try
        {
            Thread.sleep(300);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if(instance == null)
            instance = new Singleton(value);
        return instance;
    }
}*/

public final class Singleton
{
    // Поле обязательно должно быть объявлено volatile, чтобы двойная проверка
    // блокировки сработала как надо.
    private static volatile Singleton instance;

    public String value;

    private Singleton(String value)
    {
        this.value = value;
    }

    public static Singleton getInstance(String value)
    {
        // Техника, которую мы здесь применяем называется «блокировка с двойной
        // проверкой» (Double-Checked Locking). Она применяется, чтобы
        // предотвратить создание нескольких объектов-одиночек, если метод будет
        // вызван из нескольких потоков одновременно.
        //
        // Хотя переменная `result` вполне оправданно кажется здесь лишней, она
        // помогает избежать подводных камней реализации DCL в Java.
        Singleton result = instance;
        if (result != null)
        {
            return result;
        }
        synchronized(Singleton.class)
        {
            if (instance == null)
            {
                instance = new Singleton(value);
            }
            return instance;
        }
    }
}
