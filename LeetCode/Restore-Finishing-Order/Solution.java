1class Solution {
2    public int[] recoverOrder(int[] order, int[] friends) {
3        int []arr=new int [order.length+1];
4        int []result=new int[friends.length];
5        int k=0;
6        for(int ele:friends){
7            arr[ele]+=1;
8        }
9        for(int ele:order){
10            if(arr[ele]>=1) result[k++]=ele;
11        }
12        return result;
13    }
14}