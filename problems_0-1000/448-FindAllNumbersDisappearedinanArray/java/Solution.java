import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    
    public List<Integer> findDisappearedNumbers(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(i + 1);
        }
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            }
        }
        return new ArrayList<>(set);
    } 

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        Solution solution = new Solution();
        List<Integer> result = solution.findDisappearedNumbers(nums);
        System.out.println(result);

    }
}
