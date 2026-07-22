1class Solution {
2    public char nextGreatestLetter(char[] letters, char target) {
3        int start=0;
4        int end=letters.length-1;
5        char ans=letters[0];
6        while(start<=end){
7            int mid=start+(end-start)/2;
8            if(letters[mid]==target) start=mid+1;
9            else if(letters[mid]<target) start=mid+1;
10            else{
11                ans=letters[mid];
12                end=mid-1;
13            }
14        }
15        return ans;
16    }
17}