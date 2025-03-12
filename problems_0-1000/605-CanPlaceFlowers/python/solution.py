class Solution:
    def canPlaceFlowers(self, flowerbed: list[int], n: int) -> bool:
        
        length = len(flowerbed)
        i = 0

        while i < length and n > 0:
            if flowerbed[i] == 0:
                left_empty = i == 0 or flowerbed[i-1] == 0
                right_empty = i == length - 1 or flowerbed[i+1] == 0
                if left_empty and right_empty:
                    flowerbed[i] = 1
                    n -= 1
                    i += 1 
            i += 1

        return n <= 0
    
if __name__ == '__main__':
    flowerbed = [1,0,0,0,1]
    n = 2
    s = Solution()
    print(s.canPlaceFlowers(flowerbed, n))