class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[2 * n];
        int ind1 = 0, ind2 = n;
        for (int i = 0; i < nums.length; i += 2) {
            res[i] = nums[ind1++];
            res[i + 1] = nums[ind2++];
        }
        return res;
    }
}
