
/* Write the simplest Java method that would have 𝑂(𝑁3) time complexity,
 * where 𝑁 is the single input parameter to the method.
 */
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Enter a value for n that's inputted into method complexity 
		System.out.print("Enter a value for n: ");
		int n = scan.nextInt();
		complexity(n);
		
		scan.close();
	}

	public static void complexity(int n) {
		// Creating the triple nested loops to form O(n^3)
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				for (int k = 1; k <= n; k++) {
					// Prints out the values for O(n), O(n^2), and O(n^3)
					System.out.println("O(n) = " + i + " O(n^2) = " + j + " O(n^3) = " + k);
				}
			}
		}
	}
}
