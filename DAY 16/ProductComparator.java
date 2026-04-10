import java.util.*;
class Product
{
    String name;
    int price;
    float rating;
    Product(String name,int price,float rating)
    {
        this.name=name;
        this.price=price;
        this.rating=rating;
    }
    public String toString()
    {
        return name+":"+price+":"+rating;
    }
}

public class ProductComparator {
    public static void main(String[] args) {
        List<Product> p= new ArrayList<Product>();
        p.add(new Product("box",5,-1));
        p.add(new Product("pencil", 4, 3));
        p.add(new Product("pen", 3, 5));
        Comparator<Product> Byprice= new Comparator<Product>() {
            public int compare(Product p1,Product p2)
            {
                return p1.price-p2.price;
            }
        };
        Comparator<Product> Byrating= new Comparator<Product>() {
            public int compare(Product p1,Product p2)
            {
                return (int)(p1.rating-p2.rating);
            }
        };
        Collections.sort(p,Byprice);
        System.out.println("Sorted By price:"+p);
        System.out.println();
        Collections.sort(p,Byrating);
        System.out.println("Sorted By Rating:"+p);
        System.out.println();
        Collections.sort(p,(a,b)->a.name.compareTo(b.name));
        System.out.println("Sorted By Name:"+p);
        System.out.println();
        p.sort(Comparator.comparing(a->a.name));
        System.out.println("Sorted By Name:"+p);


    }
}
