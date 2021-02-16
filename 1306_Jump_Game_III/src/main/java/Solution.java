import java.util.*;

class Solution {
    public boolean canReach(int[] arr, int start) {
        List<Integer> destinations = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                destinations.add(i);
            }
        }
        Queue<Integer> visit = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        visit.offer(start);
        while (!visit.isEmpty()) {
            Integer index = visit.poll();
            if (destinations.contains(index)) return true;
            visited.add(index);
            if (index + arr[index] < arr.length && !visit.contains(index + arr[index]) && !visited.contains(index + arr[index])) visit.offer(index + arr[index]);
            if (index - arr[index] >= 0 && !visit.contains(index - arr[index]) && !visited.contains(index - arr[index])) visit.offer(index - arr[index]);
        }
        return false;
    }
}
