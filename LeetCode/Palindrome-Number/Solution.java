1class Solution {
2    public boolean isPalindrome(int x) {
3        if (x < 0) {
4            return false;
5        }
6
7        int original = x;
8        int reverse = 0;
9
10        while (x != 0) {
11            int digit = x % 10;
12            reverse = reverse * 10 + digit;
13            x = x / 10;
14        }
15
16        return original == reverse;
17    }
18}