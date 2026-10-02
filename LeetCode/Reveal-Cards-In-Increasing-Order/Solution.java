1class Solution {
2    public int[] deckRevealedIncreasing(int[] deck) {
3        int n = deck.length;
4        Arrays.sort(deck);
5        
6        Deque<Integer> queue = new LinkedList<>();
7        for (int i = 0; i < n; i++) {
8            queue.add(i);
9        }
10        
11        int[] result = new int[n];
12        for (int card : deck) {
13            result[queue.poll()] = card;
14            if (!queue.isEmpty()) {
15                queue.add(queue.poll());
16            }
17        }
18        
19        return result;
20    }
21}