1class Solution {
2    public boolean checkDivisibility(int n) {
3        int sum=0;
4        int prod=1;
5        int temp=n;
6        while(temp>0){
7            int last=temp%10;
8            sum+=last;
9            prod*=last;
10            temp/=10;
11        }
12        sum+=prod;
13        if(sum!=0 && n%sum==0) return true;
14        else return false;
15    }
16}