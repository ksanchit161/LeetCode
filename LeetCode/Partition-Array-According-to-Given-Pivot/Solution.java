1class Solution {
2    public int[] pivotArray(int[] nums, int pivot) {
3        int count1=0;// less
4        int count2=0;// equal
5        int count3=0;//more
6        int []result=new int[nums.length];
7        for(int i=0;i<nums.length;i++){
8            if(nums[i]==pivot) count2++;
9            else if(nums[i]>pivot) count3++;
10            else count1++;
11        }
12        count2+=count1;
13
14        int j=0;
15          for(int i=0;i<nums.length;i++){
16            if(nums[i]==pivot) result[count1++]=nums[i];
17            else if(nums[i]>pivot) result[count2++]=nums[i] ;
18            else result[j++]=nums[i];
19        }
20        return result;
21
22    }
23}