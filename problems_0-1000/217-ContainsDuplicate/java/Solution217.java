import java.util.HashSet;
import java.util.Set;

public class Solution217 {

    public boolean containtDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        
        return false;
    }

    public static void main(String[] args) {
        Solution217 solution = new Solution217();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(solution.containtDuplicate(array));
    }
}
