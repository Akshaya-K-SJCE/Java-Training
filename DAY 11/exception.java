public class exception
{
    public static void main(String[] args)
    {
       try
        {
            //int a=8;
            //int b=0;
            //int c=a/b;
            String s=null;
            System.out.println(s.length());
            //System.out.println(c);
        }catch(ArithmeticException e)
        {
            System.out.println("Number is divided by zero");
        }
        catch(NullPointerException e)
        {
            System.out.println("String is Null");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("Finally block always executed");
        }
    }
}