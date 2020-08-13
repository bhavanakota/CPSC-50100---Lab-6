
public class Exercise2 {

	public static void main(String[] args) {

		/*
		 * Find the time complexity of the following Java method:
		 * int foo(int N) {
		 * int result = 0;
		 * for (int i=0; i<N; i++)
		 * result++;
		 * for (int j=0; j<1000000; j++) result+=j;
		 * return result;
		 */ 	}

	/*
	 * The first loop is size N will be O(N) and the time complexity of the second
	 * loop is of size 1000000 so then the complexity will be only O(N) since it's
	 * only dependent on the first loop since N is greater than 1000000.
	 */

}
