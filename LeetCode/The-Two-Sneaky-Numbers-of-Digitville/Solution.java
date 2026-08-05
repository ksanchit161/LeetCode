1class Solution {
2    public int[] getSneakyNumbers(int[] nums) {
3       int res[]=new int[2];
4       int k=0;
5       int n=nums.length-2;
6       boolean seen[]=new boolean[n];
7       for(int ele:nums){
8        if(seen[ele]) res[k++]=ele;
9        if(k==2) break;
10        seen[ele]=true;
11       } 
12       return res;
13    }
14}