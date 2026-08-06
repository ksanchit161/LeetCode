1class Solution {
2    public int prod(int x){
3        int product=1;
4        while(x>0){
5            int last=x%10;
6            product*=last;
7            x/=10;
8        }
9        return product;
10    }
11    public int smallestNumber(int n, int t) {
12
13        while(true){
14            if(prod(n)%t==0) return n;
15            else n++;
16        }
17    }
18}