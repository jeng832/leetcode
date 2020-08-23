import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    private Map<Integer, Set<List<Integer>>> makeSubSumMap(int[] nums) {
        Map<Integer, Set<List<Integer>>> subSumMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                Integer key = nums[i] + nums[j];
                List<Integer> indexList = new ArrayList<>();
                indexList.add(i);
                indexList.add(j);
                indexList.sort(Comparator.comparingInt(e -> nums[e]));
                if (subSumMap.containsKey(key)) {
                    subSumMap.get(key).add(indexList);
                } else {
                    Set<List<Integer>> set = new HashSet<>();
                    set.add(indexList);
                    subSumMap.put(key, set);
                }
            }
        }
        return subSumMap;
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Map<Integer, Set<List<Integer>>> subSumMap = makeSubSumMap(nums);
        List<List<Integer>> ret = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (subSumMap.containsKey(num * -1)) {
                Set<List<Integer>> subSum = subSumMap.get(num * -1);
                for (List<Integer> elem : subSum) {
                    if (elem.contains(i)) continue;
                    List<Integer> list = new ArrayList<>(elem).stream().map(e -> nums[e]).collect(Collectors.toList());
                    list.add(num);
                    list.sort(Integer::compareTo);
                    ret.add(list);
                }
            }
        }
        return ret.stream().distinct().collect(Collectors.toList());
    }
}

