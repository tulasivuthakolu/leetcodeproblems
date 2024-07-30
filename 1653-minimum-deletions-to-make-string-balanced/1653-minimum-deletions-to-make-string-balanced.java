class Solution {
    public int minimumDeletions(String s) {
        int A = 0;
        int B = 0;

        int min = 1000000;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'b'){
              B++;
            }
        }
        min = B;
        for(int i = s.length() - 1; i >= 0 ; i--){
            if(s.charAt(i) == 'b'){
                B--;
            }
            else{
                A++;
            }
            min = Math.min(A + B, min);
        }
        return min;
    }
}
