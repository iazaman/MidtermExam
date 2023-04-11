package math.problems;

public class FindMissingNumber {

    public static void main(String[] args) {

         int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
         int missingNumber= findMissingNumber(array); 

    }

    private static int findMissingNumber(int[] array) {
        int n = array.length +1;
        int sum = (n* (n+1))/2;
        int actualSum = 0;

        for(int i=0; i< array.length; i++){
            actualSum +=array[i];
        }
        int missingNumber = sum - actualSum;
        return missingNumber;


    }
}
