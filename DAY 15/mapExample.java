import java.util.*;

public class mapExample
{
    public static void main(String[] args) {
        {
            int[] array={1,2,3,4,5};
            Map<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<array.length;i++)
            {
                map.put(i,array[i]);
            }
            System.out.println(map.keySet());
            System.out.println(map.values());
            for(Map.Entry<Integer,Integer> entry:map.entrySet())
            {
                System.out.println(entry.getKey()+"->"+entry.getValue());
            }

        }
    }
}