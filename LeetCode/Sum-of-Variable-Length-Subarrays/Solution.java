1class Solution {
2    public int subarraySum(int[] nums) {
3        int sum=0;
4        for(int i=0;i<nums.length;i++){
5            for(int j=Math.max(0,i-nums[i]);j<=i;j++){
6                sum+=nums[j];
7            }
8        }
9        return sum;
10    }
11}