1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        int m=nums1.length;
4        int n=nums2.length;
5        int []arr=new int[m+n];
6        int i=0,j=0,k=0;
7        double ans=0.00;
8        while(i<m && j<n){
9        if(nums1[i]<nums2[j]){
10            arr[k++]=nums1[i++];
11        }
12        else{
13            arr[k++]=nums2[j++];
14        }
15        }
16        while(i<m){
17            arr[k++]=nums1[i++];
18        }
19         while(j<n){
20            arr[k++]=nums2[j++];
21        }
22        int size=arr.length;
23
24        if(size%2==0){
25        ans= (arr[size/2]+arr[(size/2)-1])/2.0;
26        }
27        else  ans=(arr[size/2]);
28        return ans;
29      
30    }
31}