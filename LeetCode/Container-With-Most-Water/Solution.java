1class Solution {
2    public int maxArea(int[] height) {
3        int i=0;
4        int j=height.length-1;
5        int max=0,area;
6        while(i<j){
7            area=Math.min(height[i],height[j])*(j-i);
8            if(area>max) max=area;
9            if(height[i]>height[j]) j--;
10            else if(height[i]<=height[j]) i++;
11        }
12        return max;
13    }
14}