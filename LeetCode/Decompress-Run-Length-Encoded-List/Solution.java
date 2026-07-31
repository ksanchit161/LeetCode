1class Solution {
2    public int[] decompressRLElist(int[] nums) {
3        int []result=new int [100001];
4        int k=0;
5        for(int i=0;i<nums.length;i+=2){
6            int freq=nums[i];
7            int val=nums[i+1];
8            for(int j=0;j<freq;j++){
9                result[k++]=val;
10            }
11        }
12        return Arrays.copyOf(result,k);
13    }
14}