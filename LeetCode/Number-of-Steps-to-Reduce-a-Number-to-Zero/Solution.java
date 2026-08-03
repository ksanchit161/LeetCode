1class Solution {
2    public int numberOfSteps(int num) {
3        int count=0;
4        while(num!=0){
5            if(num%2==0){
6                num/=2;
7                count++;
8            }
9            else{
10                num--;
11                count++;
12            }
13        }
14        return count;
15    }
16}