class SampleThread extends Thread{
    public void run()
    {
        System.out.println("Thread running using thread class");
    }
}
class SampleThread2 implements Runnable
{
    public void run()  // 3. running state
    {
        //System.out.println("Thread runnning using Runnable");
        try
        {
            System.out.println("Thread is running using Runnable");
            Thread.sleep(4000);  // 4. blocked/waiting state
            System.out.println("After 4 seconds");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

    }
}
public class ThreadExample
{
    public static void main(String[] args)
    {
        SampleThread t1=new SampleThread();
        t1.start();
        SampleThread2 s2=new SampleThread2();
        Thread t2=new Thread(s2);
        t2.start();
    }
}