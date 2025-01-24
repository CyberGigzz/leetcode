
class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0 or (x != 0 and x % 10 == 0):
            return False

        reversedHalf = 0
        while x > reversedHalf:
            reversedHalf = reversedHalf * 10 + x % 10
            x = x // 10
        return x == reversedHalf or x == reversedHalf // 10

if __name__ == '__main__':
    x = 34543
    print(Solution().isPalindrome(x))