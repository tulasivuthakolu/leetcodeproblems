class Solution {
    public int titleToNumber(String columnTitle) {
        int n=0;
        for(int i=0;i<columnTitle.length();i++){
            n=n*26;
            n=n+columnTitle.charAt(i)-'A'+1;
        }
        return n;
    }
}