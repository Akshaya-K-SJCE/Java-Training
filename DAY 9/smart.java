abstract class smartdevice
{
    abstract void turnon();
    abstract void turnoff();
    abstract void setlevel(String level);
    void deviceinfo()
    {
        System.out.println("Device is on or off");
    }
}
interface Remote
{
    void change();
}
interface wificontrol
{
    void connect();
    void change();
}
class tv implements Remote,wificontrol{
    public void change()                   //always interface methods are public + abstract
    {
    System.out.println("Change channel");
    }
    public void connect()
    {
        System.out.println("wifi connected");
    }
}
class ac extends smartdevice
{
    void setlevel(String level)
    {
        System.out.println(level);
    }
    void turnon()
    {
        System.out.println("ac is on");
    }
    void turnoff()
    {
        System.out.println("ac is off");
    }
}
class Light extends smartdevice{
    void turnon(){
        System.out.println("Light on");
    }
    void turnoff(){
        System.out.println("Light off");
    }
    void setlevel(String level)
    {
        System.out.println(level);
    }
}

public class smart{
    public static void main(String[] args)
    {
    Light dev=new Light();
    dev.turnon();
    dev.turnoff();
    dev.deviceinfo();
    ac acinfo=new ac();
    acinfo.turnon();
    acinfo.turnoff();
    acinfo.setlevel("high");
    tv tvinfo=new tv();
    tvinfo.change();
    tvinfo.connect();
}
}