class Solution:
    def reverseVowels(self, s: str) -> str:
        left = 0
        right = len(s) - 1
        s_list = list(s)  # Convert to list once

        while left < right:
            if s_list[left] not in "aeiouAEIOU":
                left += 1
            elif s_list[right] not in "aeiouAEIOU":
                right -= 1
            else:
                s_list[left], s_list[right] = s_list[right], s_list[left]
                left += 1
                right -= 1

        return "".join(s_list)
    
if __name__ == "__main__":
    solution = Solution()

    s1 = "hello"
    expected1 = "holle"
    assert solution.reverseVowels(s1) == expected1, f"Test 1 failed: Expected '{expected1}', got '{solution.reverseVowels(s1)}'"
        
