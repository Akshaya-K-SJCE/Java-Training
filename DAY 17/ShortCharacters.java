import java.util.*;

public class ShortCharacters
{
    public static List<Character> shortChar(String s)
    {
        Map<Character,Integer> map=new HashMap<>();
        for (int i =0 ; i <s.length() ; i++)
        {
            map.put(s.charAt(i),map.getOrDefault(i, 0)+1);
        }
            List<Map.Entry<Character,Integer>> list=new ArrayList<>(map.entrySet());
            Collections.sort(list,new Comparator<Map.Entry<Character,Integer>>() {
                public int compare(Map.Entry<Character,Integer> a,Map.Entry<Character,Integer> b)
                {
                    if(!a.getValue().equals(b.getValue()))
                    {
                        return b.getValue()-a.getValue();
                    }
                    return  a.getKey()-b.getKey();
                }
        
            });
            List<Character> result=new ArrayList<>();
            for(Map.Entry<Character,Integer> i: list)
            {
                result.add(i.getKey());
            }
            return result;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.print(shortChar(s));
    }
}