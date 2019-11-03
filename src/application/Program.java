package application;

public class Program {

	public static void main(String[] args) {

		int fib[] = new int[11];
		fib[0] = 0;
		fib[1] = 1;
		
		for ( int i = fib[0]; i < fib.length; i++ ) {
			if ( i > 1 ) {
				fib[i] = fib[i-1] + fib[i-2];
				System.out.print(fib[i] + " ");
			}
			else {
				System.out.print(fib[i] + " ");
			}
		}
	}

}
