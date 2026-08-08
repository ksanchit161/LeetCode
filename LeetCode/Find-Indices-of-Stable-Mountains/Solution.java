1class Solution {
2    public List<Integer> stableMountains(int[] height, int threshold) {
3        List<Integer>result=new ArrayList<>();
4        for(int i=1;i<height.length;i++){
5            if(height[i-1]>threshold) result.add(i);
6        }
7        return result;
8    }
9}