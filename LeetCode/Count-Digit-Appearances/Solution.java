1class Solution {
2    public int countDigitOccurrences(int[] nums, int digit) {
3        int result=0;
4        for(int i=0;i<nums.length;i++){
5           int num=nums[i];
6           while(num>0){
7            int last=num%10;
8            if(last==digit) result++;
9            num/=10;
10           }
11        }
12        return result;
13    }
14}