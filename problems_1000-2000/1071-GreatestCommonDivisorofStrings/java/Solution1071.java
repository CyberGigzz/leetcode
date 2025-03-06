public class Solution1071 {

    public String gcdOfStrings(String str1, String str2) {

        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        if (str1.equals(str2)) {
            return str1;
        }

        int a = str1.length();
        int b = str2.length();
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;   
        }
        int gcd = a;
        return str1.substring(0, gcd);

    }

    public static void main(String[] args) {
        Solution1071 solution = new Solution1071();

        String str1 = "ABCABC";
        String str2 = "ABC";

        System.out.println(solution.gcdOfStrings(str1, str2));
    }
}
