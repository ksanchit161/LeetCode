1class Solution {
2    public int[] shuffle(int[] nums, int n) {
3        int i=0;
4        int j=nums.length/2;
5        int []result=new int [nums.length];
6        int k=0;
7        while(i<n && j<nums.length){
8            result[k++]=nums[i++];
9            result[k++]=nums[j++];
10        }
11        return result;
12    }
13}