package math.problems;

public class Pattern {

	public static void main(String[] args) {
		int n=100;
		int step = 1;
		while (n>=32) {
			System.out.println(n + ",");
			n-= step;
			step++;
			if(step==3){
				step =2;
			}
		}
		


	}
}
