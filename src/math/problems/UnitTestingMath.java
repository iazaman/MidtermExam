package math.problems;
import static

public class UnitTestingMath {
    private static Object Assert;

    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.
        //Factorial

        System.out.println("Testing Factorial");
        Assert.assertEquals(Factorial.factorial(5), 120);
        Assert.assertEquals(Factorial.factorialResursion(3), 120);
        Assert.assertEquals(Factorial.factorialIteration(8), 40320);
        System.out.println("Factorial tests passed. ");

        //Fibonacci

        System.out.println("\nTesting Fibonacci");
        int[] fib1 = {0, 1, 1, 2, 3 };
        int[] fib2 = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610,610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986 };
        Assert.assertEquals(Fibonacci.fibonacci(5), fib1);
        System.out.println("Fibonacci tests passed.  ");

        //LowestDifference

        System.out.println("\nTesting LowestDifference");
        int expectedNum = 1;
        Assert.assertEquals(expectedNum, mi )


        //MissingNumber
        System.out.println("\nTesting MissingNumber");
        int[] miss1 = {10, 2, 9, 4, 5, 3, 1, 8, 6};
        int[] miss2 = {10, 2, 7, 4, 5, 3, 1, 8, 6};
        int[] miss3 = {10, 2, 7, 4, 5, 7, 1, 1, 8, 6};

        Assert.assertEquals(FindMissingNumber.a(miss1), 7);
        Assert.assertEquals(FindMissingNumber.missingNumber(miss2), 9);
        Assert.assertEquals(FindMissingNumber.missingNumber(miss3), 3);

        //Lowest Number
        System.out.println("\nTesting LowestNumber ");
        int low1[] ={5,3,1};
        int low2[] ={5,3,2};
        Assert.assertEquals(LowestNumber.lowest(low1), 1);
        Assert.assertEquals(LowestNumber.lowest(low2), 2);
        System.out.println("LowestNumber test passed");

        //Prime Number

        System.out.println("\nTesting PrimeNumber");
        int[] primes









    }
}
