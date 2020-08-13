
public class Exercise3 {

	public static void main(String[] args) {
		
		/* 
		 * Find the time complexity of the following Java method:
		 * int bar(int N) {
		 * int result = 1;
		 * for (int i=1; i<N; i*=2)
		 * result+=2;
		 *   return result;
		 *   }
		 */

		/*
		 * i *= 2 means i = i*2
		 * If we assume that i >= N then i = 2^k which is 2^k >= N which means k = log2(N)
		 * This complexity would be then O(log N)
		 */
	}

}
