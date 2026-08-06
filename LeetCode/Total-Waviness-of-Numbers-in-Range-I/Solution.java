1class Solution {
2    public int check(int num){
3        char[] arr = String.valueOf(num).toCharArray();
4        int count=0;
5        for(int i=1;i<arr.length-1;i++){
6            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) count++;
7            if(arr[i]<arr[i-1] && arr[i]<arr[i+1]) count++;
8        }
9        return count;
10    }
11
12    public int totalWaviness(int num1, int num2) {
13        int result=0;
14        for(int i=num1;i<=num2;i++){
15            if(i<100) continue;
16            result+=check(i);
17        }
18        return result;
19    }
20}