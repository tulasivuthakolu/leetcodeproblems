class Solution {

    int getNewNum(int[] mapping, int val){

        String str = String.valueOf(val);
        int newNum = 0;
        for(char chr : str.toCharArray()){
            newNum = newNum * 10 + (mapping[chr - '0']);
        }

        return newNum;
    }

    public int[] sortJumbled(int[] mapping, int[] nums) {
        int n = nums.length;
        int[] sortedJumbled = new int[n];

        int[][] numsWithIndexAndMapping = new int[n][];

        for(int i = 0; i < n; i++){
            int newNum = getNewNum(mapping, nums[i]);
            numsWithIndexAndMapping[i] = new int[]{newNum, i, nums[i]};
        }

        Arrays.sort(numsWithIndexAndMapping,
            (a, b) -> a[0] == b[0]
            ? Integer.compare(a[1], b[1])
            : Integer.compare(a[0], b[0]));

        int index = 0;
        for(int[] curr : numsWithIndexAndMapping){
            sortedJumbled[index++] = curr[2];
        }

        return sortedJumbled;
    }
}