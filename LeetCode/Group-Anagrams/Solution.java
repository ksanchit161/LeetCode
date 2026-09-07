1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        HashMap<String,List<String>> map=new HashMap<>();
4        for(int i=0;i<strs.length;i++){
5            String temp=strs[i];
6            char[] ca = strs[i].toCharArray(); 
7            Arrays.sort(ca);                  
8            String sorted = new String(ca);
9            map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(temp);
10        }
11        return new ArrayList<>(map.values());
12    }
13}