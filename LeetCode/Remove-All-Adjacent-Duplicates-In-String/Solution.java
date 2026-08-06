1class Solution {
2    public String removeDuplicates(String s) {
3        var result=new StringBuilder("");
4        char []arr=s.toCharArray();
5        for(int i=0;i<arr.length;i++){
6            if(result.length()>0 && result.charAt(result.length()-1)==arr[i]){
7                result.deleteCharAt(result.length()-1);
8            }
9            else result.append(arr[i]);
10        }
11        return result.toString();
12    }
13}