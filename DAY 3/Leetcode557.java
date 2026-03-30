class Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int st = 0, end;
        for (end=0; end <= n; end++) {
            if (end == n || arr[end]==' ') {
                reverse(arr, st, end - 1);
                st = end + 1;   
            }
        }
        return new String(arr);
    }

    static void reverse(char[] ch, int left, int right) {
        while (left < right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }
    }
}
