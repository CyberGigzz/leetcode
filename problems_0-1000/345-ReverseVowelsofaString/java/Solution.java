
public class Solution {
    
    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if ("aeiouAEIOU".indexOf(chars[i]) == -1) {
                i++;
                continue;
            }
            if ("aeiouAEIOU".indexOf(chars[j]) == -1) { 
                j--;
                continue;
            }
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverseVowels("hello")); // "holle"
        System.out.println(solution.reverseVowels("leetcode")); // "leotcede"
    }
}
