class Solution:
    def kidsWithCandies(self, candies: list[int], extraCandies: int) -> list[bool]:
        max_candies = max(candies)
        return [candy + extraCandies >= max_candies for candy in candies]


if __name__ == "__main__":
    candies = [2, 3, 5, 1, 3]
    extraCandies = 3
    print(Solution().kidsWithCandies(candies, extraCandies))