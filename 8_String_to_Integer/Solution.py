class Solution:
    def myAtoi(self, str: str) -> int:
        if len(str) == 0:
            return 0
        stripStr = str.lstrip()
        numStarted = False
        startIdx = 0
        endIdx = 1
        negative = False
        for i in range(len(stripStr)):
            if i == 0 and (stripStr[i] == '+' or stripStr[i] == '-'):
                negative = True if stripStr[i] == '-' else False
                continue
            if '0' <= stripStr[i] <= '9':
                if numStarted is False:
                    startIdx = i
                    numStarted = True
                endIdx = i + 1
            else:
                if numStarted is False:
                    return 0
                endIdx = i
                break
        if numStarted is False:
            return 0
        ret = int(stripStr[startIdx:endIdx])
        ret = ret if negative is False else (-1 * ret)
        if ret > 2**31 - 1:
            return 2**31 - 1
        if ret < -2**31:
            return -2**31
        return ret