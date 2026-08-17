1class Solution {
2    static{
3        int []number={0,1,1,1,1,0};
4        for(int i=0;i<100;i++){
5            findMaxConsecutiveOnes(number);
6        }
7    }
8    public static  int findMaxConsecutiveOnes(int[] nums) {
9        int max=0;
10        int count=0;
11        for(int i=0;i<nums.length;i++){
12            if(nums[i]==1) count++;
13            if(count>max) max=count;
14            if(nums[i]!=1) count=0;
15        }
16        return max;
17
18    }
19}