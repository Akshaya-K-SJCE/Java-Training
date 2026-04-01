class OutOfStockException extends Exception
{
    public OutOfStockException(String msg)
    {
        super(msg);
    }
}
class PaymentFailedException extends Exception
{
    public PaymentFailedException(String msg)
    {
        super(msg);
    }
}
class OrderProcessingFailedException extends Exception
{
    public OrderProcessingFailedException(String msg)
    {
        super(msg);
    }
}
class Product
{
    private String name;
    int stock;
    private int price;
    public Product(String name,int stock,int price)
    {
        this.name=name;
        this.stock=stock;
        this.price=price;
    }
}
class User  
{
    private String name;
    private String address;
    public User(String name,String address)
    {
        this.name=name;
        this.address=address;
    } 
}
class Order{
    Product p;
    private User u;
    int quantity;
    public Order(Product p,User u,int quantity)
    {
        this.p=p;
        this.u=u;
        this.quantity=quantity;
    }
}
class OrderService
{
    static void placeOrder(Order o) throws PaymentFailedException,OrderProcessingFailedException,OutOfStockException
    {
        o.p.stock-=o.quantity;
        if(o.p.stock<=0)
        {
            throw new OutOfStockException("Product out of stock");
        }
        // if(Math.random()<0.4)
        // {
        //     throw new PaymentFailedException("Payment Failed");
        // }
        // if(Math.random()<0.1)
        // {
        //    throw new OrderProcessingFailedException("Order Failed");
        // }
        System.out.println("Order Placed successfully");
        System.out.println(o.p.stock);
    }
}
public class E_CommerceSystem
{
    public static void main(String[] args)
    {
        Product p1=new Product("Bat",53,3500);
        User u1=new User("Mitesh","Chennai");
        Order o1=new Order(p1,u1,3);
        OrderService s=new OrderService();
        try{
            s.placeOrder(o1);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
