1class Solution {
2    public int[] runningSum(int[] nums) {
3        int []result=new int [nums.length];
4        result[0]=nums[0];
5        for(int i=1;i<nums.length;i++){
6            result[i]=result[i-1]+nums[i];
7        }
8        return result;
9    }
10}