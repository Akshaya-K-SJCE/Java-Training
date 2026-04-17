class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] result=new int[k];
        for(int i:nums)
        {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
        list.sort((e1,e2)->e2.getValue().compareTo(e1.getValue())) ;
        for(int i=0;i<k;i++)
        {
            result[i]=list.get(i).getKey();
        }
        return result;  
    }
}