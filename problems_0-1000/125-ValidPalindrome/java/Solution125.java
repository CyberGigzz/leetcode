
public class Solution125 {
    
    public Boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        String filteredString = sb.toString();
        int left = 0;
        int right = filteredString.length() - 1;
        while (left < right) {
            if (filteredString.charAt(left) != filteredString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        
        Solution125 solution = new Solution125();
        solution.isPalindrome("A man, a plan, a canal: Panama");
    }
}
