import unittest

from Solution import Solution


class MyTestCase(unittest.TestCase):

    def test_solution(self):
        sol = Solution()
        self.assertEqual(True, sol.isPalindrome(121))
        self.assertEqual(False, sol.isPalindrome(-121))
        self.assertEqual(False, sol.isPalindrome(10))
        self.assertEqual(False, sol.isPalindrome(1000021))

    def test_solution2(self):
        sol = Solution()
        self.assertEqual(True, sol.isPalindrome(1012101))

    def test_size(self):
        sol = Solution()
        self.assertEqual(7, sol.getSize(1012101))
if __name__ == '__main__':
    unittest.main()
