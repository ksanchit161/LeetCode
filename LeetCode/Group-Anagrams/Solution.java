1import java.util.*;
2
3class Solution {
4    public List<List<String>> groupAnagrams(String[] strs) {
5        if (strs == null || strs.length == 0) {
6            return Collections.emptyList();
7        }
8
9        // Pre-size map to avoid costly rehashing
10        Map<String, List<String>> map = new HashMap<>((int) (strs.length / 0.75f) + 1);
11
12        for (String s : strs) {
13            // 1. Frequency count without allocating an initial char[]
14            int[] count = new int[26];
15            int len = s.length();
16            for (int i = 0; i < len; i++) {
17                count[s.charAt(i) - 'a']++;
18            }
19
20            // 2. Linear O(K) reconstruction of sorted char array
21            char[] sorted = new char[len];
22            int idx = 0;
23            for (int i = 0; i < 26; i++) {
24                while (count[i] > 0) {
25                    sorted[idx++] = (char) ('a' + i);
26                    count[i]--;
27                }
28            }
29
30            // 3. Compact canonical key (shorter & faster to hash than "#1#0#2...")
31            String key = new String(sorted);
32
33            // 4. Direct lookup avoids lambda allocation from computeIfAbsent
34            List<String> list = map.get(key);
35            if (list == null) {
36                list = new ArrayList<>();
37                map.put(key, list);
38            }
39            list.add(s);
40        }
41
42        return new ArrayList<>(map.values());
43    }
44}