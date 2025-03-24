class Solution:
    def moveZeroes(self, nums: list[int]) -> None:
        nonZeroPtr = 0
        currentPtr = 0
        while currentPtr < len(nums):
            if nums[currentPtr] != 0:
                nums[currentPtr], nums[nonZeroPtr] = nums[nonZeroPtr], nums[currentPtr] 
                nonZeroPtr += 1
            currentPtr += 1
    
solution = Solution()
nums = [0, 1, 0, 3, 12]
solution.moveZeroes(nums)
print(nums)