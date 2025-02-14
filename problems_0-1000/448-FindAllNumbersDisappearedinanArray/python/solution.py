class Solution:
    def findDisappearedNumbers(self, nums: list[int]) -> list[int]:
        set_nums = set(nums)
        list = []
        for i in range(1, len(nums) + 1):
            if i not in set_nums:
                list.append(i)
        return list

if __name__ == "__main__":
    solution = Solution()
    nums = [4,3,2,7,8,2,3,1]
    print(solution.findDisappearedNumbers(nums))
