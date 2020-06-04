class Solution:
    def getSize(self, num: int):
        count = 0
        n = num
        while n / 10 >= 1:
            count = count + 1
            n = n / 10
        return count + 1

    def checkPalindrome(self, num: int, prevSize: int) -> bool:
        if num < 0:
            return False
        curSize = self.getSize(num)
        if prevSize - curSize > 2:
            diff = prevSize - curSize - 2
            for i in range(diff):
                if num % 10 != 0:
                    return False
                else:
                    num = num / 10
                    curSize = curSize - 1
        if num < 10:
            return True
        div = 1
        for i in range(curSize - 1):
            div = div * 10

        left = int(num / div)
        right = int(num % 10)

        return left == right and self.checkPalindrome(int(num % div / 10), curSize)

    def isPalindrome(self, x: int) -> bool:
        return self.checkPalindrome(x, self.getSize(x))