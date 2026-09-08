1class Solution {
2    public int maxCoins(int[] piles) {
3        int n=piles.length;
4        int max=-1;
5        int freq[]=new int[10001];
6        for(int ele: piles){
7            freq[ele]++;
8            max=Math.max(max,ele);
9        }
10        int ans=0;
11        int count=0;
12        boolean flag=false;
13        for(int i=max;i>=0;i--){
14            while(freq[i]>0 && count<(n/3)){
15                if(flag){
16                    ans+=i;
17                    freq[i]--;
18                    flag=false;
19                    count++;
20                }
21                else {
22                    freq[i]--;
23                    flag=true;
24                }
25            }
26            if(count==(n/3)) break;
27        }
28        return ans;
29    }
30}