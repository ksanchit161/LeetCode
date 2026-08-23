1class Solution {
2    public int countPairs(int[] nums, int k) {
3        int count=0;
4        int n=nums.length;
5        int i=0,j=1;
6        while(i<j && i<n & j<n){
7            if((i*j)%k==0 && nums[i]==nums[j]) count++;
8            j++;
9            if(j==n) {
10                i++;
11                j=i+1;
12            }
13        }
14        return count;
15    }
16}