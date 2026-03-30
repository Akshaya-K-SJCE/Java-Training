class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        boolean flag = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == ' ' && flag)
                return count;
            if (c != ' ') {
                flag = true;
                count++;
            }
        }
        return count;
    }
}