import unittest

from Solution import Solution


class MyTestCase(unittest.TestCase):
    def test_myAtoi(self):
        sol = Solution()
        self.assertEqual(42, sol.myAtoi("42"))
        self.assertEqual(-42, sol.myAtoi("   -42"))
        self.assertEqual(4193, sol.myAtoi("4193 with words"))
        self.assertEqual(-2147483648, sol.myAtoi("-91283472332"))
        self.assertEqual(0, sol.myAtoi(""))
        self.assertEqual(0, sol.myAtoi("+"))
        self.assertEqual(1, sol.myAtoi("+1"))

if __name__ == '__main__':
    unittest.main()

