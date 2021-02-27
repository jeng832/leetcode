import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testExample1() {
        Solution sol = new Solution();

        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        boolean actual = sol.exist(board, "ABCCED");
        Assert.assertEquals(true, actual);
    }

    @Test
    public void testExample2() {
        Solution sol = new Solution();

        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        boolean actual = sol.exist(board, "SEE");
        Assert.assertEquals(true, actual);
    }

    @Test
    public void testExample3() {
        Solution sol = new Solution();

        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        boolean actual = sol.exist(board, "ABCB");
        Assert.assertEquals(false, actual);
    }
}