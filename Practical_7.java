//Multi-Threading
//soach.java
public class soach extends Thread {
    @Override
    public void run()
    {
        try {
            System.out.println("hi current ::" + Thread.currentThread());
            System.out.println("current ID::"+Thread.currentThread().getId());
            System.out.println("current Name ::" + Thread.currentThread().getName());
            System.out.println("current priority ::" + Thread.currentThread().getPriority());
            System.out.println("current group ::" + Thread.currentThread().getThreadGroup());
        }
        catch (Exception exception)
        {
            System.out.println("hhgjkkD::" + exception);
        }
        finally
        {
            System.out.println("Total::" + Thread.activeCount());
        }
    }
}
//Zindahumai.java
public class zindahumai extends soach
{
    public static void main(String[] args)
    {
        zindahumai zindahumai= new zindahumai();
        zindahumai.run();
    }
}
//Dilkhtahai.java
public class Dilkehtahai {
    public static void main(String[] args) {
        int n=8;
        for(int i=0; i<n; i++)
        {
              soach object = new soach();
              object.start();

        }
    }
}
