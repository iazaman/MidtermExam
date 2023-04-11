package string.problems;

public class Permutation {

    public static void main(String[] args) {
        String str = "ABC";
        computePermutations(str, "");
    }

    public static void computePermutations(String str, String prefix) {
        int n = str.length();
        if (n==0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < n; i++){
                computePermutations(str.substring(0,i) + str.substring(i + 1), prefix + str.charAt(i));
            }
        }
    }

}
