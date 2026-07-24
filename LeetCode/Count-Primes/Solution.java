1class Solution {
2    public int countPrimes(int n) {
3        if(n<=1) return 0;
4        boolean arr[]=new boolean[n];
5        Arrays.fill(arr,true);
6        arr[0]=false;
7        arr[1]=false;
8        for(int i=2;i*i<n;i++){
9            if(arr[i]){
10                for(int j=i*i;j<n;j+=i){
11                    arr[j]=false;
12                }
13            }
14        }
15        int count=0;
16        for(int i=0;i<n;i++){
17            if(arr[i]) count+=1;
18        }
19        return count;
20    }
21}