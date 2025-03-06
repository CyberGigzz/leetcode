from typing import List

class Solution:
    def reverseString(self, s: List[str]) -> None:
        left, right = 0, len(s) - 1
        while left < right:
            s[left], s[right] = s[right], s[left]
            left += 1
            right -= 1
        

if __name__ == "__main__":
    example_string = ["h", "e", "l", "l", "o"]
    s = Solution()
    
    # Call the reverseString method to modify the list in-place
    s.reverseString(example_string)
    
    # Print the modified list
    print(example_string)  # Output: ['o', 'l', 'l', 'e', 'h']