class Solution {
    public int countSeniors(String[] details) {
        int c=0;
        for(int i=0;i<details.length;i++) {
            StringBuilder s=new StringBuilder();
            s.append(details[i].charAt(11));
            s.append(details[i].charAt(12));
            if(Integer.parseInt(s.toString())>60) {
                c++;
            }
        }
        return c;
    }
}
