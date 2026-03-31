class locker
{
    private int lockerid;
    private boolean islocked;
    private int pin;
    private String storedItem;
    public locker(int lockerid,int pin)
    {
        this.lockerid=lockerid;
        this.pin=pin;
        this.islocked=true;
    }
    public void storeitem(String item,int pin)
    {
        if(!islocked)
        {
            storedItem=item;
            System.out.println("Item stored successfully");
        }
        else
        {
            System.out.println("Locker is locked, cannot store item");
        }
    }
    public void lock()
    {
        islocked=true;
    }
    public boolean unlock(int enterpin)
    {
        if(enterpin==pin)
        {
            islocked=false;
            return true;
        }
        else{
            System.out.println("Invalid pin");
            return true;
        }
    }
    public String retrieveitem()
    {
        if(!islocked)
        {
            String temp=storedItem;
            storedItem=null;
            return temp;
        }
        else{
            System.out.println("Locker is locked!");
            return null;
        }
    }
}
public class LockerSystem
{
    public static void main(String[] args)
    {
    locker l1=new locker(101,1234);
    l1.unlock(1234);
    l1.storeitem("Gold",1234);
    System.out.println(l1.retrieveitem() + " is retrieved!");
    l1.lock();
    }
}
