class BankAccount
{
    private double balance;
    public void setbalance(double balance)     //setters
    {
        if(balance>0){
        this.balance=balance;
        }
        else
        {
            System.out.println("Input not valid");
        }
    }
    public void withdraw(int amount)
    {
        if(amount>0 && balance>=amount)
        balance-=amount;
    }
    public double getbalance()               //getters
    {
        return balance;
    }
    public void deposit(int amount)
    {
        if(amount>0)
        {
            balance+=amount;
            System.out.println("Amount credited:"+amount);
        }
        else{
            System.out.println("Entered Invalid amount");
        }
    }
}
public class Encapsulation
{
    public static void main(String[] args)
    {
        BankAccount B=new BankAccount();
        B.setbalance(1000);
        B.withdraw(500);
        System.out.println(B.getbalance());
        B.deposit(5000);
    }
}