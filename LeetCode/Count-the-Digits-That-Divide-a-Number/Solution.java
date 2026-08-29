1class Solution {
2    public int countDigits(int num) {
3        int temp=num;
4        int count=0;
5        while(temp>0){
6            int last=temp%10;
7            if(num%last==0) count++;
8            temp/=10;
9        }
10        return count;
11    }
12}