1class Solution {
2 public String sort(char[] brr) {
3    int[] arr = new int[26];
4    for (char ele : brr) {
5        arr[ele - 'a']++;
6    }
7
8    StringBuilder result = new StringBuilder(brr.length);
9    for (int i = 0; i < 26; i++) {
10        while (arr[i] > 0) {
11            result.append((char) (i + 'a'));
12            arr[i]--;
13        }
14    }
15
16    return result.toString();
17}
18    public List<List<String>> groupAnagrams(String[] strs) {
19        HashMap<String,List<String>> map=new HashMap<>();
20        for(String s: strs){
21            String temp=s;
22            char[] ca = s.toCharArray();                 
23            String sorted = sort(ca);
24            map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(temp);
25        }
26        return new ArrayList<>(map.values());
27    }
28}