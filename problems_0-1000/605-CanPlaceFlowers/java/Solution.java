class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int length = flowerbed.length;
        int i = 0;

        while (i < length && n > 0) {
            if (flowerbed[i] == 0) {
                boolean leftEmpty = (i == 0 || flowerbed[i - 1] == 0);
                boolean rightEmpty = (i == length - 1 || flowerbed[i + 1] == 0);

                if (leftEmpty && rightEmpty) {
                    flowerbed[i] = 1;
                    n--;
                    i++; // Skip the next plot, as it's now occupied
                }
            }
            i++;
        }

        return n <= 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;
        System.out.println(solution.canPlaceFlowers(flowerbed, n));
    }
}