public class leetcode560 {    public int subarraySum(int[] nums, int k) {
        int count=0;
for(int start=0;start<nums.length;start++)
{
    int sum=0;
    for(int j=start;j<nums.length;j++)
    {
        sum+=nums[j];
        if(sum==k)
        {
            count++;
        }
    }
}
return count;
    }
}
