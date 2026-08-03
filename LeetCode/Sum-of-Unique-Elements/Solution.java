1class Solution {
2    public int sumOfUnique(int[] nums) {
3        int sum=0;
4        int [] arr=new int[101];
5        for(int ele: nums){
6            arr[ele]+=1;
7        }
8        for(int i=1;i<=100;i++){
9            if(arr[i]==1) sum+=i;
10        }
11        return sum;
12    }
13}