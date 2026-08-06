1class Solution {
2    public int climbStairs(int n) {
3    if(n==1 || n==2) return n;
4    int one_below=1;
5    int two_below=2;
6    int current_way=0;
7    for(int i=3;i<=n;i++){
8        current_way=one_below+two_below;
9        one_below=two_below;
10        two_below=current_way;
11        
12    }
13    return current_way;
14    }
15}