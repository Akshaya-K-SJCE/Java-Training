class Battery
{
    void powersupply()
    {
        System.out.println("Still have 40% power");
    }
}
class Remote
{
    Battery minbattery;
    Remote()
    {
        minbattery=new Battery();
    }
    public void changechannel()
    {
        minbattery.powersupply();
        System.out.println("Channel changed");
    }
    public void changevolume()
    {
        System.out.println("Volume increased");
    }
}
class tv{
    Remote tvremote;
    tv(Remote tvremote)
    {
        this.tvremote=tvremote;
    }
    public void increasevolume()
    {
        tvremote.changevolume();
    }
}
public class Relationship
{
    public static void main(String[] args)
    {
        Remote tvremote=new Remote();
        tvremote.changechannel();
        tv tvrem=new tv(tvremote);
        tvrem.increasevolume();
    }
}