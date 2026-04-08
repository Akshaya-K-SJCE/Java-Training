class Solution {
    public int missingNumber(int[] nums) {
      HashSet set=new HashSet<>();
      for(int i=0;i<nums.length;i++)
      {
        set.add(nums[i]);
      }
      for(int i=0;i<set.size();i++)
      {
        if(!set.contains(i))
        {
            return i;
        }
      }  
      return set.size();
    }
}