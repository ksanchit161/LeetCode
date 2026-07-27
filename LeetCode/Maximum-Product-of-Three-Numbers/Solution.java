1class Solution {
2    public int maximumProduct(int[] nums) {
3        int[] arr = new int[2001];
4        for (int ele : nums) {
5            arr[ele + 1000]++;
6        }
7
8        // 1. Extract the 2 smallest numbers (min1 <= min2)
9        int min1 = 0, min2 = 0;
10        int count = 0;
11        for (int i = 0; i <= 2000 && count < 2; i++) {
12            while (arr[i] > 0 && count < 2) {
13                if (count == 0) min1 = i - 1000;
14                else min2 = i - 1000;
15                arr[i]--; // Consume this occurrence
16                count++;
17            }
18        }
19
20        // Re-populate frequencies for the max scan
21        // (Only need to restore what we consumed)
22        arr[min1 + 1000]++;
23        if (count > 1) arr[min2 + 1000]++;
24
25        // 2. Extract the 3 largest numbers (max1 >= max2 >= max3)
26        int max1 = 0, max2 = 0, max3 = 0;
27        count = 0;
28        for (int j = 2000; j >= 0 && count < 3; j--) {
29            while (arr[j] > 0 && count < 3) {
30                if (count == 0) max1 = j - 1000;
31                else if (count == 1) max2 = j - 1000;
32                else max3 = j - 1000;
33                arr[j]--; // Consume this occurrence
34                count++;
35            }
36        }
37
38        // Return the maximum of the two possible algebraic cases
39        return Math.max(max1 * max2 * max3, min1 * min2 * max1);
40    }
41}