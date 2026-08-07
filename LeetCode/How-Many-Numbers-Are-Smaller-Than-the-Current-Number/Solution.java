1class Solution {
2    public int comp(int element,int[]arr){
3        int count=0;
4        for(int i=0;i<element;i++){
5            if(arr[i]>0) count+=arr[i];
6        }
7        return count;
8    }
9    public int[] smallerNumbersThanCurrent(int[] nums) {
10        int []arr=new int[101];
11        int []result=new int[nums.length];
12        for(int ele:nums){
13            arr[ele]+=1;
14        }
15        for(int i=0;i<nums.length;i++){
16            result[i]=comp(nums[i],arr);
17        }
18        return result;
19        
20       
21    }
22}