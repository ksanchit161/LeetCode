1class Solution {
2public:
3    int peakIndexInMountainArray(vector<int>& arr) {
4        int s = 0;
5        int e = arr.size() - 1;
6
7        while (s < e) {
8            int mid = s + (e - s) / 2;
9
10            if (arr[mid] < arr[mid + 1]) {
11                // We are on increasing slope
12                s = mid + 1;
13            } else {
14                // We are on decreasing slope
15                e = mid;
16            }
17        }
18
19        return s;  // or return e;
20    }
21};
22