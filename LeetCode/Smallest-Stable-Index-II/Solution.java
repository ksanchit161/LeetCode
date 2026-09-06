1class Solution {
2    public int firstStableIndex(int[] nums, int k) {
3        int n=nums.length;
4        int arr[]=new int [n];
5        int min=nums[n-1];
6        arr[n-1]=min;
7        for(int i=n-2;i>=0;i--){
8            if(nums[i]<min){
9                min=nums[i];
10            }
11            arr[i]=min;
12        }
13        int max=-1;
14        for(int i=0;i<n;i++){
15            if(nums[i]>max) max=nums[i];
16            if((max-arr[i])<=k) return i;
17        }
18        return -1;
19    }
20}