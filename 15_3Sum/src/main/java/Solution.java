import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {

    private final int pairNum = 3;
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) return Collections.EMPTY_LIST;
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            List<Integer> threeNums = new ArrayList<>();
            threeNums.add(i);
            dfs(nums, threeNums, set);
        }
        return new ArrayList<>(set);
    }

    private void dfs(int[] nums, List<Integer> zeroNums, Set<List<Integer>> set) {
        //System.out.println("threeNums: " + threeNums + ", set: " + set);
        if (zeroNums.size() == pairNum) {
            int sum = 0;
            for (Integer num : zeroNums) {
                sum += nums[num];
            }
            if (sum == 0) {
                set.add(zeroNums.stream().map(e -> nums[e]).sorted().collect(Collectors.toList()));
            }
            return;
        }

        int lastIdx = zeroNums.size();
        int last = zeroNums.get(lastIdx - 1);
        int subSum = 0;
        for (Integer num : zeroNums) {
            subSum += nums[num];
        }
        for (int i = last + 1; i < nums.length; i++) {
            if (zeroNums.contains(i)) continue;
            if (lastIdx == (pairNum - 1) && subSum + nums[i] > 0) break;
            List<Integer> sub = new ArrayList<>(zeroNums);
            sub.add(i);
            dfs(nums, sub, set);
        }
    }

    public List<List<Integer>> threeSum2(int[] nums) {
        if (nums.length < 3) return Collections.EMPTY_LIST;
        Map<Integer, List<List<Integer>>> map = new HashMap<>();
        Set<List<Integer>> set = new HashSet<>();
        Set<Integer> numSet = IntStream.of(nums).boxed().collect(Collectors.toSet());

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (!numSet.contains((nums[i] + nums[j]) * -1)) continue;
                List<Integer> three = new ArrayList<>();
                three.add(i);
                three.add(j);
                if (map.containsKey(nums[i] + nums[j])) {
                    map.get(nums[i] + nums[j]).add(three);
                } else {
                    List<List<Integer>> list = new ArrayList<>();
                    list.add(three);
                    map.put(nums[i] + nums[j], list);
                }
            }
        }


        Set<Integer> checked = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (checked.contains(nums[i] * -1)) continue;
            if (!map.containsKey(nums[i] * -1)) continue;
            List<List<Integer>> list = map.get(nums[i] * -1);
            for (List<Integer> e : list) {
                if(e.contains(i) || e.size() == 3) continue;
                e.add(i);
                set.add(e.stream().map(elem -> nums[elem]).sorted().collect(Collectors.toList()));
            }
            checked.add(nums[i] * -1);
        }
        return new ArrayList<>(set);
    }

    public List<List<Integer>> threeSum3(int[] nums) {
        if (nums.length < 3) return Collections.EMPTY_LIST;
        Arrays.sort(nums);
        List<Integer> numList = IntStream.of(nums).boxed().collect(Collectors.toList());
        Map<Integer, Set<List<IndexNum>>> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (!numList.contains((nums[i] + nums[j]) * -1)) continue;
                List<IndexNum> three = new ArrayList<>();
                if (nums[i] < nums[j]) {
                    three.add(new IndexNum(i, nums[i]));
                    three.add(new IndexNum(j, nums[j]));
                } else {
                    three.add(new IndexNum(j, nums[j]));
                    three.add(new IndexNum(i, nums[i]));
                }
                if (map.getOrDefault(nums[i] + nums[j], Collections.EMPTY_SET).contains(three)) continue;

                if (map.containsKey(nums[i] + nums[j])) {
                    map.get(nums[i] + nums[j]).add(three);
                } else {
                    Set<List<IndexNum>> set = new HashSet<>();
                    set.add(three);
                    map.put(nums[i] + nums[j], set);
                }

            }
        }

        Set<Integer> checked = new HashSet<>();
        Set<List<IndexNum>> answers = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (checked.contains(nums[i] * -1)) continue;
            if (!map.containsKey(nums[i] * -1)) continue;
            Set<List<IndexNum>> set = map.get(nums[i] * -1);
            for (List<IndexNum> e : set) {
                int finalI = i;
                if (e.stream().anyMatch(indexNum -> indexNum.index == finalI)) continue;
                if(e.size() == 3) continue;
                e.add(new IndexNum(i, nums[i]));
                answers.add(e.stream().sorted(Comparator.comparingInt(a -> a.number)).collect(Collectors.toList()));
            }
            checked.add(nums[i] * -1);
        }

        return new ArrayList<>(answers.stream()
                .map(indexNums -> Arrays.asList(indexNums.get(0).number, indexNums.get(1).number, indexNums.get(2).number))
                .collect(Collectors.toSet()));

    }

    class IndexNum {
        int index;
        int number;
        IndexNum(int index, int number) {
            this.index = index;
            this.number = number;
        }
    }
}

