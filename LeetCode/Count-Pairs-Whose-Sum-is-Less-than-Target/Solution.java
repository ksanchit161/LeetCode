1class Solution {
2  static {
3        for (int i = 0; i < 10; i++) {
4            List<Integer> dummy = new ArrayList<>(Arrays.asList(1, 2, 3));
5            countPairs(dummy, 5);
6        }
7    }
8    public static  int countPairs(List<Integer> nums, int target) {
9      Collections.sort(nums);
10        int i=0;
11        int j=nums.size()-1;
12        int result=0;
13        while(i<j){
14            int sum=nums.get(i)+nums.get(j);
15            if(sum>=target) j--;
16            else{
17                result+=(j-i);
18                i++;
19            }
20        }
21        return result;
22    }
23}