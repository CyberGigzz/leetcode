import math

class Solution:
    def gcdOfStrings(self, str1: str, str2: str) -> str:
        if str1 + str2 != str2 + str1:
            return ""

        if str1 == str2:
            return str1

        gcd_len = math.gcd(len(str1), len(str2))

        return str1[:gcd_len]
        

if __name__ == '__main__':
    str1 = "ABCABC"
    str2 = "ABC"
    print(Solution().gcdOfStrings(str1, str2))