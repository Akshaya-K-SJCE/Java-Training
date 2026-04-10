class leetcode349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        for(int i: nums1)
        {
            set1.add(i);
        }
        for(int num:nums2)
        {
            if(set1.contains(num))
            {
                set2.add(num);
            }
        }
        int[] res=new int[set2.size()];
        int i=0;
        for(int val : set2)
        {
            res[i++]=val;
        }
        return res;
    }
}