class Solution {
    public boolean detectCapitalUse(String word) {
        int count = 0;
        for (char c : word.toCharArray()) {
            if (c >= 65 && c <= 90) {
                count++;
            }
        }
        return (count == 0 || count == word.length() || count == 1 && Character.isUpperCase(word.charAt(0)));
    }
}
