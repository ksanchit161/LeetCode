1class Solution {
2    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
3        int result=0;
4        for(int i=0;i<hours.length;i++){
5            if(hours[i]>=target) result++;
6        }
7        return result;
8    }
9}