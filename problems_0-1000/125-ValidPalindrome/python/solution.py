class Solution:
    def isPalindrome(self, s: str) -> bool:
        cleaned = []
        for c in s:
            if 'a' <= c <= 'z' or '0' <= c <= '9':
                cleaned.append(c)
            elif 'A' <= c <= 'Z':
                cleaned.append(chr(ord(c) + 32))

        left, right = 0, len(cleaned) - 1
        while left < right:
            if cleaned[left] != cleaned[right]:
                return False
            left += 1
            right -= 1
        return True


if __name__ == '__main__':
    s = Solution()
    s.isPalindrome("A man, a plan, a canal: Panama")
    # print(s.isPalindrome("A man, a plan, a canal: Panama"))