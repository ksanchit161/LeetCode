1class Solution {
2    public int smallestBalancedIndex(int[] nums) {
3       int n=nums.length;
4       long sum=0;
5       long prod=1;
6       long MAX_VAL = 2_000_000_000_000_000L;
7       for(int ele:nums){
8        sum+=ele;
9       }
10       for(int i=n-1;i>=0;i--){
11        sum-=nums[i];
12        if(sum==prod) return i; // we loop backwards because there is a umique sol
13        if (prod> MAX_VAL / nums[i]) prod = MAX_VAL;
14        else prod *= nums[i];
15        if(prod>=sum) break;
16       }
17        return -1;
18    }
19}