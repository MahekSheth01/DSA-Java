package string;
public class Permutations {
    static void permute(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String left = str.substring(0, i);
            String right = str.substring(i + 1);
            String rest = left + right;
            permute(rest, ans + ch);
        }
    }

    public static void main(String[] args) {
        String s = "ABC";
        System.out.println("All permutations of " + s + " are:");
        permute(s, "");
    }
}
