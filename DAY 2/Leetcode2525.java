class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        long vol = 1L * length * width * height;
        boolean bulky = false, heavy = false;
        if (vol >= 1000000000 || length >= 10000 || width >= 10000 || height >= 10000) {
            bulky = true;
        }
        if (mass >= 100) {
            heavy = true;
        }
        if (bulky && heavy) {
            return "Both";
        } else if (bulky && !heavy) {
            return "Bulky";
        } else if (heavy && !bulky) {
            return "Heavy";
        } else {
            return "Neither";
        }
    }
}