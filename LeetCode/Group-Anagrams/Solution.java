1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        Map<String, List<String>> map = new HashMap<>();
4
5        for (String s : strs) {
6            int[] count = new int[26];
7            for (int i = 0; i < s.length(); i++) {
8                count[s.charAt(i) - 'a']++;
9            }
10
11            // Create a fixed-format key, e.g., "#1#0#0#0#2..."
12            StringBuilder sb = new StringBuilder();
13            for (int c : count) {
14                sb.append('#').append(c);
15            }
16            String key = sb.toString();
17
18            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
19        }
20
21        return new ArrayList<>(map.values());
22    }
23}