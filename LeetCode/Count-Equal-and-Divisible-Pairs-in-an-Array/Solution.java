1class Solution {
2    public int countPairs(int[] nums, int k) {
3      int n=nums.length,count=0;
4      for(int i=0;i<n;i++){
5        for(int j=i+1;j<n;j++){
6            if(nums[j]==nums[i]){
7                if((i*j)%k==0)
8                count++;
9            }
10        }
11      }
12      return count;
13    }
14}