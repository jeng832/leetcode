import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SolutionTest {

    @Test
    public void testExample1() {
        Solution sol = new Solution();
        int[] nums = new int[] {3,2,2,3};
        int num = sol.removeElement(nums, 3);
        checkAssert(new int[] {2,2}, num, nums);
    }

    @Test
    public void testExample2() {
        Solution sol = new Solution();
        int[] nums = new int[] {0,1,2,2,3,0,4,2};
        int num = sol.removeElement(nums, 2);
        checkAssert(new int[] {0,1,3,0, 4}, num, nums);
    }

    @Test
    public void testExample3() {
        Solution sol = new Solution();
        int[] nums = new int[] {1};
        int num = sol.removeElement(nums, 1);
        checkAssert(new int[] {}, num, nums);
    }

    @Test
    public void testExample4() {
        Solution sol = new Solution();
        int[] nums = new int[] {3, 3};
        int num = sol.removeElement(nums, 3);
        checkAssert(new int[] {}, num, nums);
    }

    @Test
    public void testExample5() {
        Solution sol = new Solution();
        int[] nums = new int[] {};
        int num = sol.removeElement(nums, 0);
        checkAssert(new int[] {}, num, nums);
    }

    @Test
    public void testExample6() {
        Solution sol = new Solution();
        int[] nums = new int[] {4, 5};
        int num = sol.removeElement(nums, 5);
        checkAssert(new int[] {4}, num, nums);
    }
    private void checkAssert(int[] expected, int num, int[] nums) {
        Assert.assertEquals(expected.length, num);
        List<Integer> expectedList = IntStream.of(expected).boxed().collect(Collectors.toList());

        for (int i = 0; i < num; i++) {
            Assert.assertTrue(expectedList.contains(nums[i]));
        }
    }
}
