class Solution {
    public boolean rotateString(String s, String goal) {
        String str = new String(s + s);
        return (str.contains(goal) && goal.length() == s.length());
    }
}
