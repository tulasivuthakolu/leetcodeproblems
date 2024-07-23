 class Solution {
    public int findComplement(int num) {
        int n= Integer.toBinaryString(num).length();
        int ones =1<<n;
        return ~num & (ones-1);
    }
}

