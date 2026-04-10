import java.util.TreeSet;
public class Tset {
    static int closest(int[] arr,int target)
    {
        TreeSet<Integer> set=new TreeSet<Integer>();
        for(int i:arr)
        {
            set.add(i);
        }
        // int low=set.floor(target);
        // int high=set.ceiling(target);
        Integer low=set.lower(target);
        Integer high=set.higher(target);
        if(low==null)
        {
            return high;
        }
        if(high==null)
        {
            return low;
        }
         if(low<target)
        {
            return low;
        }
        return high;
    }
    public static void main(String[] args) {
        {
            int[] arr={15,3,9,1,7,2};
            int result=closest(arr,1);
            System.err.println(result);
        }
    }
}
