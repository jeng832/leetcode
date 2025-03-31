import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    void testMultiply() {
        assertEquals("891", solution.multiply("9", "99"));
        assertEquals("81", solution.multiply("9", "9"));
        assertEquals("6", solution.multiply("2", "3"));
        assertEquals("56088", solution.multiply("123", "456"));
        assertEquals("1000000000000", solution.multiply("1000000", "1000000"));
    }
} 