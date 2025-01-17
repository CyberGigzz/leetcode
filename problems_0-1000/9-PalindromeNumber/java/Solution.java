
public class Solution {
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome(2332));
    }

    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        
        int reversedHalf = 0;
        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x = x / 10;
        }

        return x == reversedHalf || x == reversedHalf / 10;

    }
}
