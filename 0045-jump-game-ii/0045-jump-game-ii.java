class Solution {
    public int jump(int[] nums) {
     int jumps = 0;
     int cur = 0, end = 0;
	 for (int i = 0; i < nums.length - 1; i++) {
		 cur= Math.max(cur, i + nums[i]);
		if (i == end) {
			jumps++;
			end = cur;
		}
	}
	return jumps;   
    }
}
