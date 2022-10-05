/**
 * This class calculates the processing time in nanoseconds of the Fibonicci function 
 *  .It calculates the time using  recursive and iterative methods
 *  .It displays the results from both methods on the console
 * @author Fatima Beyelhadj
 * 
 * @version 4.1
 * 
 *
 */
public class Fibonacci {
	/**
	 * This is the main method runs the argument. 
	 * It will call both fibonacciRecursion and
	 * fibonacciIterative methods. This will also calculate the time it took the
	 * processing This will run from 0 to 50 and print the results on the console
	 * 
	 * @param args Process the command line arguments
	 */
	public static void main(String[] args) {
		{
			int i = 0, n = 50;
			long start_time;
			long end_time;
			int timeDifferenceI = 0;
			int timeDifferenceR = 0;

			System.out.print("n\tIterative\tRecursive\n");
			System.out.print("===================================\n");

			for (i = 0; i <= n; i++) {
				start_time = System.nanoTime();
				fibonacciIterative(i);
				end_time = System.nanoTime();
				timeDifferenceI = (int) ((end_time - start_time) / 1e6);

				start_time = System.nanoTime();
				fibonacciRecursion(i);
				end_time = System.nanoTime();
				timeDifferenceR = (int) ((end_time - start_time) / 1e6);
				System.out.print(i + "\t\t" + timeDifferenceI + "\t\t" + timeDifferenceR + "\t\n");
			}
		}
	}

	/**
	 * This constructor use Fibonacci iterative method to calculate the value of an
	 * integer
	 * 
	 * @param n integer to be processed
	 * @return The result of the calculation
	 */

	public static int fibonacciRecursion(int n) {
		if (n <= 1) {
			return 1;
		} else {
			return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
		}
	}
/**
 * This constructor uses Fibonacci recursive method to calculate the value of an
 * Integer
 * @param v integer to be processed
 * @return the result of the calculation
 */
	

	public static int fibonacciIterative(int v) {
		int n = 0;
		int first = 0;
		int second = 1;
		int next = 0;
		for (int i = 0; i <= n; i++)
			next = first + second;
		first = second;
		second = next;
		return next;
	}
}
