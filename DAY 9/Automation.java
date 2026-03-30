abstract class SmartDevice{
   abstract void turnOn();
   abstract void turnOff();
   String name;
}
class Light extends SmartDevice
{
    void turnOn()
    {
        System.out.println("Turn On The Light");
    }
    void turnOff()
    {
        System.out.println("Turn Off the Light");
    }
}
class Ac extends SmartDevice
{
    void turnOn()
    {
        System.out.println("Turn On the AC");
    }
    void turnOff()
    {
        System.out.println("Turn Off the AC");
    }
}
 interface Trigger
  {
    boolean isTrigger();
 }
 class MotionTrigg implements Trigger
 {
 @Override
 public boolean isTrigger()
 {
    System.out.println("Motion detected");
    return true;
 }
 }
 class TempTrigg implements Trigger
 {
    int temp;
    TempTrigg(int temp)
    {
     this.temp=temp;
    }

    @Override
    public boolean isTrigger()
    {
        if(temp>30) 
        {
        System.out.println("Temperature above threshold");
        return true;
        }
        return false;
    }
 }
 class TimeTrigg implements Trigger
 {
    int time;
    TimeTrigg(int time)
    {
     this.time=time;
    }
    @Override
    public boolean isTrigger()
    {
        if(time>30) {
        System.out.println("Time Trigger");
        return true;
        }
        return false;
 
    }

 } 
 interface Action
 {
    void execute();
 }
 class TurnOnAction implements Action
 {
         SmartDevice device;
     // Aggregation
        TurnOnAction(SmartDevice device)
        {
            this.device=device;
        }
        public void execute()
        {
            device.turnOn();
        }
    
    
 }
 class TurnOffAction implements Action
 {
    
        SmartDevice device;
        TurnOffAction(SmartDevice device)
        {
            this.device=device;
        }
        public void execute()
        {
            device.turnOff();
        }
    
 }
 class Rule
 {
    Trigger trigger;
    Action action;
    Rule(Trigger trigger,Action action)
    {
        this.trigger=trigger;
        this.action=action;
    }
    void result()
    {
        if(trigger.isTrigger())
        {
            action.execute();
        }
        else{
            System.out.println("Condition not met...");
        }
    }
 }

public class Automation {
    public static void main(String[] args) {
        SmartDevice ac= new Ac();
        SmartDevice l= new Light();
        Trigger t = new MotionTrigg();
        Action a = new TurnOnAction(l);
        Rule r = new Rule(t, a);
        r.result();
    }
}