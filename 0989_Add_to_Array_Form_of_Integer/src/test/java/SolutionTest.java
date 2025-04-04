import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Random;

import org.junit.jupiter.api.Test;

public class SolutionTest {
    @Test
    void testAddToArrayForm() {
        Solution solution = new Solution();
        assertEquals(solution.addToArrayForm(new int[] {1, 2, 0, 0}, 34), Arrays.asList(1, 2, 3, 4));
        assertEquals(solution.addToArrayForm(new int[] {2, 7, 4}, 181), Arrays.asList(4, 5, 5));
        assertEquals(solution.addToArrayForm(new int[] {2, 1, 5}, 806), Arrays.asList(1, 0, 2, 1));
        assertEquals(solution.addToArrayForm(new int[] {0}, 1), Arrays.asList(1));
    }

    @Test
    void testLargeInput() {
        Solution solution = new Solution();
        Random random = new Random();
        
        // 큰 입력 배열 생성 (10000 자리)
        int[] largeNum = new int[10000];
        for (int i = 0; i < largeNum.length; i++) {
            largeNum[i] = random.nextInt(10);
        }
        
        // 큰 정수 k 생성 (10000 자리)
        int k = 0;
        for (int i = 0; i < 10000; i++) {
            k = k * 10 + random.nextInt(10);
        }
        
        // 실행 시간 측정
        long startTime = System.nanoTime();
        solution.addToArrayForm(largeNum, k);
        long endTime = System.nanoTime();
        
        System.out.println("Large input execution time: " + (endTime - startTime) / 1_000_000 + " ms");
    }

    @Test
    void testWorstCase() {
        Solution solution = new Solution();
        
        // 최악의 경우: 모든 자리가 9인 큰 수
        int[] worstNum = new int[10000];
        Arrays.fill(worstNum, 9);
        int worstK = 999999999;
        
        // 실행 시간 측정
        long startTime = System.nanoTime();
        solution.addToArrayForm(worstNum, worstK);
        long endTime = System.nanoTime();
        
        System.out.println("Worst case execution time: " + (endTime - startTime) / 1_000_000 + " ms");
    }
}
