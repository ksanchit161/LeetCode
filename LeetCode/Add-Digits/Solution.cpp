1class Solution {
2    public int sum(int number){
3        int sum=0;
4        while(number>0){
5            int last=number%10;
6            sum+=last;
7            number/=10;
8        }
9        return sum;
10    }
11    public int addDigits(int num) {
12        int result=num;
13        while(result>9){
14            result=sum(result);
15        }
16        return result;
17
18    }
19}