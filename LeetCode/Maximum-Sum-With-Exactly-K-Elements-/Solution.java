1class Solution {
2    public int maximizeSum(int[] nums, int k) {
3        int max=-1;
4        for(int i=0;i<nums.length;i++){
5            max=Math.max(max,nums[i]);
6        }
7        return (max*k)+(k*(k-1)/2);
8    }
9}