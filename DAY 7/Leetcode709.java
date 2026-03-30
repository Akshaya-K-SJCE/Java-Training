class Solution {
    public String toLowerCase(String s) {
        char[] res = new char[s.length()];
        int i = 0;
        for (char ch : s.toCharArray()) {
            if (ch>=65 && ch<=90)
                res[i++] = (char)(ch + 32);
            else res[i++] = ch;
        }
        return new String(res);
    }
}
