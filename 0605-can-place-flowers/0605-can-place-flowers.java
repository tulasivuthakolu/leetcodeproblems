class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {
        int z = 1; // Start with 1 to handle the beginning of the array properly
        for (int i = 0; i < f.length; i++) {
            if (f[i] == 0) {
                z++;
            } else {
                z = 0;
            }
            if (z == 3) {
                n--;
                z = 1; // reset z to 1 because we placed a flower in the gap
            }
        }
        if (z == 2) n--; // handle the end of the array
        return n <= 0;
    }
}
