1class Solution {
2    public int maximum69Number (int num) {
3        char[] arr = String.valueOf(num).toCharArray();
4        var result=new StringBuilder("");
5        boolean flag=true;
6        for(int i=0;i<arr.length;i++){
7            if(arr[i]=='6' && flag){
8                result.append('9');
9                flag=false;
10            }
11            else result.append(arr[i]);
12        }
13        return Integer.parseInt(result.toString());
14
15    }
16}