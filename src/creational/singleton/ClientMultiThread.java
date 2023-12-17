package creational.singleton;

public class ClientMultiThread
{
    public static void main(String[] args)
    {
        Thread threadMain = new Thread(new ThreadMain());
        Thread threadAdditional = new Thread(new ThreadAdditional());
        threadMain.start();
        threadAdditional.start();
    }

    static class ThreadMain implements Runnable
    {
        @Override
        public void run()
        {
            Singleton singleton = Singleton.getInstance("Main");
            System.out.println(singleton.value);
        }
    }

    static class ThreadAdditional implements Runnable
    {
        @Override
        public void run()
        {
            Singleton singleton = Singleton.getInstance("Additional");
            System.out.println(singleton.value);
        }
    }
}
