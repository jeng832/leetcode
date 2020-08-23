import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    private Map<Integer, List<List<Integer>>> subSumMap;

    private Map<Integer, List<List<Integer>>> makeSubSumMap(int[] nums) {
        Map<Integer, List<List<Integer>>> subSumMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (subSumMap.containsKey(nums[i] + nums[j])) {
                    List<Integer> list = new ArrayList<>();
                    list.addAll(Arrays.asList(nums[i], nums[j]));
                    subSumMap.get(nums[i] + nums[j]).add(list);
                } else {
                    List<List<Integer>> subSum = new ArrayList<>();
                    List<Integer> list = new ArrayList<>();
                    list.addAll(Arrays.asList(nums[i], nums[j]));
                    subSum.add(list);
                    subSumMap.put(nums[i] + nums[j], subSum);
                }

            }
        }
        return subSumMap;
    }

    public List<List<Integer>> threeSum(int[] nums) {
        subSumMap = makeSubSumMap(nums);
        List<List<Integer>> ret = new ArrayList<>();
        Set<Integer> set = IntStream.of(nums).boxed()
                .collect(Collectors.toCollection(HashSet::new));
        for (int num : set) {
            List<List<Integer>> subSum = subSumMap.get(num * -1);
            if (subSum == null) continue;
            subSum.stream().forEach(list -> {
                list.add(num);
                list.sort(Integer::compareTo);
            });
            ret.addAll(subSum);
        }
        return ret.stream().distinct().collect(Collectors.toList());
    }
}

