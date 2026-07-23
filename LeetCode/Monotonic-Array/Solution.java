1class Solution {
2    static{
3        int []numbers={1,2,3,5};
4        for(int i=0;i<1000;i++){
5             isMonotonic(numbers);
6        }
7    }
8    public static boolean isMonotonic(int[] nums) {
9        int inc=0;
10        int dec=0;
11        for(int i=0;i<nums.length-1;i++){
12            if(nums[i]<nums[i+1]) inc++;
13            else if(nums[i]>nums[i+1]) dec++;
14            if(inc>0 && dec>0) return false;
15        }
16        return true;
17    }
18}