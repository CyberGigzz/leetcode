class Solution:
    def smallerNumbersThanCurrent(self, nums: list[int]) -> list[int]:
        max_val = max(nums)
        count = [0] * (max_val + 1)
        for num in nums:
            count[num] += 1
        for i in range(1, max_val + 1):
            count[i] += count[i - 1]
        result = []
        for num in nums:
            if num == 0:
                result.append(0)
            else:
                result.append(count[num - 1])
        return result
        
if __name__ == '__main__':
    nums = [8,1,2,2,3]
    s = Solution()
    print(s.smallerNumbersThanCurrent(nums))