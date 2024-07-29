class Solution {
    public int numTeams(int[] ratings) {
        int total = 0;
        
        for(int i = 1; i < ratings.length; i++)
        {
            int leftLess = 0;
            int rightGreater = 0;
            int leftGreater = 0;
            int rightLess = 0;
            for(int j = 0; j < i; j++)
            {
                if(ratings[j] < ratings[i])
                {
                    leftLess++;
                }
                else
                {
                    leftGreater++;
                }
            }
            for(int j = ratings.length - 1; j > i; j--)
            {
                if(ratings[i] < ratings[j])
                {
                    rightGreater++;
                }
                else
                {
                    rightLess++;
                }
            }
            total += leftLess * rightGreater + leftGreater * rightLess;
        }
        
        return total;
    }
}