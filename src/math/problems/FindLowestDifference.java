package math.problems;

public class FindLowestDifference {

    private static Object Assert;

    public static void main(String[] args) {
        int[] array1 = {3, 12, 5, 9, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};

        int minDiff = findMinDifference(array1, array2);
    }


    public static int findMinDifference(int[] array1, int[] array2) {


        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                int diff = Math.abs(array1[i] - array2[j]);
                if (diff < minDiff) {
                    minDiff = diff;
                }
            }
        }
        System.out.println(minDiff);

        return minDiff;

    }
}




