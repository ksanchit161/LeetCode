1class Solution {
2    public int smallestIndex(int[] nums) {
3        for(int i=0;i<nums.length;i++){
4            int sum=0;
5            int ele=nums[i];
6            while(ele>0){
7                sum+=(ele%10);
8                ele/=10;
9            }
10            if(sum==i) return i;
11        }
12        return -1;
13    
14    }
15}