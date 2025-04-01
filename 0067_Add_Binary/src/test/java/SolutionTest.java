import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testAddBinary() {
        Solution solution = new Solution();
        assertEquals("100", solution.addBinary("11", "1"));
        assertEquals("10101", solution.addBinary("1010", "1011"));
        assertEquals("100110", solution.addBinary("11011", "1011"));
        assertEquals("100000000000", solution.addBinary("11111111111", "1"));
    }


}