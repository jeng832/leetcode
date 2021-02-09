import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Solution {
    static class IndexRange {
        int start;
        int end;
        private IndexRange(int s, int e) {
            start = s;
            end = e;
        }
        static IndexRange of(int s, int e) {
            return new IndexRange(s, e);
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            IndexRange that = (IndexRange) o;
            return start == that.start &&
                    end == that.end;
        }

        @Override
        public int hashCode() {
            return Objects.hash(start, end);
        }
    }

    Map<IndexRange, Integer> subSumMap = new HashMap<>();
    public int maxSubArray(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                max = Math.max(max, subSum(nums, i, j));
            }

        }
        return max;
    }

    private int subSum(int[] nums, int start, int end) {
        // System.out.println("start: " + start + ", end: "+ end + ", count: " + count());
        final IndexRange indexRange = IndexRange.of(start, end);
        if (subSumMap.containsKey(indexRange)) return subSumMap.get(indexRange);

        if (start == end) {
            subSumMap.put(indexRange, nums[start]);
        } else {
            IndexRange headless = IndexRange.of(start + 1, end);
            if (!subSumMap.containsKey(headless)) {
                subSumMap.put(headless, subSum(nums, start + 1, end));
            }
            subSumMap.put(indexRange, subSumMap.get(headless) + nums[start]);
        }

        return subSumMap.get(indexRange);
    }
}
