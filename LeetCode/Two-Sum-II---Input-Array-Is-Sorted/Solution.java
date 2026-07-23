1class Solution {
2    static{
3        int []num={1,2,3,4,5};
4        for(int i=0;i<1000;i++){
5            twoSum(num,3);
6        }
7    }
8    public static int[] twoSum(int[] numbers, int target) {
9        int start=0;
10        int end=numbers.length-1;
11        int result[]=new int[2];
12        while(start<end){
13            int sum=numbers[start]+numbers[end];
14            if(sum==target){
15                result[0]=start+1;
16                result[1]=end+1;
17                return result;
18            }
19            else if(sum>target) end--;
20            else start++;
21        }
22        return result;
23    }
24}