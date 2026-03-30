class Solution {
    public String reverseVowels(String s) {
        char[] res = s.toCharArray();
        int st = 0, end = s.length() - 1;
        while (st < end) {
            if (!isVowel(res[st]))
                st++;
            if (!isVowel(res[end]))
                end--;
            if (isVowel(res[st]) && isVowel(res[end])) {
                char temp = res[st];
                res[st] = res[end];
                res[end] = temp;
                st++; end--;
            }
        }
        return new String(res);
    }

    boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return true;
        }
        return false;
    }
}
