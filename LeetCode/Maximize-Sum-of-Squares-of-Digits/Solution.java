1class Solution {
2    public String maxSumOfSquares(int num, int sum) {
3        StringBuilder ans=new StringBuilder("");
4        while(num>0){
5            if(sum>=9){
6                ans.append(9);
7                sum-=9;
8                num--;
9            }
10            else{
11                ans.append(sum);
12                sum-=sum;
13                num--;
14            }
15        }
16        if(sum>0) return "";
17        else return ans.toString();
18    }
19}