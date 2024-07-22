class Solution {
    public void moveZeroes(int[] nums) {
        for(int i=0,j=1; j<nums.length;)
        {
            if(nums[i]!=0){
                
                i++;
                j++;
            }
            else if(nums[j]==0)
            {
                j++;
            }
            else
            {
                int t=nums[j];
                nums[j]=nums[i];
                nums[i]=t;
            }
        }
       
    }
}