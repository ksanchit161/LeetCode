1class Solution {
2    public int minOperations(int n) {
3        int result=0;
4        int []arr=new int[n];
5        for(int i=0;i<n;i++){
6            arr[i]=(2*i)+1;
7        }
8        int num=(arr[n-1]+1)/2;
9
10        for(int i=0;i<n/2;i++){
11            result+=num-arr[i];
12        }
13        return result;
14        
15    }
16}