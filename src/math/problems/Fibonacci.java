package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
        int num1 =0;
        int num2 =1;
        int count =40;
        System.out.println(num1+ "," + num2);

        for (int i =2; i < count; i++){
            int sum = num1 + num2;
            System.out.println(", " + sum);
            num1 = num2;
            num2 = sum;
        }



    }
}
