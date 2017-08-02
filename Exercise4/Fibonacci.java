package Exercise4;

public class Fibonacci {
	/*
	 * Fibo limited to 100 value but max result is 89.
	 */
	public static void main(String[] args) {
		for(int i=0; i<=100;i++) {
			if(Fibo(i)>100) {
				break;
			}
			System.out.println( "Iteration " + i+  " : " + Fibo(i));
		}
	}
	
	public static long Fibo(long n) {
		if(n<=1) return n;
		else return Fibo(n-1) + Fibo (n-2);	
	}
}
