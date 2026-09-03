1class Solution {
2    public int majorityElement(int[] nums) {
3        int candidate = 0;
4        int count = 0;
5        
6        for (int num : nums) {
7            // If count falls to 0, pick a new candidate
8            if (count == 0) {
9                candidate = num;
10            }
11            
12            // If it's our candidate, add a soldier. If not, lose a soldier.
13            if (num == candidate) {
14                count++;
15            } else {
16                count--;
17            }
18        }
19        
20        return candidate;
21    }
22}