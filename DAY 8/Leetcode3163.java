class Solution {
    public String compressedString(String word) {
        StringBuilder comp = new StringBuilder();
        int count = 1;
        int i, n = word.length();
        for (i = 1; i < n; i++) {
            if (word.charAt(i) == word.charAt(i - 1) && count < 9) {
                count++;
            } else {
                comp.append(count).append(word.charAt(i - 1));
                count = 1;
            }
        }
        comp.append(count).append(word.charAt(i - 1));
        return comp.toString();
    }
}
