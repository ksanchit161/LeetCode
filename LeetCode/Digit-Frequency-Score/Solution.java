1class Solution {
2    public int digitFrequencyScore(int n) {
3        int arr[]=new int[10];
4        while(n>0){
5            int last=n%10;
6            arr[last]+=1;
7            n/=10;
8        }
9        int sum=0;
10        for(int i=1;i<10;i++){
11            sum+=arr[i]*i;
12        }
13        return sum;
14    }
15}