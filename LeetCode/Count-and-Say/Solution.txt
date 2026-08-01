1class Solution {
2    public String ans(String s){
3        char []arr=s.toCharArray();
4        var result=new StringBuilder("");
5        int count=1;
6        char prev=arr[0];
7        for(int i=1;i<arr.length;i++){
8            if(arr[i]==prev) count+=1;
9            else{
10                result.append(count);
11                result.append(prev);
12                prev=arr[i];
13                count=1;
14            }
15        }
16        
17        result.append(count);
18        result.append(prev);
19        
20        return result.toString();
21    }
22    public String countAndSay(int n) {
23        if(n==1) return "1";
24        return ans(countAndSay(n-1));
25    }
26}