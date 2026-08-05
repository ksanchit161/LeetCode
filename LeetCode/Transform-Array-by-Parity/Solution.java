1class Solution {
2    public int[] transformArray(int[] nums) {
3        int count=0;
4        int res[]=new int[nums.length];
5        for(int ele:nums){
6            if((ele&1)==0) count++;
7        }
8        for(int i=count;i<nums.length;i++){
9            res[i]=1;
10        }
11        return res;
12        
13    }
14}