1class Solution {
2    public int numIdenticalPairs(int[] nums) {
3        int arr[]=new int [101];
4        for(int ele:nums){
5            arr[ele]+=1;
6        }
7        int result=0;
8        for(int i=1;i<101;i++){
9            int n=arr[i];
10            result+=((n*(n+1)/2)-n);
11        }
12        return result;
13    }
14}