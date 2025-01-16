import java.util.ArrayList;
import java.util.List;

public class Solution {
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> result = solution.fizzBuzz(3);
        for (String s : result) {
            System.out.println(s);
        }
    }

    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }
        return result;
    }
}
