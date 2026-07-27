1class Solution {
2    public int findKthPositive(int[] arr, int k) {
3        int []nums=new int [2001];
4        for(int ele: arr){
5            nums[ele]+=1;
6        }
7        int brr[]=new int[1001];
8        int l=0;
9        for(int i=1;i<2001 && l<k;i++){
10            if(nums[i]==0) brr[l++]=i;
11        }
12        return brr[k-1];
13    }
14}