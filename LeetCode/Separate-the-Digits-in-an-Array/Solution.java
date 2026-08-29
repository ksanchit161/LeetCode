1class Solution {
2    public int[] separateDigits(int[] nums) {
3       var arr=new StringBuilder("");
4        for(int i=0;i<nums.length;i++){
5            var temp=new StringBuilder("");
6            while(nums[i]>0){
7                int last=nums[i]%10;
8                temp.append(last);
9                nums[i]/=10;
10            }
11            arr.append(temp.reverse());
12        }
13        int k=0;
14        int result[]=new int[arr.length()];
15        for(int i=0;i<arr.length();i++){
16            result[k++]=(int)(arr.charAt(i)-'0');
17        }
18        return result;
19    }
20}