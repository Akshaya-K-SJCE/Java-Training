import java.util.*;

class Leetcode6 {
    public String convert(String s, int numRows) {
        if (numRows <= 1) return s;

        int i = 0, c = 1;
        int k = (2 * numRows) - 2; 
        int step = k; 
        StringBuilder r = new StringBuilder();

        while (r.length() < s.length()) {
            if (i < s.length()) {
                r.append(s.charAt(i));
            }
            if (step > 0 && step < k) {
                int nextIdx = i + step;
                if (nextIdx < s.length()) {
                    r.append(s.charAt(nextIdx));
                }
            }
            i += k;
            if (i >= s.length()) {
                i = c++;    
                step -= 2;   
            }
        }
        return r.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int num = sc.nextInt();
        Leetcode6 c = new Leetcode6();
        System.out.print(c.convert(s, num));
    }
}


