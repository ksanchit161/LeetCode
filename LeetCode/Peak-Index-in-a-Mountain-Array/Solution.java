1class Solution {
2    public int peakIndexInMountainArray(int[] arr) {
3        int start=0;
4        int end=arr.length-1;
5        int ans=-1;
6     
7        while(start<=end){
8            int mid = start+(end-start)/2;
9            if(arr[mid]<arr[mid+1]) start=mid+1;
10            else {
11                ans=mid;
12                end=mid-1;
13            }
14        }
15        return ans;
16    }
17}