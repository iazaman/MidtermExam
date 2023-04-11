package math.problems;

import java.util.Arrays;

public class PrimeNumber {

	public static void main(String[] args) {
		final int MAX = 1000000;
		boolean[] primes =new boolean[MAX+1];
		Arrays.fill(primes,true);
		primes[0] = false;
		primes[1] = false;
		for(int i = 2; i <= Math.sqrt(MAX); i++) {
			if(primes[i]){
				for (int j = i * i; j<=MAX; j +=i) {
					primes[j] = false;
				}
			}
		}
		int count = 0;
		for (int i = 2; i <=MAX; i++){
			if(primes[i]) {
				System.out.println(i + " ");
				count++;
			}
		}
		System.out.println("\nNumber or prime numbers: " + count);



	}

}
