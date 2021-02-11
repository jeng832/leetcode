import java.util.*;

class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> grays = new ArrayList<>();
        grays.add(0);
        Queue<Integer> remain = new LinkedList<>();
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        double max = Math.pow(2, n);
        for (int i = 1; i < max; i++) {
            pQueue.offer(i);
        }
        int before = 0;

        while (!pQueue.isEmpty()) {
            int num = pQueue.poll();
            if (Integer.bitCount(before ^ num) == 1) {
                grays.add(num);
                before = num;
                pQueue.addAll(remain);
                remain.clear();
            } else {
                remain.offer(num);
            }
        }

        return grays;
    }
}