public class Solution1768 {
    
    public String mergeAlternately(String word1, String word2) {
     
        StringBuilder sb = new StringBuilder();

        int i = 0;
        int j = 0;

        while (i < word1.length() && j < word2.length()) {
            sb.append(word1.charAt(i++));
            sb.append(word2.charAt(j++));
        }

        while (i < word1.length()) {
            sb.append(word1.charAt(i++));
        }
        while (j < word2.length()) {
            sb.append(word2.charAt(j++));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Solution1768 solution = new Solution1768();

        String word1 = "abc";
        String word2 = "pqr";

        System.out.println(solution.mergeAlternately(word1, word2));
    }
}
