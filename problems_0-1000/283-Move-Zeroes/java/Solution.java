public class Solution {

    public void moveZeroes(int[] nums) {
        int nonZeroPtr = 0;
        int currentPtr = 0;
        while (currentPtr < nums.length) {
            if (nums[currentPtr] != 0) {
                int temp = nums[nonZeroPtr];
                nums[nonZeroPtr] = nums[currentPtr];
                nums[currentPtr] = temp;
                nonZeroPtr++;
            }
            
            currentPtr++;            
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{0, 1, 0, 3, 12};
        solution.moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
