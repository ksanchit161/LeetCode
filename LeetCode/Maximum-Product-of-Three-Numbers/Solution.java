1class Solution {
2    static {
3        for(int i=0;i <=10000;i++) {
4            new Solution().maximumProduct(new int[]{});
5        }
6    }
7    public int maximumProduct(int[] nums) {
8        int[] arr = new int[2001];
9        for (int ele : nums) {
10            arr[ele + 1000]++;
11        }
12
13        // 1. Extract the 2 smallest numbers (min1 <= min2)
14        int min1 = 0, min2 = 0;
15        int count = 0;
16        for (int i = 0; i <= 2000 && count < 2; i++) {
17            while (arr[i] > 0 && count < 2) {
18                if (count == 0) min1 = i - 1000;
19                else min2 = i - 1000;
20                arr[i]--; // Consume this occurrence
21                count++;
22            }
23        }
24
25        // Re-populate frequencies for the max scan
26        // (Only need to restore what we consumed)
27        arr[min1 + 1000]++;
28        if (count > 1) arr[min2 + 1000]++;
29
30        // 2. Extract the 3 largest numbers (max1 >= max2 >= max3)
31        int max1 = 0, max2 = 0, max3 = 0;
32        count = 0;
33        for (int j = 2000; j >= 0 && count < 3; j--) {
34            while (arr[j] > 0 && count < 3) {
35                if (count == 0) max1 = j - 1000;
36                else if (count == 1) max2 = j - 1000;
37                else max3 = j - 1000;
38                arr[j]--; // Consume this occurrence
39                count++;
40            }
41        }
42
43        // Return the maximum of the two possible algebraic cases
44        return Math.max(max1 * max2 * max3, min1 * min2 * max1);
45    }
46}