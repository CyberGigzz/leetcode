import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max_candies = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max_candies) {
                max_candies = candies[i];
            }
        }

        List<Boolean> result = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max_candies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    } 

    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        Solution solution = new Solution();
        System.out.println(solution.kidsWithCandies(candies, extraCandies));
    }
}