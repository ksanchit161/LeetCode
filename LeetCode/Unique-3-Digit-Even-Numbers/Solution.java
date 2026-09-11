1class Solution {
2    public int totalNumbers(int[] digits) {
3        int arr[]=new int[10];
4        int count=0;
5        for(int ele: digits){
6            arr[ele]++;
7        }
8        for(int i=100;i<999;i+=2){
9            boolean flag =true;
10            int hun=i/100;
11            int ten = (i/ 10) % 10;
12            int unit = i % 10;
13            arr[hun]--;
14            arr[ten]--;
15            arr[unit]--;
16            if(arr[hun]>=0 && arr[ten]>=0 && arr[unit]>=0) count++;
17            arr[hun]++;
18            arr[ten]++;
19            arr[unit]++;
20        }
21        return count;
22
23    }
24}