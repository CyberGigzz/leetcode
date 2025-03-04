import java.util.Arrays;

public class Solution {
    
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int maxValue = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxValue) {
                maxValue = nums[i];
            }
        }

        int[] count = new int[maxValue + 1];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        for (int i = 1; i < maxValue + 1; i++) {
            count[i] += count[i - 1];
        }

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                result[i] = 0;
            } else {
                result[i] = count[nums[i] - 1];
            }
        }

        System.out.println(Arrays.toString(result));

        return result;
    }

    public static void main(String[] args) {
        
        Solution solution = new Solution();
        int[] nums = {8, 1, 2, 2, 3};
        // System.out.println(solution.smallerNumbersThanCurrent(nums));
        solution.smallerNumbersThanCurrent(nums);
    }
}

