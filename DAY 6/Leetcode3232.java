class Solution {
    public boolean canAliceWin(int[] nums) {
        int sing=0, doub=0;
        for(int n: nums){
            if(n>=10)  doub+=n;
            else sing+=n;
        }
        return (sing!=doub);
    }
}