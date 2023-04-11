package math.problems;

public class MakePyramid {
    public static void main(String[] args) {
        int length = 9;
        int width = 9;
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= width; j++) {
                if (i == 1 || i == 9) {
                    if (j == 5) {
                        System.out.println("*");

                    } else {
                        System.out.println(" ");
                    }


                }
                if (i == 2 || i == 8) {
                    if (j == 4 || j == 5 || j == 6) {
                        System.out.println("*");
                    } else {
                        System.out.println(" ");
                    }

                }
                if (i == 3 || i == 7) {
                    if (j == 1 || j == 2 || j == 8 || j == 9) {
                        System.out.println(" ");
                    } else {
                        System.out.println("*");
                    }
                }
                if (i == 4 || i == 6) {
                    if (j == 1 || j == 9) {
                        System.out.println(" ");
                    } else {
                        System.out.println("*");
                    }
                }
                System.out.println("\n");



            }
        }
    }
}
