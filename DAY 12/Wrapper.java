public class Wrapper
{
    public static void main(String[] args)
    {
        Integer b=Integer.valueOf("0123456");   //return type -> object(Integer)
        Integer c=Integer.parseInt("0987");     //return type -> int(int)
        int a=b;  //unboxing 
        Integer x=180;
        Integer y=180;
        System.out.println(x==y);
        System.out.println(b);
        System.out.println(c);
        System.out.println(a);
        System.out.println(x.equals(y));

    }
}