1class Solution {
2    public double[] convertTemperature(double celsius) {
3        double ans[]=new double[2];
4        ans[0]=celsius+273.15;
5        ans[1]=celsius*1.80+32.00;
6        return ans;
7    }
8}