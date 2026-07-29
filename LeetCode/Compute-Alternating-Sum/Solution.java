1class Solution {
2    public int alternatingSum(int[] nums) {
3        int sum=0;
4        for(int i=0;i<nums.length;i++){
5            if(i%2==0) sum+=nums[i];
6            else sum-=nums[i];
7        }
8        return sum;
9    }
10}