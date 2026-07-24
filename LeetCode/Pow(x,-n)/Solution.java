1class Solution {
2    public double myPow(double x, int n) {
3        if (n < 0) {
4            return (1 / x) * myPow(1 / x, -(n + 1));
5        }
6       if(n==0) return 1;
7       if(n==1) return x;
8       double half = myPow(x, n / 2);
9    if (n % 2 == 0) return half * half;
10    else return half * half * x;    
11    }
12}