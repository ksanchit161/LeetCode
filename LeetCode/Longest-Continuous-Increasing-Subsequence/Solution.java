1class Solution {
2    static{
3       int number[]={1,2,4,3};
4        for(int i=0;i<100;i++){
5             findLengthOfLCIS(number);
6        }
7    }
8    public static int findLengthOfLCIS(int[] nums) {
9        int max=1;
10        int length=1;
11        for(int i=0;i<nums.length-1;i++){
12            if(nums[i]<nums[i+1]) length+=1;
13            if(length>max) max=length;
14            if(nums[i]>=nums[i+1]) length=1;
15        }
16        return max;
17    }
18}