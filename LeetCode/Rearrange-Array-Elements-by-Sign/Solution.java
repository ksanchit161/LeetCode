1class Solution {
2    public int[] rearrangeArray(int[] nums) {
3        int []pos=new int[nums.length/2];
4        int []neg=new int[nums.length/2];
5        int i=0;
6        int j=0;
7        for(int ele:nums){
8            if(ele>0) pos[i++]=ele;
9            else neg[j++]=ele;
10        }
11        int k=0;
12        i=0;
13        j=0;
14        for(int l=0;l<(nums.length/2);l++){
15            nums[k++]=pos[i++];
16            nums[k++]=neg[j++];
17        }
18        return nums;
19    }
20}